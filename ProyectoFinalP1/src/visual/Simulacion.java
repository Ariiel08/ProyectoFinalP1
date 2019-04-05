package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logic.Administracion;
import logic.JugCampo;
import logic.Jugador;
import logic.Pitcher;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Simulacion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static JTextField txtIning1Visitante;
	private static JTextField txtIning2Visitante;
	private static JTextField txtIning3Visitante;
	private static JTextField txtIning4Visitante;
	private static JTextField txtIning5Visitante;
	private static JTextField txtIning6Visitante;
	private static JTextField txtIning7Visitante;
	private static JTextField txtIning8Visitante;
	private static JTextField txtIning9Visitante;
	private static JTextField txtIning1Local;
	private static JTextField txtIning2Local;
	private static JTextField txtIning3Local;
	private static JTextField txtIning4Local;
	private static JTextField txtIning5Local;
	private static JTextField txtIning6Local;
	private static JTextField txtIning7Local;
	private static JTextField txtIning8Local;
	private static JTextField txtIning9Local;
	private JPanel panel_6;
	private JLabel label;
	private static JTextField txtTotalCarrerasLocal;
	private static JTextField txtTotalHitsLocal;
	private static JTextField txtTotalErroresLocal;
	private static JTextField txtTotalCarrerasVisitante;
	private static JTextField txtTotalHitsVisitante;
	private static JTextField txtTotalErroresVisitante;
	private JPanel panel_7;
	private JLabel lblCHE;
	private JPanel PanelCampoLocal;
	private JPanel PanelCampoVisitante;
	private JPanel PanelVisitante;
	private static JTable TableCampoLocal;
	private static JTable TableCampoVisitante;
	private static Object[] fila;
	public static DefaultTableModel modelCampoLocal;
	public static DefaultTableModel modelCampoVisitante;
	private static int Local;
	private static int Visitante;
	private static int EntradaAux = 1;
	private static int index;
	private JButton btnHit;
	private JButton btnCarrera;
	private JButton btnHomerun;
	private JButton btnError;
	private JPanel PanelPitcherLocal;
	private JPanel PanelPitcherVisitante;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_2;
	private static JTable TablePitcherLocal;
	private static JTable TablePitcherVisitante;
	public static DefaultTableModel modelPitcherLocal;
	public static DefaultTableModel modelPitcherVisitante;
	private JLabel NombreEquipoLocal;
	private JLabel NombreEquipoVisitante;
	
	public static int Hits = 0;
	public static int CarrerasTotalesLocal = 0;
	public static int CarrerasTotalesVisitante = 0;
	public static int ErroresTotalLocal = 0;
	public static int ErroresTotalVisitante = 0;
	public static int HitsTotalLocales = 0;
	public static int HitsTotalVisitantes = 0;
	public static int Errores = 0;
	public static int Carreras = 0;

	public Simulacion(int L, int V) {
		Local = L;
		Visitante = V;
		setBounds(100, 100, 883, 715);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_1.setBounds(12, 456, 833, 162);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
			panel_2.setBounds(12, 14, 657, 60);
			panel_1.add(panel_2);
			panel_2.setLayout(null);
			
			JLabel lblLocal = new JLabel("Local");
			lblLocal.setFont(new Font("Dialog", Font.BOLD, 18));
			lblLocal.setBounds(12, 12, 74, 36);
			panel_2.add(lblLocal);
			
			JPanel panel_5 = new JPanel();
			panel_5.setLayout(null);
			panel_5.setBounds(115, 12, 530, 36);
			panel_2.add(panel_5);
			
			txtIning1Local = new JTextField();
			txtIning1Local.setColumns(10);
			txtIning1Local.setBounds(20, 0, 36, 36);
			panel_5.add(txtIning1Local);
			
			txtIning2Local = new JTextField();
			txtIning2Local.setColumns(10);
			txtIning2Local.setBounds(76, 0, 36, 36);
			panel_5.add(txtIning2Local);
			
			txtIning3Local = new JTextField();
			txtIning3Local.setColumns(10);
			txtIning3Local.setBounds(132, 0, 36, 36);
			panel_5.add(txtIning3Local);
			
			txtIning4Local = new JTextField();
			txtIning4Local.setColumns(10);
			txtIning4Local.setBounds(188, 0, 36, 36);
			panel_5.add(txtIning4Local);
			
			txtIning5Local = new JTextField();
			txtIning5Local.setColumns(10);
			txtIning5Local.setBounds(244, 0, 36, 36);
			panel_5.add(txtIning5Local);
			
			txtIning6Local = new JTextField();
			txtIning6Local.setColumns(10);
			txtIning6Local.setBounds(300, 0, 36, 36);
			panel_5.add(txtIning6Local);
			
			txtIning7Local = new JTextField();
			txtIning7Local.setColumns(10);
			txtIning7Local.setBounds(356, 0, 36, 36);
			panel_5.add(txtIning7Local);
			
			txtIning8Local = new JTextField();
			txtIning8Local.setColumns(10);
			txtIning8Local.setBounds(412, 0, 36, 36);
			panel_5.add(txtIning8Local);
			
			txtIning9Local = new JTextField();
			txtIning9Local.setColumns(10);
			txtIning9Local.setBounds(468, 0, 36, 36);
			panel_5.add(txtIning9Local);
			{
				JPanel panel_3 = new JPanel();
				panel_3.setBorder(new LineBorder(Color.LIGHT_GRAY));
				panel_3.setBounds(12, 88, 657, 60);
				panel_1.add(panel_3);
				panel_3.setLayout(null);
				
				JPanel panel_4 = new JPanel();
				panel_4.setBounds(115, 12, 530, 36);
				panel_3.add(panel_4);
				panel_4.setLayout(null);
				
				txtIning1Visitante = new JTextField();
				txtIning1Visitante.setColumns(10);
				txtIning1Visitante.setBounds(20, 0, 36, 36);
				panel_4.add(txtIning1Visitante);
				
				txtIning2Visitante = new JTextField();
				txtIning2Visitante.setColumns(10);
				txtIning2Visitante.setBounds(76, 0, 36, 36);
				panel_4.add(txtIning2Visitante);
				
				txtIning3Visitante = new JTextField();
				txtIning3Visitante.setColumns(10);
				txtIning3Visitante.setBounds(132, 0, 36, 36);
				panel_4.add(txtIning3Visitante);
				
				txtIning4Visitante = new JTextField();
				txtIning4Visitante.setColumns(10);
				txtIning4Visitante.setBounds(188, 0, 36, 36);
				panel_4.add(txtIning4Visitante);
				
				txtIning5Visitante = new JTextField();
				txtIning5Visitante.setColumns(10);
				txtIning5Visitante.setBounds(244, 0, 36, 36);
				panel_4.add(txtIning5Visitante);
				
				txtIning6Visitante = new JTextField();
				txtIning6Visitante.setColumns(10);
				txtIning6Visitante.setBounds(300, 0, 36, 36);
				panel_4.add(txtIning6Visitante);
				
				txtIning7Visitante = new JTextField();
				txtIning7Visitante.setColumns(10);
				txtIning7Visitante.setBounds(356, 0, 36, 36);
				panel_4.add(txtIning7Visitante);
				
				txtIning8Visitante = new JTextField();
				txtIning8Visitante.setColumns(10);
				txtIning8Visitante.setBounds(412, 0, 36, 36);
				panel_4.add(txtIning8Visitante);
				
				txtIning9Visitante = new JTextField();
				txtIning9Visitante.setColumns(10);
				txtIning9Visitante.setBounds(468, 0, 36, 36);
				panel_4.add(txtIning9Visitante);
				
				JLabel lblVisitante = new JLabel("Visitante");
				lblVisitante.setFont(new Font("Dialog", Font.BOLD, 18));
				lblVisitante.setBounds(12, 12, 85, 36);
				panel_3.add(lblVisitante);
			}
			{
				JPanel panel_3 = new JPanel();
				panel_3.setBorder(new LineBorder(Color.LIGHT_GRAY));
				panel_3.setBounds(681, 14, 140, 136);
				panel_1.add(panel_3);
				panel_3.setLayout(null);
				
				txtTotalCarrerasLocal = new JTextField();
				txtTotalCarrerasLocal.setColumns(10);
				txtTotalCarrerasLocal.setBounds(8, 12, 36, 36);
				panel_3.add(txtTotalCarrerasLocal);
				
				txtTotalHitsLocal = new JTextField();
				txtTotalHitsLocal.setColumns(10);
				txtTotalHitsLocal.setBounds(52, 12, 36, 36);
				panel_3.add(txtTotalHitsLocal);
				
				txtTotalErroresLocal = new JTextField();
				txtTotalErroresLocal.setColumns(10);
				txtTotalErroresLocal.setBounds(96, 12, 36, 36);
				panel_3.add(txtTotalErroresLocal);
				
				txtTotalCarrerasVisitante = new JTextField();
				txtTotalCarrerasVisitante.setColumns(10);
				txtTotalCarrerasVisitante.setBounds(8, 85, 36, 36);
				panel_3.add(txtTotalCarrerasVisitante);
				
				txtTotalHitsVisitante = new JTextField();
				txtTotalHitsVisitante.setColumns(10);
				txtTotalHitsVisitante.setBounds(52, 85, 36, 36);
				panel_3.add(txtTotalHitsVisitante);
				
				txtTotalErroresVisitante = new JTextField();
				txtTotalErroresVisitante.setColumns(10);
				txtTotalErroresVisitante.setBounds(96, 85, 36, 36);
				panel_3.add(txtTotalErroresVisitante);
			}
			
			panel_6 = new JPanel();
			panel_6.setBounds(137, 418, 530, 26);
			panel.add(panel_6);
			panel_6.setLayout(null);
			
			label = new JLabel("    1          2          3        4         5          6         7         8         9");
			label.setFont(new Font("Dialog", Font.BOLD, 18));
			label.setBounds(12, 0, 506, 26);
			panel_6.add(label);
			
			panel_7 = new JPanel();
			panel_7.setBounds(696, 418, 137, 26);
			panel.add(panel_7);
			panel_7.setLayout(null);
			
			lblCHE = new JLabel("   C       H      E");
			lblCHE.setFont(new Font("Dialog", Font.BOLD, 18));
			lblCHE.setBounds(0, 0, 137, 26);
			panel_7.add(lblCHE);
			
			PanelCampoLocal = new JPanel();
			PanelCampoLocal.setBounds(12, 52, 225, 322);
			panel.add(PanelCampoLocal);
			PanelCampoLocal.setLayout(new BorderLayout(0, 0));
			PanelCampoLocal.setVisible(false);
			
			JScrollPane scrollPane = new JScrollPane();
			PanelCampoLocal.add(scrollPane, BorderLayout.CENTER);
			
			
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			String[] header = {"Nombre", "Hits", "Carreras", "Errores"};
			
			
			modelCampoLocal = new DefaultTableModel();
			modelCampoLocal.setColumnIdentifiers(header);
			TableCampoLocal = new JTable();
			TableCampoLocal.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(TableCampoLocal.getSelectedRow()>= 0) {
						btnCarrera.setEnabled(true);
						btnError.setEnabled(true);
						btnHit.setEnabled(true);
						btnHomerun.setEnabled(true);
						index = TableCampoLocal.getSelectedRow();
					}
						else {
							btnCarrera.setEnabled(false);
							btnError.setEnabled(false);
							btnHit.setEnabled(false);
							btnHomerun.setEnabled(false);
						}
				}
			});
			scrollPane.setViewportView(TableCampoLocal);
			TableCampoLocal.setModel(modelCampoLocal);
			
			
			PanelCampoVisitante = new JPanel();
			PanelCampoVisitante.setBounds(620, 52, 225, 322);
			panel.add(PanelCampoVisitante);
			PanelCampoVisitante.setLayout(new BorderLayout(0, 0));
			
			JScrollPane scrollPane_1 = new JScrollPane();
			PanelCampoVisitante.add(scrollPane_1, BorderLayout.CENTER);
			
			modelCampoVisitante = new DefaultTableModel();
			modelCampoVisitante.setColumnIdentifiers(header);
			TableCampoVisitante = new JTable();
			TableCampoVisitante.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(TableCampoVisitante.getSelectedRow()>= 0) {
						btnCarrera.setEnabled(true);
						btnError.setEnabled(true);
						btnHit.setEnabled(true);
						btnHomerun.setEnabled(true);
						index = TableCampoVisitante.getSelectedRow();
					}
					else {
						btnCarrera.setEnabled(false);
						btnError.setEnabled(false);
						btnHit.setEnabled(false);
						btnHomerun.setEnabled(false);
					}
				}
			});
			scrollPane_1.setViewportView(TableCampoVisitante);
			TableCampoVisitante.setModel(modelCampoVisitante);
			
			PanelVisitante = new JPanel();
			PanelVisitante.setBorder(new TitledBorder(null, "Panel de control", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			PanelVisitante.setBounds(285, 52, 285, 112);
			panel.add(PanelVisitante);
			PanelVisitante.setLayout(null);
			
			btnHit = new JButton("1 Hit");
			btnHit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ActualizarHits();
					if(EntradaAux % 2 == 0) {
						HitsTotalLocales++;
						LoadCampoLocal();
						LoadPitcherVisitante();
					}
					else {
						HitsTotalVisitantes++;
						LoadCampoVisitante();
						LoadPitcherLocal();
					}
					ActualizarTablero();
				}
			});
			btnHit.setEnabled(false);
			btnHit.setBounds(29, 20, 98, 26);
			PanelVisitante.add(btnHit);
			
			btnCarrera = new JButton("1 Carrera");
			btnCarrera.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Carreras++;
					ActualizarCarreras();
					if(EntradaAux % 2 == 0) {
						HitsTotalLocales++;
						CarrerasTotalesLocal++;
						LoadCampoLocal();
						LoadCampoVisitante();
					}
					else {
						HitsTotalVisitantes++;
						CarrerasTotalesVisitante++;
						LoadCampoVisitante();
						LoadPitcherLocal();
					}
					ActualizarTablero();
				}
			});
			btnCarrera.setEnabled(false);
			btnCarrera.setBounds(29, 66, 98, 26);
			PanelVisitante.add(btnCarrera);
			
			btnHomerun = new JButton("1 Homerun");
			btnHomerun.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Carreras++;
					ActualizarJonrones();
					if(EntradaAux % 2 == 0) {
						HitsTotalLocales++;
						CarrerasTotalesLocal++;
						LoadCampoLocal();
						LoadPitcherVisitante();
					}
					else {
						HitsTotalVisitantes++;
						CarrerasTotalesVisitante++;
						LoadCampoVisitante();
						LoadPitcherLocal();
					}
					ActualizarTablero();
					
				}
			});
			btnHomerun.setEnabled(false);
			btnHomerun.setBounds(156, 20, 98, 26);
			PanelVisitante.add(btnHomerun);
			
			btnError = new JButton("1 Error");
			btnError.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ActualizarErrores();
					if(EntradaAux % 2 == 0) {
						ErroresTotalLocal++;
						LoadCampoLocal();
						LoadPitcherVisitante();
					}
					else {
						ErroresTotalVisitante++;
						LoadCampoVisitante();
						LoadPitcherLocal();
					}
					ActualizarTablero();
				}
			});
			btnError.setEnabled(false);
			btnError.setBounds(156, 66, 98, 26);
			PanelVisitante.add(btnError);
			
			JButton btnCambioDeTurno = new JButton("Cambio De Turno");
			btnCambioDeTurno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Carreras = 0;
					if(EntradaAux < 18) {
						if(EntradaAux % 2 == 0) {
							PanelCampoLocal.setVisible(false);
							PanelPitcherLocal.setVisible(true);
							PanelCampoVisitante.setVisible(true);
							PanelPitcherVisitante.setVisible(false);
							EntradaAux++;
							LoadCampoLocal();
							LoadCampoVisitante();
							LoadPitcherLocal();
							LoadPitcherVisitante();
						}
						else if(EntradaAux % 2 != 0) {
							PanelCampoLocal.setVisible(true);
							PanelPitcherLocal.setVisible(false);
							PanelCampoVisitante.setVisible(false);
							PanelPitcherVisitante.setVisible(true);
							EntradaAux++;
							LoadCampoLocal();
							LoadCampoVisitante();
							LoadPitcherLocal();
							LoadPitcherVisitante();
						}
					}
					else if(EntradaAux == 18) {
						int local = CarrerasTotalesLocal;
						int visitante = CarrerasTotalesVisitante;
						if(local > visitante) {
							JOptionPane.showMessageDialog(null, "El partido a terminado a ganado el equipo local!");
							Administracion.getInstancia().getMisEquipos().get(Local).setJugGanados(+1);
							Administracion.getInstancia().getMisEquipos().get(Local).setJugJugados(+1);
							Administracion.getInstancia().getMisEquipos().get(Visitante).setJugJugados(+1);
							Administracion.getInstancia().getMisEquipos().get(Visitante).setJugPerdidos(+1);
							btnCambioDeTurno.setEnabled(false);
							
						}
						else {
							JOptionPane.showMessageDialog(null, "El partido a terminado a ganado el equipo visitante!");
							Administracion.getInstancia().getMisEquipos().get(Visitante).setJugGanados(+1);
							Administracion.getInstancia().getMisEquipos().get(Visitante).setJugJugados(+1);
							Administracion.getInstancia().getMisEquipos().get(Local).setJugJugados(+1);
							Administracion.getInstancia().getMisEquipos().get(Local).setJugPerdidos(+1);
							btnCambioDeTurno.setEnabled(false);
						}
						
						
						
					}
				}
			});
			btnCambioDeTurno.setBounds(359, 322, 137, 26);
			panel.add(btnCambioDeTurno);
			
			NombreEquipoLocal = new JLabel("");
			NombreEquipoLocal.setFont(new Font("Dialog", Font.BOLD, 18));
			NombreEquipoLocal.setBounds(12, 12, 225, 26);
			panel.add(NombreEquipoLocal);
			
			NombreEquipoVisitante = new JLabel("");
			NombreEquipoVisitante.setFont(new Font("Dialog", Font.BOLD, 18));
			NombreEquipoVisitante.setBounds(620, 12, 225, 26);
			panel.add(NombreEquipoVisitante);
			
			PanelPitcherLocal = new JPanel();
			PanelPitcherLocal.setBounds(12, 52, 225, 322);
			panel.add(PanelPitcherLocal);
			PanelPitcherLocal.setLayout(new BorderLayout(0, 0));
			
			scrollPane_2 = new JScrollPane();
			PanelPitcherLocal.add(scrollPane_2, BorderLayout.CENTER);
			
			String [] header2 = {"Nombre", "Carreras", "Hits" ,"Jonrones"};
			modelPitcherLocal = new DefaultTableModel();
			modelPitcherLocal.setColumnIdentifiers(header2);
			TablePitcherLocal = new JTable();
			scrollPane_2.setViewportView(TablePitcherLocal);
			TablePitcherLocal.setModel(modelPitcherLocal);
			
			PanelPitcherVisitante = new JPanel();
			PanelPitcherVisitante.setBounds(620, 52, 225, 322);
			panel.add(PanelPitcherVisitante);
			PanelPitcherVisitante.setLayout(new BorderLayout(0, 0));
			PanelPitcherVisitante.setVisible(false);
			
			scrollPane_3 = new JScrollPane();
			PanelPitcherVisitante.add(scrollPane_3, BorderLayout.CENTER);
			
			modelPitcherVisitante = new DefaultTableModel();
			modelPitcherVisitante.setColumnIdentifiers(header2);
			TablePitcherVisitante = new JTable();
			scrollPane_3.setViewportView(TablePitcherVisitante);
			TablePitcherVisitante.setModel(modelPitcherVisitante);
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
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		NombreEquipoLocal.setText(Administracion.getInstancia().getMisEquipos().get(Local).getNombre());
		NombreEquipoVisitante.setText(Administracion.getInstancia().getMisEquipos().get(Visitante).getNombre());
		LoadCampoLocal();
		LoadCampoVisitante();
		LoadPitcherLocal();
		LoadPitcherVisitante();
	}
	
	protected void ActualizarTablero() {
		if(EntradaAux == 1) {
			txtIning1Visitante.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 2) {
			txtIning1Local.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 3) {
			txtIning2Visitante.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 4) {
			txtIning2Local.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 5) {
			txtIning3Visitante.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 6) {
			txtIning3Local.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 7) {
			txtIning4Visitante.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 8) {
			txtIning4Local.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 9) {
			txtIning5Visitante.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 10) {
			txtIning5Local.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 11) {
			txtIning6Visitante.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 12) {
			txtIning6Local.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 13) {
			txtIning7Visitante.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 14) {
			txtIning7Local.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 15) {
			txtIning8Visitante.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 16) {
			txtIning8Local.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 2) {
			txtIning9Visitante.setText(String.valueOf(Carreras));
		}
		else if(EntradaAux == 2) {
			txtIning9Local.setText(String.valueOf(Carreras));
		}
		
		txtTotalCarrerasLocal.setText(String.valueOf(CarrerasTotalesLocal));
		txtTotalCarrerasVisitante.setText(String.valueOf(CarrerasTotalesVisitante));
		txtTotalErroresLocal.setText(String.valueOf(ErroresTotalLocal));
		txtTotalErroresVisitante.setText(String.valueOf(txtTotalErroresVisitante));
		txtTotalHitsLocal.setText(String.valueOf(HitsTotalLocales));
		txtTotalHitsVisitante.setText(String.valueOf(HitsTotalVisitantes));
		
	}

	protected void ActualizarHitsPitcher() {
		if(EntradaAux % 2 == 0) {
			String aux = (String) TablePitcherLocal.getValueAt(index, 0);
			int help = Administracion.getInstancia().findJugador(Local, aux);
			((Pitcher) Administracion.getInstancia().getMisEquipos().get(Local).getJugadores().get(help)).getEstad().setHitsPitch(+1);;
		}
		else if(EntradaAux % 2 != 0) {
			String aux = (String) TablePitcherVisitante.getValueAt(index, 0);
			int help = Administracion.getInstancia().findJugador(Visitante, aux);
			((Pitcher) Administracion.getInstancia().getMisEquipos().get(Visitante).getJugadores().get(help)).getEstad().setHitsPitch(+1);
		}
	}
	protected void ActualizarCarrerasPitcher() {
		if(EntradaAux % 2 == 0) {
			String aux = (String) TablePitcherLocal.getValueAt(index, 0);
			int help = Administracion.getInstancia().findJugador(Local, aux);
			((Pitcher) Administracion.getInstancia().getMisEquipos().get(Local).getJugadores().get(help)).getEstad().setCarrPitch(+1);
		}
		else if(EntradaAux % 2 != 0) {
			String aux = (String) TablePitcherVisitante.getValueAt(index, 0);
			int help = Administracion.getInstancia().findJugador(Visitante, aux);
			((Pitcher) Administracion.getInstancia().getMisEquipos().get(Visitante).getJugadores().get(help)).getEstad().setCarrPitch(+1);
		}
	}
	protected void ActualizarJonronesPitcher() {
		if(EntradaAux % 2 == 0) {
			String aux = (String) TablePitcherLocal.getValueAt(index, 0);
			int help = Administracion.getInstancia().findJugador(Local, aux);
			((Pitcher) Administracion.getInstancia().getMisEquipos().get(Local).getJugadores().get(help)).getEstad().setJonronPitch(+1);;
		}
		else if(EntradaAux % 2 != 0) {
			String aux = (String) TablePitcherVisitante.getValueAt(index, 0);
			int help = Administracion.getInstancia().findJugador(Visitante, aux);
			((Pitcher) Administracion.getInstancia().getMisEquipos().get(Visitante).getJugadores().get(help)).getEstad().setJonronPitch(+1);
		}
	}
	
	protected void ActualizarHits() {
		
		if(EntradaAux % 2 == 0) {
			String aux = (String) TableCampoLocal.getValueAt(index, 0);
			int help = Administracion.getInstancia().findJugador(Local, aux);
			((JugCampo) Administracion.getInstancia().getMisEquipos().get(Local).getJugadores().get(help)).getEstad().setH(+1);
		}
		else if(EntradaAux % 2 != 0) {
			String aux = (String) TableCampoVisitante.getValueAt(index, 0);
			int help = Administracion.getInstancia().findJugador(Visitante, aux);
			((JugCampo) Administracion.getInstancia().getMisEquipos().get(Visitante).getJugadores().get(help)).getEstad().setH(+1);
		}
		
	}
	
	protected void ActualizarCarreras() {
		if(EntradaAux % 2 == 0) {
			String aux = (String) TableCampoLocal.getValueAt(index, 0);
			int help = Administracion.getInstancia().findJugador(Local, aux);
			((JugCampo) Administracion.getInstancia().getMisEquipos().get(Local).getJugadores().get(help)).getEstad().setD(+1);
		}
		else if(EntradaAux % 2 != 0) {
			String aux = (String) TableCampoVisitante.getValueAt(index, 0);
			int help = Administracion.getInstancia().findJugador(Visitante, aux);
			((JugCampo) Administracion.getInstancia().getMisEquipos().get(Visitante).getJugadores().get(help)).getEstad().setD(+1);
		}
		
	}

	protected void ActualizarJonrones() {
		if(EntradaAux % 2 == 0) {
			String aux = (String) TableCampoLocal.getValueAt(index, 0);
			int help = Administracion.getInstancia().findJugador(Local, aux);
			((JugCampo) Administracion.getInstancia().getMisEquipos().get(Local).getJugadores().get(help)).getEstad().setHR(+1);
		}
		else if(EntradaAux % 2 != 0) {
			String aux = (String) TableCampoVisitante.getValueAt(index, 0);
			int help = Administracion.getInstancia().findJugador(Visitante, aux);
			((JugCampo) Administracion.getInstancia().getMisEquipos().get(Visitante).getJugadores().get(help)).getEstad().setHR(+1);
		}
		
	}
	
	protected void ActualizarErrores() {
		if(EntradaAux % 2 == 0) {
			String aux = (String) TableCampoLocal.getValueAt(index, 0);
			int help = Administracion.getInstancia().findJugador(Local, aux);
			((JugCampo) Administracion.getInstancia().getMisEquipos().get(Local).getJugadores().get(help)).getEstad().setErrores(+1);
		}
		else if(EntradaAux % 2 != 0) {
			String aux = (String) TableCampoVisitante.getValueAt(index, 0);
			int help = Administracion.getInstancia().findJugador(Visitante, aux);
			((JugCampo) Administracion.getInstancia().getMisEquipos().get(Visitante).getJugadores().get(help)).getEstad().setErrores(+1);
		}
		
	}
	
	public static void cargar() {
		
		
	}

	public static void LoadCampoLocal() {
		modelCampoLocal.setRowCount(0);
		fila = new Object[modelCampoLocal.getColumnCount()];
		for (Jugador help : Administracion.getInstancia().getMisEquipos().get(Local).getJugadores()) {
			if(help instanceof JugCampo) {
				fila[0] = help.getNombre();
				fila[1] = ((JugCampo) help).getEstad().getH();
				fila[2] = ((JugCampo) help).getEstad().getD();
				fila[3] = ((JugCampo) help).getEstad().getErrores();
				modelCampoLocal.addRow(fila);
			}
		}
	}
	
	public static void LoadCampoVisitante() {
		modelCampoVisitante.setRowCount(0);
		fila = new Object[modelCampoVisitante.getColumnCount()];
		for (Jugador help : Administracion.getInstancia().getMisEquipos().get(Visitante).getJugadores()) {
			if(help instanceof JugCampo) {
				fila[0] = help.getNombre();
				fila[1] = ((JugCampo) help).getEstad().getH();
				fila[2] = ((JugCampo) help).getEstad().getD();
				fila[3] = ((JugCampo) help).getEstad().getErrores();
				modelCampoVisitante.addRow(fila);
			}
		}
	}
	
	public static void LoadPitcherLocal() {
		modelPitcherLocal.setRowCount(0);
		fila = new Object[modelPitcherLocal.getColumnCount()];
		for (Jugador help : Administracion.getInstancia().getMisEquipos().get(Local).getJugadores()) {
			if(help instanceof Pitcher) {
				fila[0] = help.getNombre();
				fila[1] = ((Pitcher) help).getEstad().getCarrPitch();
				fila[2] = ((Pitcher) help).getEstad().getHitsPitch();
				fila[3] = ((Pitcher) help).getEstad().getJonronPitch();
				modelPitcherLocal.addRow(fila);
				
			}
		}
	}
	
	public static void LoadPitcherVisitante() {
		modelPitcherVisitante.setRowCount(0);
		fila = new Object[modelPitcherVisitante.getColumnCount()];
		for (Jugador help : Administracion.getInstancia().getMisEquipos().get(Visitante).getJugadores()) {
			if(help instanceof Pitcher) {
				fila[0] = help.getNombre();
				fila[1] = ((Pitcher) help).getEstad().getCarrPitch();
				fila[2] = ((Pitcher) help).getEstad().getHitsPitch();
				fila[3] = ((Pitcher) help).getEstad().getJonronPitch();
				modelPitcherVisitante.addRow(fila);
				
			}
		}
	}
}
