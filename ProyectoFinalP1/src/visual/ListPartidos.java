package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import logic.Administracion;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListPartidos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;public static DefaultTableModel model;
	public static Object[] fila;
	private static DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	private JButton btnEliminar;
	private int index;
	
	public ListPartidos() {
		setTitle("Lista de partidos");
		setBounds(100, 100, 688, 391);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane, BorderLayout.CENTER);
			{
				
				String[] header = {"Local", "Visitante","Estadio", "Hora", "Fecha"};
				model = new DefaultTableModel();
				model.setColumnIdentifiers(header);
				table = new JTable();
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						btnEliminar.setEnabled(true);
						index = table.getSelectedRow();
					}
				});
				table.setModel(model);
				scrollPane.setViewportView(table);
				loadTable();
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnEliminar = new JButton("Eliminar");
				btnEliminar.setEnabled(false);
				btnEliminar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(Administracion.getInstancia().getMisPartidos().size() != 0) {
							Administracion.getInstancia().getMisPartidos().remove(index);
						}
						else {
							JOptionPane.showMessageDialog(null, "No has seleccionado un partido.","Aviso",JOptionPane.WARNING_MESSAGE);
						}
					}
				});
				btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 11));
				btnEliminar.setActionCommand("OK");
				buttonPane.add(btnEliminar);
				getRootPane().setDefaultButton(btnEliminar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 11));
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
	
	public static void loadTable() {
		model.setRowCount(0);
		Date date;
		String fecha;
		
		fila = new Object[model.getColumnCount()];
		for (int i = 0; i < Administracion.getInstancia().getMisPartidos().size(); i++) {
			fila[0] = Administracion.getInstancia().getMisPartidos().get(i).getLocal().getNombre();
			fila[1] = Administracion.getInstancia().getMisPartidos().get(i).getVisitante().getNombre();
			fila[2] =  Administracion.getInstancia().getMisPartidos().get(i).getEstadio();
			fila[3] =  Administracion.getInstancia().getMisPartidos().get(i).getHora();
			
			date = Administracion.getInstancia().getMisPartidos().get(i).getFecha();
			fecha = format.format(date);
			
			fila[4] =  fecha;
			
			model.addRow(fila);
		}
		
	}

}