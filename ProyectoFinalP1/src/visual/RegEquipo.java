package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import logic.Administracion;
import logic.Equipo;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.BevelBorder;

public class RegEquipo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtProvincia;
	private JTextField txtEstadio;
	private JTextField txtManager;

	public RegEquipo() {
		setResizable(false);
		setTitle("Registrar Equipo");
		setBounds(100, 100, 483, 206);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos del equipo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNombre.setBounds(12, 32, 46, 14);
			panel.add(lblNombre);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(68, 29, 140, 20);
			panel.add(txtNombre);
			txtNombre.setColumns(10);
			
			JLabel lblProvincia = new JLabel("Provincia:");
			lblProvincia.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblProvincia.setBounds(235, 32, 62, 14);
			panel.add(lblProvincia);
			
			txtProvincia = new JTextField();
			txtProvincia.setBounds(307, 29, 140, 20);
			panel.add(txtProvincia);
			txtProvincia.setColumns(10);
			
			JLabel lblEstadio = new JLabel("Estadio:");
			lblEstadio.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblEstadio.setBounds(12, 78, 46, 14);
			panel.add(lblEstadio);
			
			txtEstadio = new JTextField();
			txtEstadio.setBounds(68, 75, 140, 20);
			panel.add(txtEstadio);
			txtEstadio.setColumns(10);
			
			JLabel lblManager = new JLabel("Manager:");
			lblManager.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblManager.setBounds(235, 78, 46, 14);
			panel.add(lblManager);
			
			txtManager = new JTextField();
			txtManager.setBounds(307, 75, 140, 20);
			panel.add(txtManager);
			txtManager.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String nombre = txtNombre.getText();
						String estadio = txtEstadio.getText();
						String provincia = txtProvincia.getText();
						String manager = txtManager.getText();
						if(!nombre.equalsIgnoreCase("") && !estadio.equalsIgnoreCase("") && !provincia.equalsIgnoreCase("")) {
							Equipo aux = new Equipo(nombre, provincia, estadio, 0, 0, 0, 0, manager);
							Administracion.getInstancia().insertarEquipo(aux);
							Administracion.getInstancia().Guardar(Administracion.getInstancia());
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "Por favor revisar los datos", "Aviso", JOptionPane.WARNING_MESSAGE);
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
