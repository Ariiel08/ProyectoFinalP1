package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import logic.Administracion;
import logic.Equipo;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListJugadores extends JDialog {

	
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private ArrayList<String> NombresEquipos = new ArrayList<String>();
	public static JComboBox cbxEquipos;
	public static DefaultTableModel model;
	public static Object[] fila;
	private int index = 0;
	private JButton btnVerJugador;
	private JButton btnEliminar;
 	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 */
	public ListJugadores() {
		setResizable(false);
		setTitle("Lista de Jugadores");
		
		setBounds(100, 100, 909, 521);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 50, 871, 380);
			panel.add(scrollPane);
			
			String[] header = {"Nombre", "Posici�n", "Pais de Origen", "Altura"};
			model = new DefaultTableModel();
			model.setColumnIdentifiers(header);
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(table.getSelectedRow()>=0) {
						btnVerJugador.setEnabled(true);
						btnEliminar.setEnabled(true);
						index = table.getSelectedRow();
					}
				}
			});
			table.setModel(model);
			scrollPane.setViewportView(table);
			
			
			JLabel lblJugadoresPorEquipo = new JLabel("Jugadores por equipo:");
			lblJugadoresPorEquipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblJugadoresPorEquipo.setBounds(10, 20, 156, 14);
			panel.add(lblJugadoresPorEquipo);
			
			
			for (Equipo aux : Administracion.getInstancia().getMisEquipos()) {
				NombresEquipos.add(aux.getNombre());
			}
			
			cbxEquipos = new JComboBox(NombresEquipos.toArray());
			cbxEquipos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					loadTable();
				}
			});
			cbxEquipos.setFont(new Font("Tahoma", Font.PLAIN, 11));
			cbxEquipos.setBounds(124, 14, 156, 25);
			panel.add(cbxEquipos);
			
			loadTable();
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnVerJugador = new JButton("Ver Jugador");
				btnVerJugador.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						VerJugador vj = new VerJugador(index, cbxEquipos.getSelectedIndex());
						vj.setModal(true);
						vj.setVisible(true);
						loadTable();
					}
				});
				
				btnEliminar = new JButton("Eliminar");
				btnEliminar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int input = JOptionPane.showConfirmDialog(null, "�Seguro que desea eliminar el jugador?","Confirmaci�n",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
						
						if(input == 0) {
							Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().remove(index);
							Administracion.getInstancia().Guardar(Administracion.getInstancia());
							JOptionPane.showMessageDialog(null, "El jugador ha sido eliminado.","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
							loadTable();
						}
					}
				});
				btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 11));
				buttonPane.add(btnEliminar);
				btnVerJugador.setFont(new Font("Tahoma", Font.PLAIN, 11));
				btnEliminar.setEnabled(false);
				btnVerJugador.setEnabled(false);
				btnVerJugador.setActionCommand("OK");
				buttonPane.add(btnVerJugador);
				getRootPane().setDefaultButton(btnVerJugador);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}


	public static void loadTable() {
		model.setRowCount(0);
		
		fila = new Object[model.getColumnCount()];
		for (int i = 0; i < Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().size(); i++) {
			fila[0] = Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(i).getNombre();
			fila[1] = Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(i).getPosicion();
			fila[2] =  Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(i).getPaisOrigen();
			fila[3] =  Administracion.getInstancia().getMisEquipos().get(cbxEquipos.getSelectedIndex()).getJugadores().get(i).getAltura() + "'";
			
			model.addRow(fila);
		}
		
	}
}