package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import logic.Administracion;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerEquipo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	public static DefaultTableModel model;
	public static Object[] fila;
	private int index = 0;
	private static int MiEquipo;
	private JLabel lblFotoEstadio;
	private JLabel lblNombre;
	private JLabel lblManager;
	private JLabel lblEstadio;
	private JLabel lblCampeonatos;
	private JLabel lblJuegosGanados;
	private JLabel lblJuegosPerdidos;
	private JLabel lblCantidadLesionados;
	private JLabel labelJuegosJugados;
	private JLabel lblWR;
	private JLabel lblNombreEquipo;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public VerEquipo(int e) {
		MiEquipo = e;
		setTitle("Interfaz de Equipo");
		setBounds(100, 100, 919, 504);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(10, 11, 133, 102);
			panel.add(panel_1);
			panel_1.setLayout(new BorderLayout(0, 0));
			
			JLabel LogoEquipo = new JLabel("");
			panel_1.add(LogoEquipo, BorderLayout.CENTER);
			
			lblNombreEquipo = new JLabel("");
			lblNombreEquipo.setFont(new Font("Leelawadee", Font.BOLD, 17));
			lblNombreEquipo.setBounds(167, 38, 290, 51);
			panel.add(lblNombreEquipo);
			
			lblNombreEquipo.setText(Administracion.getInstancia().getMisEquipos().get(MiEquipo).getNombre());
			
			JPanel panel_2 = new JPanel();
			panel_2.setBounds(709, 11, 174, 400);
			panel.add(panel_2);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBounds(10, 138, 667, 270);
			panel.add(panel_3);
			panel_3.setLayout(null);
			
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(0, 0, 667, 270);
			panel_3.add(tabbedPane);
			
			JPanel Panelinformacion = new JPanel();
			tabbedPane.addTab("Informacion", null, Panelinformacion, null);
			Panelinformacion.setLayout(null);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBounds(12, 13, 638, 216);
			Panelinformacion.add(panel_4);
			panel_4.setLayout(null);
			
			JLabel labelManager = new JLabel("Manager:");
			labelManager.setFont(new Font("Dialog", Font.BOLD, 15));
			labelManager.setBounds(12, 85, 113, 45);
			panel_4.add(labelManager);
			
			JLabel labelEstadio = new JLabel("Estadio:");
			labelEstadio.setFont(new Font("Dialog", Font.BOLD, 15));
			labelEstadio.setBounds(12, 150, 113, 45);
			panel_4.add(labelEstadio);
			
			JLabel labelNombre = new JLabel("Nombre:");
			labelNombre.setFont(new Font("Dialog", Font.BOLD, 15));
			labelNombre.setBounds(12, 20, 113, 45);
			panel_4.add(labelNombre);
			
			Label label = new Label("Campeonatos:");
			label.setFont(new Font("Dialog", Font.BOLD, 15));
			label.setBounds(356, 20, 111, 45);
			panel_4.add(label);
			
			Panel panel_5 = new Panel();
			panel_5.setBounds(356, 71, 200, 124);
			panel_4.add(panel_5);
			panel_5.setLayout(new BorderLayout(0, 0));
			
			lblFotoEstadio = new JLabel("");
			panel_5.add(lblFotoEstadio, BorderLayout.CENTER);
			
			lblNombre = new JLabel("");
			lblNombre.setFont(new Font("Dialog", Font.BOLD, 15));
			lblNombre.setBounds(115, 20, 213, 45);
			panel_4.add(lblNombre);
			
			lblManager = new JLabel("");
			lblManager.setFont(new Font("Dialog", Font.BOLD, 15));
			lblManager.setBounds(115, 85, 213, 45);
			panel_4.add(lblManager);
			
			lblEstadio = new JLabel("");
			lblEstadio.setFont(new Font("Dialog", Font.BOLD, 15));
			lblEstadio.setBounds(115, 150, 213, 45);
			panel_4.add(lblEstadio);
			
			lblCampeonatos = new JLabel("");
			lblCampeonatos.setFont(new Font("Dialog", Font.BOLD, 15));
			lblCampeonatos.setBounds(473, 20, 99, 45);
			panel_4.add(lblCampeonatos);
			
			lblNombre.setText(Administracion.getInstancia().getMisEquipos().get(MiEquipo).getNombre());
			lblManager.setText(Administracion.getInstancia().getMisEquipos().get(MiEquipo).getManager());
			lblEstadio.setText(Administracion.getInstancia().getMisEquipos().get(MiEquipo).getEstadio());
			lblCampeonatos.setText((String.valueOf(Administracion.getInstancia().getMisEquipos().get(MiEquipo).getCampeonatos())));
			
			JPanel PanelRoster = new JPanel();
			tabbedPane.addTab("Roster del Equipo", null, PanelRoster, null);
			PanelRoster.setLayout(new BorderLayout(0, 0));
			
			JScrollPane scrollPane = new JScrollPane();
			PanelRoster.add(scrollPane, BorderLayout.CENTER);
			
			
			String[] header = {"Nombre", "Pocision", "Pais de Origen", "Edad"};
			model = new DefaultTableModel();
			model.setColumnIdentifiers(header);
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// HABILITAR BOTON 
					index = table.getSelectedRow();
				}
			});
			table.setModel(model);
			scrollPane.setViewportView(table);
			
			loadTable();
			
			JPanel PanelEstadistica = new JPanel();
			tabbedPane.addTab("Estadisticas del Equipo", null, PanelEstadistica, null);
			PanelEstadistica.setLayout(null);
			
			JLabel lblJuegosJugados = new JLabel("Juegos Jugados:");
			lblJuegosJugados.setFont(new Font("Dialog", Font.BOLD, 15));
			lblJuegosJugados.setBounds(417, 53, 184, 41);
			PanelEstadistica.add(lblJuegosJugados);
			
			JLabel labelWR = new JLabel("Winrate del Equipo:");
			labelWR.setFont(new Font("Dialog", Font.BOLD, 15));
			labelWR.setBounds(417, 147, 184, 41);
			PanelEstadistica.add(labelWR);
			
			JLabel labelJuegosGanados = new JLabel("Juegos Ganados:");
			labelJuegosGanados.setFont(new Font("Dialog", Font.BOLD, 15));
			labelJuegosGanados.setBounds(12, 29, 184, 41);
			PanelEstadistica.add(labelJuegosGanados);
			
			JLabel labelJuegosPerdidos = new JLabel("Juegos Perdidos:");
			labelJuegosPerdidos.setFont(new Font("Dialog", Font.BOLD, 15));
			labelJuegosPerdidos.setBounds(12, 99, 184, 41);
			PanelEstadistica.add(labelJuegosPerdidos);
			
			JLabel labelCLT = new JLabel("Cantidad de lesionados en la temporada:");
			labelCLT.setFont(new Font("Dialog", Font.BOLD, 15));
			labelCLT.setBounds(12, 169, 301, 41);
			PanelEstadistica.add(labelCLT);
			
			lblJuegosGanados = new JLabel("");
			lblJuegosGanados.setBounds(158, 29, 96, 41);
			PanelEstadistica.add(lblJuegosGanados);
			
			lblJuegosPerdidos = new JLabel("");
			lblJuegosPerdidos.setBounds(158, 99, 96, 41);
			PanelEstadistica.add(lblJuegosPerdidos);
			
			lblCantidadLesionados = new JLabel("");
			lblCantidadLesionados.setBounds(319, 169, 96, 41);
			PanelEstadistica.add(lblCantidadLesionados);
			
			labelJuegosJugados = new JLabel("");
			labelJuegosJugados.setBounds(554, 53, 96, 41);
			PanelEstadistica.add(labelJuegosJugados);
			
			lblWR = new JLabel("");
			lblWR.setBounds(566, 147, 85, 41);
			PanelEstadistica.add(lblWR);
			
			lblJuegosGanados.setText(String.valueOf(Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugGanados()));
			lblJuegosPerdidos.setText(String.valueOf(Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugPerdidos()));
			lblCantidadLesionados.setText("0");
			labelJuegosJugados.setText(String.valueOf(Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugJugados()));
			
			int victorias = Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugGanados();
			int derrotas = Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugPerdidos();

			if(victorias == 0 && derrotas == 0) {
				lblWR.setText("0 %");
			}
			else if(victorias != 0 && derrotas == 0) {
				lblWR.setText("100 %");
			}
			else if(victorias != 0 && derrotas != 0) {
				float aux = (100) / (victorias + derrotas);
				int WR = (int) (victorias * aux);
				lblWR.setText(String.valueOf(WR));
			}

		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
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

	private void loadTable() {
		model.setRowCount(0);
		
		fila = new Object[model.getColumnCount()];
		for (int i = 0; i < Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugadores().size(); i++) {
			fila[0] = Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugadores().get(i).getNombre();
			fila[1] = Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugadores().get(i).getPosicion();
			fila[2] = Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugadores().get(i).getPaisOrigen();
			fila[3] = Administracion.getInstancia().getMisEquipos().get(MiEquipo).getJugadores().get(i).getEdad();
			
			model.addRow(fila);
		}
		
	}
}
