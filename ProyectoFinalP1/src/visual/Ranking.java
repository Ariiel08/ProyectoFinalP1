package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logic.Administracion;
import logic.Equipo;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ranking extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	public static DefaultTableModel model;
	public static Object[] fila;
	public static ArrayList<Equipo> Ranking = new ArrayList();
	private JButton okButton;
	private int index;


	public Ranking() {
		setTitle("Tabla de Pocisiones ");
		setBounds(100, 100, 614, 370);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Posiciones Temporada Regular", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(12, 25, 564, 248);
				panel.add(scrollPane);
				
				for (Equipo equipo : Administracion.getInstancia().getMisEquipos()) {
					Ranking.add(equipo);
				}
				
				Collections.sort(Ranking, new Comparator<Equipo>() {

					@Override
					public int compare(Equipo o1, Equipo o2) {
						// TODO Auto-generated method stub
						return Integer.valueOf(o1.getJugGanados()).compareTo(o2.getJugGanados());
					}
					
				});
				
				String[] header = {"Nombre", "Manager", "Juegos Jugados", "Juegos Ganados", "Juegos Perdidos", "Winrate"};
				model = new DefaultTableModel();
				model.setColumnIdentifiers(header);
				table = new JTable();
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if(table.getSelectedRow()>= 0) {
							okButton.setEnabled(true);
							index = table.getSelectedRow();
						}
					}
				});
				table.setModel(model);
				scrollPane.setViewportView(table);
				loadTable();
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("Perfil del Equipo");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						index = Administracion.getInstancia().findEquipo(Ranking.get(index).getNombre());
						VerEquipo VE = new VerEquipo(index);
						VE.setModal(true);
						VE.setVisible(true);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cerrar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Ranking.clear();
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}


	public static void loadTable() {
		// TODO Auto-generated method stub
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
		for (int i = 0; i < Ranking.size(); i++) {
			fila[0] = Ranking.get(i).getNombre();
			fila[1] = Ranking.get(i).getManager();
			fila[2] = Ranking.get(i).getJugJugados();
			fila[3] = Ranking.get(i).getJugGanados();
			fila[4] = Ranking.get(i).getJugPerdidos();
			
			int victorias = Ranking.get(i).getJugGanados();
			int derrotas = Ranking.get(i).getJugPerdidos();

			if(victorias == 0 && derrotas == 0) {
				fila[5] = "0 %";
			}
			else if(victorias != 0 && derrotas == 0) {
				fila[5] = "100 %";
			}
			else if(victorias != 0 && derrotas != 0) {
				float aux = (100) / (victorias + derrotas);
				int WR = (int) (victorias * aux);
				fila[5] = WR + " %";
			}
			
			model.addRow(fila);
		}
	}







	
}