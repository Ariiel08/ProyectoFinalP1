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

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class HistorialLesiones extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	public static DefaultTableModel model;
	public static Object[] fila;
	private static int MiJugador;
	private static int MiEquipo;
	private JLabel lblNombre;
	private JLabel lblEdad;
	private JLabel lblPos;
	private JLabel lblEquipo;
	private JLabel lblNombre_1;
	private JLabel lblEdad_1;
	private JLabel lblPosicin;
	private JLabel lblEquipo_1;


	public HistorialLesiones(int i, int e) {
		MiJugador = i;
		MiEquipo = e;
		setTitle("Historial de Lesiones");
		setBounds(100, 100, 556, 350);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Lesiones de pasadas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 78, 506, 175);
			panel.add(scrollPane);
			
			String[] header = {"Tipo", "Atendido Por", "Dias de Reposo", "Fecha"};
			model = new DefaultTableModel();
			model.setColumnIdentifiers(header);
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					
				}
			});
			table.setModel(model);
			scrollPane.setViewportView(table);
			loadtable();
			{
				lblNombre = new JLabel("");
				lblNombre.setBounds(72, 28, 88, 16);
				panel.add(lblNombre);
			}
			{
				lblEdad = new JLabel("");
				lblEdad.setBounds(72, 50, 123, 16);
				panel.add(lblEdad);
			}
			{
				lblPos = new JLabel("");
				lblPos.setBounds(382, 28, 93, 16);
				panel.add(lblPos);
			}
			{
				lblEquipo = new JLabel("");
				lblEquipo.setBounds(382, 50, 93, 16);
				panel.add(lblEquipo);
			}
			
			lblNombre.setText(Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugadores().get(MiJugador).getNombre());
			lblEdad.setText(String.valueOf(Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugadores().get(MiJugador).getEdad()));
			lblPos.setText(Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugadores().get(MiJugador).getPosicion());
			lblEquipo.setText(Administracion.getInstancia().getMisEquipos().get(MiEquipo).getNombre());
			{
				lblNombre_1 = new JLabel("Nombre:");
				lblNombre_1.setBounds(12, 28, 55, 16);
				panel.add(lblNombre_1);
			}
			{
				lblEdad_1 = new JLabel("Edad:");
				lblEdad_1.setBounds(12, 50, 55, 16);
				panel.add(lblEdad_1);
			}
			{
				lblPosicin = new JLabel("Posici\u00F3n:");
				lblPosicin.setBounds(315, 28, 55, 16);
				panel.add(lblPosicin);
			}
			{
				lblEquipo_1 = new JLabel("Equipo:");
				lblEquipo_1.setBounds(315, 50, 55, 16);
				panel.add(lblEquipo_1);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cerrar");
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


	private void loadtable() {
		
		model.setRowCount(0);
		
		fila = new Object[model.getColumnCount()];
		
		for (int i = 0; i < Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugadores().get(MiJugador).getMisLesiones().size(); i++) {
			fila[0] = Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugadores().get(MiJugador).getMisLesiones().get(i).getTipoLesion();
			fila[1] = Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugadores().get(MiJugador).getMisLesiones().get(i).getAtendNombre();
			fila[2] = Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugadores().get(MiJugador).getMisLesiones().get(i).getDiasRec() + " Dias";
			fila[3] = Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugadores().get(MiJugador).getMisLesiones().get(i).getFechaLesion();
			
			model.addRow(fila);
		}
		
	}
}
