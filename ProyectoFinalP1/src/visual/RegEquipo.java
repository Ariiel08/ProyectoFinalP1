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

public class RegEquipo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtProvincia;
	private JTextField txtEstadio;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the dialog.
	 */
	public RegEquipo() {
		setTitle("Registrar Equipo");
		setBounds(100, 100, 531, 206);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos del equipo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNombre = new JLabel("Nombre");
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNombre.setBounds(12, 32, 46, 14);
			panel.add(lblNombre);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(68, 29, 140, 20);
			panel.add(txtNombre);
			txtNombre.setColumns(10);
			
			JLabel lblProvincia = new JLabel("Provincia");
			lblProvincia.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblProvincia.setBounds(235, 32, 62, 14);
			panel.add(lblProvincia);
			
			txtProvincia = new JTextField();
			txtProvincia.setBounds(307, 29, 140, 20);
			panel.add(txtProvincia);
			txtProvincia.setColumns(10);
			
			JLabel lblEstadio = new JLabel("Estadio");
			lblEstadio.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblEstadio.setBounds(12, 78, 46, 14);
			panel.add(lblEstadio);
			
			txtEstadio = new JTextField();
			txtEstadio.setBounds(68, 75, 140, 20);
			panel.add(txtEstadio);
			txtEstadio.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String nombre = txtNombre.getText();
						String estadio = txtEstadio.getText();
						String provincia = txtProvincia.getText();
						if(!nombre.equalsIgnoreCase("") && !estadio.equalsIgnoreCase("") && !provincia.equalsIgnoreCase("")) {
							Equipo aux = new Equipo(nombre, provincia, estadio, 0, 0, 0, 0);
							Administracion.getInstancia().insertarEquipo(aux);
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
