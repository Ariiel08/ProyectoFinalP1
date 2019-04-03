package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logic.Administracion;
import logic.Equipo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionarLesiones extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static JTable table;
	public static DefaultTableModel model;
	public static Object[] fila;
	private int index = 0;
	private static JComboBox cbxEquipos;
	private ArrayList<String> NombresEquipos = new ArrayList<String>();
	private JButton btnRecuperacion;
	private JButton okButton;
	private JButton btnHistorialDeLesiones;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public GestionarLesiones() {
		setBounds(100, 100, 823, 408);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Seleccione Equipo");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNewLabel.setBounds(10, 22, 148, 14);
			panel.add(lblNewLabel);
			
			
			for (Equipo aux : Administracion.getInstancia().getMisEquipos()) {
				NombresEquipos.add(aux.getNombre());
			}
			
			cbxEquipos = new JComboBox(NombresEquipos.toArray());
			cbxEquipos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					loadtable();
				}
			});
			cbxEquipos.setBounds(127, 16, 127, 25);
			panel.add(cbxEquipos);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 67, 777, 245);
			panel.add(scrollPane);
			
			
			
			String[] header = {"Nombre", "Posición", "Estado", "Tipo de lesion", "Dias de reposo"};
			model = new DefaultTableModel();
			model.setColumnIdentifiers(header);
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(table.getSelectedRow()>= 0) {
						index = table.getSelectedRow();
						btnHistorialDeLesiones.setEnabled(true);
						btnRecuperacion.setEnabled(true);
						okButton.setEnabled(true);
					}

				}
			});
			table.setModel(model);
			scrollPane.setViewportView(table);
			loadtable();
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			btnHistorialDeLesiones = new JButton("Historial de Lesiones");
			btnHistorialDeLesiones.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(index).getMisLesiones().isEmpty()) {
						JOptionPane.showMessageDialog(null, "El jugador nunca a sufrido una lesion");
					}
					else {
						HistorialLesiones HL = new HistorialLesiones(index, cbxEquipos.getSelectedIndex());
						HL.setModal(true);
						HL.setVisible(true);
					}
				}
			});
			btnHistorialDeLesiones.setEnabled(false);
			buttonPane.add(btnHistorialDeLesiones);
			
			btnRecuperacion = new JButton("Recuperacion");
			btnRecuperacion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int check = JOptionPane.showConfirmDialog(null, "¿El jugador se recupero?", "Aviso", JOptionPane.WARNING_MESSAGE);
					if(check == JOptionPane.OK_OPTION) {
						Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(index).setMiLesion(null);
						Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(index).setEstado(true);
						loadtable();
					}
				}
			});
			btnRecuperacion.setEnabled(false);
			buttonPane.add(btnRecuperacion);
			{
				okButton = new JButton("Registrar Lesion");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(index).isEstado() == false) {
							JOptionPane.showMessageDialog(null, "El jugador ya se encuentra lesionado");
						}
						else {
							RegLesion rl = new RegLesion(index, cbxEquipos.getSelectedIndex());
							rl.setModal(true);
							rl.setVisible(true);
							loadtable();
						}
					}
				});
				okButton.setEnabled(false);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}


	private void loadtable() {
		// TODO Auto-generated method stub
		model.setRowCount(0);
		
		fila = new Object[model.getColumnCount()];
			for (int i = 0; i < Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().size(); i++) {
				fila[0] = Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(i).getNombre();
				fila[1] = Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(i).getPosicion();
				if(Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(i).isEstado() == true) {
					fila[2] = "En Forma";
				}
				else{
					fila[2] = "Lesionado";
				}
				fila[3] = Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(i).getMiLesion().getTipoLesion();
				fila[4] = Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(i).getMiLesion().getDiasRec();
				
				Renderer edit = new Renderer();
				table.setDefaultRenderer(Object.class, edit);
				model.addRow(fila);
		}
		
	}
}
