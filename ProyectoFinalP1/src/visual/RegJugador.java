package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JSpinField;

import logic.Administracion;
import logic.Equipo;
import logic.EstadPitcher;
import logic.Estadistica;
import logic.JugCampo;
import logic.Pitcher;

import com.toedter.components.JLocaleChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;

public class RegJugador extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JComboBox cbxPais;
	private JComboBox cbxLanzamiento;
	private JComboBox cbxBateo;
	private JComboBox cbxPosicion;
	private JComboBox cbxEquipo;
	private JSpinner spnPeso;
	private JSpinner spnAltura;
	private JSpinner spnNumero;
	private JSpinner spnHR;
	private JSpinner spnAB;
	private JSpinner spnBB; 
	private JSpinner spn2B;
	private JSpinner spn3B;
	private JSpinner spnD;
	private JSpinner spnH;
	private JSpinner spnSO;
	private JSpinner spnH_Pitch;
	private JSpinner spnCL;
	private JSpinner spnBB_Pitch;
	private JSpinner spnHR_Pitch;
	private JSpinner spnSO_Pitch;
	private JSpinner spnD_Pitch;
	private JPanel panel_estadPitcher;
	private JPanel panel_estadisticas;
	private JDateChooser fechaNacimiento;
	private ArrayList<String> nomEquipos = new ArrayList<String>();
	private int index;

	public RegJugador() {
		setResizable(false);
		
		setTitle("Registrar jugador");
		setBounds(-12, -36, 812, 370);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNombre = new JLabel("Nombre del juador:");
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNombre.setBounds(12, 12, 92, 16);
			panel.add(lblNombre);
			
			txtNombre = new JTextField();
			txtNombre.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char validar = e.getKeyChar();
					
					if(Character.isDigit(validar)) {
						e.consume();
						JOptionPane.showMessageDialog(null, "Solo se permiten letras");
					}
				}
			});
			txtNombre.setBounds(137, 10, 204, 20);
			panel.add(txtNombre);
			txtNombre.setColumns(10);
			
			JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento: ");
			lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblFechaDeNacimiento.setBounds(12, 44, 124, 16);
			panel.add(lblFechaDeNacimiento);
			
			fechaNacimiento = new JDateChooser();
			fechaNacimiento.setBounds(137, 42, 162, 20);
			panel.add(fechaNacimiento);
			
			JLabel lblPasDeOrigen = new JLabel("Pa\u00EDs:");
			lblPasDeOrigen.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblPasDeOrigen.setBounds(359, 12, 34, 16);
			panel.add(lblPasDeOrigen);
			
			cbxPais = new JComboBox();
			cbxPais.setFont(new Font("Tahoma", Font.PLAIN, 11));
			cbxPais.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Afganist\u00E1n ", "Akrotiri ", "Albania ", "Alemania ", "Andorra ", "Angola ", "Anguila ", "Ant\u00E1rtida ", "Antigua y Barbuda ", "Antillas Neerlandesas ", "Arabia Saud\u00ED ", "Arctic Ocean ", "Argelia ", "Argentina ", "Armenia ", "Aruba ", "Ashmore andCartier Islands ", "Atlantic Ocean ", "Australia ", "Austria ", "Azerbaiy\u00E1n ", "Bahamas ", "Bahr\u00E1in ", "Bangladesh ", "Barbados ", "B\u00E9lgica ", "Belice ", "Ben\u00EDn ", "Bermudas ", "Bielorrusia ", "Birmania Myanmar ", "Bolivia ", "Bosnia y Hercegovina ", "Botsuana ", "Brasil ", "Brun\u00E9i ", "Bulgaria ", "Burkina Faso ", "Burundi ", "But\u00E1n ", "Cabo Verde ", "Camboya ", "Camer\u00FAn ", "Canad\u00E1 ", "Chad ", "Chile ", "China ", "Chipre ", "Clipperton Island ", "Colombia ", "Comoras ", "Congo ", "Coral Sea Islands ", "Corea del Norte ", "Corea del Sur ", "Costa de Marfil ", "Costa Rica ", "Croacia ", "Cuba ", "Dhekelia ", "Dinamarca ", "Dominica ", "Ecuador ", "Egipto ", "El Salvador ", "El Vaticano ", "Emiratos \u00C1rabes Unidos ", "Eritrea ", "Eslovaquia ", "Eslovenia ", "Espa\u00F1a ", "Estados Unidos ", "Estonia ", "Etiop\u00EDa ", "Filipinas ", "Finlandia ", "Fiyi ", "Francia ", "Gab\u00F3n ", "Gambia ", "Gaza Strip ", "Georgia ", "Ghana ", "Gibraltar ", "Granada ", "Grecia ", "Groenlandia ", "Guam ", "Guatemala ", "Guernsey ", "Guinea ", "Guinea Ecuatorial ", "Guinea-Bissau ", "Guyana ", "Hait\u00ED ", "Honduras ", "Hong Kong ", "Hungr\u00EDa ", "India ", "Indian Ocean ", "Indonesia ", "Ir\u00E1n ", "Iraq ", "Irlanda ", "Isla Bouvet ", "Isla Christmas ", "Isla Norfolk ", "Islandia ", "Islas Caim\u00E1n ", "Islas Cocos ", "Islas Cook ", "Islas Feroe ", "Islas Heard y McDonald ", "Islas Malvinas ", "Islas Marianas del Norte ", "IslasMarshall ", "Islas Pitcairn ", "Islas Salom\u00F3n ", "Islas Turcas y Caicos ", "Islas V\u00EDrgenes Americanas ", "Islas V\u00EDrgenes Brit\u00E1nicas ", "Israel ", "Italia ", "Jamaica ", "Jan Mayen ", "Jap\u00F3n ", "Jersey ", "Jordania ", "Kazajist\u00E1n ", "Kenia ", "Kirguizist\u00E1n ", "Kiribati ", "Kuwait ", "Laos ", "Lesoto ", "Letonia ", "L\u00EDbano ", "Liberia ", "Libia ", "Liechtenstein ", "Lituania ", "Luxemburgo ", "Macao ", "Macedonia ", "Madagascar ", "Malasia ", "Malaui ", "Maldivas ", "Mal\u00ED ", "Malta ", "Man, Isle of ", "Marruecos ", "Mauricio ", "Mauritania ", "Mayotte ", "M\u00E9xico ", "Micronesia ", "Moldavia ", "M\u00F3naco ", "Mongolia ", "Montserrat ", "Mozambique ", "Namibia ", "Nauru ", "Navassa Island ", "Nepal ", "Nicaragua ", "N\u00EDger ", "Nigeria ", "Niue ", "Noruega ", "Nueva Caledonia ", "Nueva Zelanda ", "Om\u00E1n ", "Pacific Ocean ", "Pa\u00EDses Bajos ", "Pakist\u00E1n ", "Palaos ", "Panam\u00E1 ", "Pap\u00FAa-Nueva Guinea ", "Paracel Islands ", "Paraguay ", "Per\u00FA ", "Polinesia Francesa ", "Polonia ", "Portugal ", "Puerto Rico ", "Qatar ", "Reino Unido ", "Rep\u00FAblica Centroafricana ", "Rep\u00FAblica Checa ", "Rep. Democr\u00E1tica del Congo ", "Rep\u00FAblica Dominicana ", "Ruanda ", "Rumania ", "Rusia ", "S\u00E1hara Occidental ", "Samoa ", "Samoa Americana ", "San Crist\u00F3bal y Nieves ", "San Marino ", "San Pedro y Miquel\u00F3n ", "Santa Helena ", "Santa Luc\u00EDa ", "Santo Tom\u00E9 y Pr\u00EDncipe ", "Senegal ", "Seychelles ", "Sierra Leona ", "Singapur ", "Siria ", "Somalia ", "Southern Ocean ", "Spratly Islands ", "Sri Lanka ", "Suazilandia ", "Sud\u00E1frica ", "Sud\u00E1n ", "Suecia ", "Suiza ", "Surinam ", "Svalbard y Jan Mayen ", "Tailandia ", "Taiw\u00E1n ", "Tanzania ", "Tayikist\u00E1n ", "Timor Oriental ", "Togo ", "Tokelau ", "Tonga ", "Trinidad y Tobago ", "T\u00FAnez ", "Turkmenist\u00E1n ", "Turqu\u00EDa ", "Tuvalu ", "Ucrania ", "Uganda ", "Uni\u00F3n Europea ", "Uruguay ", "Uzbekist\u00E1n ", "Vanuatu ", "Venezuela ", "Vietnam ", "Wake Island ", "Wallis y Futuna ", "Yemen ", "Yibuti ", "Zambia ", "Zimbabue "}));
			cbxPais.setBounds(421, 10, 162, 20);
			panel.add(cbxPais);
			
			JLabel lblLanzamiento = new JLabel("Lanzamiento:");
			lblLanzamiento.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblLanzamiento.setBounds(12, 104, 83, 16);
			panel.add(lblLanzamiento);
			
			cbxLanzamiento = new JComboBox();
			cbxLanzamiento.setFont(new Font("Tahoma", Font.PLAIN, 11));
			cbxLanzamiento.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Izquierdo", "Derecho"}));
			cbxLanzamiento.setBounds(137, 102, 162, 20);
			panel.add(cbxLanzamiento);
			
			cbxBateo = new JComboBox();
			cbxBateo.setFont(new Font("Tahoma", Font.PLAIN, 11));
			cbxBateo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Izquierdo", "Derecho"}));
			cbxBateo.setBounds(137, 130, 162, 20);
			panel.add(cbxBateo);
			
			JLabel lblBateo = new JLabel("Bateo:");
			lblBateo.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblBateo.setBounds(12, 132, 42, 16);
			panel.add(lblBateo);
			
			JLabel lblPosicin = new JLabel("Posici\u00F3n:");
			lblPosicin.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblPosicin.setBounds(359, 44, 55, 16);
			panel.add(lblPosicin);
			
			cbxPosicion = new JComboBox();
			cbxPosicion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					index = cbxPosicion.getSelectedIndex();
					
					if(index == 8) {
						panel_estadisticas.setVisible(false);
						panel_estadPitcher.setVisible(true);
					}
					else {
						panel_estadisticas.setVisible(true);
						panel_estadPitcher.setVisible(false);
					}
				}
			});
			cbxPosicion.setFont(new Font("Tahoma", Font.PLAIN, 11));
			cbxPosicion.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Primera base", "Segunda base", "Tercera base", "Short Stop", "Left Field", "Center Field", "Right Field", "Pitcher", "Catcher"}));
			cbxPosicion.setBounds(421, 42, 162, 20);
			panel.add(cbxPosicion);
			
			JLabel lblEquipo = new JLabel("Equipo:");
			lblEquipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblEquipo.setBounds(359, 132, 42, 16);
			panel.add(lblEquipo);
			
			for (Equipo i : Administracion.getInstancia().getMisEquipos()) {
				nomEquipos.add(i.getNombre());
			}
			
			cbxEquipo = new JComboBox(nomEquipos.toArray());
			cbxEquipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
			cbxEquipo.setBounds(421, 130, 162, 20);
			panel.add(cbxEquipo);
			
			panel_estadisticas = new JPanel();
			panel_estadisticas.setBorder(new TitledBorder(null, "Estad\u00EDsticas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_estadisticas.setBounds(12, 172, 571, 103);
			panel.add(panel_estadisticas);
			panel_estadisticas.setLayout(null);
			
			JLabel lblAB = new JLabel("AB");
			lblAB.setBounds(57, 31, 27, 14);
			panel_estadisticas.add(lblAB);
			lblAB.setFont(new Font("Tahoma", Font.BOLD, 11));
			
			spnAB = new JSpinner();
			spnAB.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spnAB.setBounds(45, 48, 47, 23);
			panel_estadisticas.add(spnAB);
			spnAB.setModel(new SpinnerNumberModel(0, 0, 999, 1));
			
			JLabel lblH = new JLabel("H");
			lblH.setBounds(180, 31, 15, 14);
			panel_estadisticas.add(lblH);
			lblH.setFont(new Font("Tahoma", Font.BOLD, 11));
			
			spnH = new JSpinner();
			spnH.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spnH.setBounds(163, 48, 47, 23);
			panel_estadisticas.add(spnH);
			spnH.setModel(new SpinnerNumberModel(0, 0, 999, 1));
			
			JLabel lbl2B = new JLabel("2B");
			lbl2B.setBounds(237, 31, 17, 14);
			panel_estadisticas.add(lbl2B);
			lbl2B.setFont(new Font("Tahoma", Font.BOLD, 11));
			
			spn2B = new JSpinner();
			spn2B.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spn2B.setBounds(222, 48, 47, 23);
			panel_estadisticas.add(spn2B);
			spn2B.setModel(new SpinnerNumberModel(0, 0, 999, 1));
			
			JLabel lbl3B = new JLabel("3B");
			lbl3B.setBounds(296, 31, 17, 14);
			panel_estadisticas.add(lbl3B);
			lbl3B.setFont(new Font("Tahoma", Font.BOLD, 11));
			
			spn3B = new JSpinner();
			spn3B.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spn3B.setBounds(281, 48, 47, 23);
			panel_estadisticas.add(spn3B);
			spn3B.setModel(new SpinnerNumberModel(0, 0, 999, 1));
			
			JLabel lblHR = new JLabel("HR");
			lblHR.setBounds(417, 31, 17, 14);
			panel_estadisticas.add(lblHR);
			lblHR.setFont(new Font("Tahoma", Font.BOLD, 11));
			
			spnHR = new JSpinner();
			spnHR.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spnHR.setBounds(405, 48, 47, 23);
			panel_estadisticas.add(spnHR);
			spnHR.setModel(new SpinnerNumberModel(0, 0, 999, 1));
			
			JLabel lblBB = new JLabel("BB");
			lblBB.setBounds(353, 31, 17, 14);
			panel_estadisticas.add(lblBB);
			lblBB.setFont(new Font("Tahoma", Font.BOLD, 11));
			
			spnBB = new JSpinner();
			spnBB.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spnBB.setBounds(340, 48, 47, 23);
			panel_estadisticas.add(spnBB);
			spnBB.setModel(new SpinnerNumberModel(0, 0, 999, 1));
			
			JLabel lblD = new JLabel("D");
			lblD.setBounds(122, 31, 15, 14);
			panel_estadisticas.add(lblD);
			lblD.setFont(new Font("Tahoma", Font.BOLD, 11));
			
			spnD = new JSpinner();
			spnD.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spnD.setBounds(104, 48, 47, 23);
			panel_estadisticas.add(spnD);
			spnD.setModel(new SpinnerNumberModel(0, 0, 999, 1));
			
			spnSO = new JSpinner();
			spnSO.setModel(new SpinnerNumberModel(0, null, 999, 1));
			spnSO.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spnSO.setBounds(464, 48, 47, 23);
			panel_estadisticas.add(spnSO);
			
			JLabel lblSo = new JLabel("SO");
			lblSo.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblSo.setBounds(477, 31, 17, 14);
			panel_estadisticas.add(lblSo);
			
			panel_estadPitcher = new JPanel();
			panel_estadPitcher.setBounds(12, 172, 571, 103);
			panel.add(panel_estadPitcher);
			panel_estadPitcher.setLayout(null);
			panel_estadPitcher.setBorder(new TitledBorder(null, "Estad\u00EDsticas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_estadPitcher.setVisible(false);
			
			JLabel lblH_Pitch = new JLabel("H");
			lblH_Pitch.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblH_Pitch.setBounds(116, 31, 27, 14);
			panel_estadPitcher.add(lblH_Pitch);
			
			spnH_Pitch = new JSpinner();
			spnH_Pitch.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spnH_Pitch.setBounds(104, 48, 47, 23);
			panel_estadPitcher.add(spnH_Pitch);
			
			JLabel lblCL = new JLabel("CL");
			lblCL.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblCL.setBounds(239, 31, 15, 14);
			panel_estadPitcher.add(lblCL);
			
			spnCL = new JSpinner();
			spnCL.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spnCL.setBounds(222, 48, 47, 23);
			panel_estadPitcher.add(spnCL);
			
			JLabel lblBB_Pitch = new JLabel("BB");
			lblBB_Pitch.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblBB_Pitch.setBounds(296, 31, 17, 14);
			panel_estadPitcher.add(lblBB_Pitch);
			
			spnBB_Pitch = new JSpinner();
			spnBB_Pitch.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spnBB_Pitch.setBounds(281, 48, 47, 23);
			panel_estadPitcher.add(spnBB_Pitch);
			
			JLabel lblHR_Pitcher = new JLabel("HR");
			lblHR_Pitcher.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblHR_Pitcher.setBounds(355, 31, 17, 14);
			panel_estadPitcher.add(lblHR_Pitcher);
			
			spnHR_Pitch = new JSpinner();
			spnHR_Pitch.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spnHR_Pitch.setBounds(340, 48, 47, 23);
			panel_estadPitcher.add(spnHR_Pitch);
			
			JLabel lblSO = new JLabel("SO");
			lblSO.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblSO.setBounds(412, 31, 17, 14);
			panel_estadPitcher.add(lblSO);
			
			spnSO_Pitch = new JSpinner();
			spnSO_Pitch.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spnSO_Pitch.setBounds(399, 48, 47, 23);
			panel_estadPitcher.add(spnSO_Pitch);
			
			JLabel lblD_Pitch = new JLabel("D");
			lblD_Pitch.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblD_Pitch.setBounds(181, 31, 15, 14);
			panel_estadPitcher.add(lblD_Pitch);
			
			spnD_Pitch = new JSpinner();
			spnD_Pitch.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spnD_Pitch.setBounds(163, 48, 47, 23);
			panel_estadPitcher.add(spnD_Pitch);
			
			JLabel lblPeso = new JLabel("Peso (KG):");
			lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblPeso.setBounds(12, 76, 51, 16);
			panel.add(lblPeso);
			
			JLabel lblAltura = new JLabel("Altura (CM):");
			lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblAltura.setBounds(359, 76, 68, 16);
			panel.add(lblAltura);
			
			spnPeso = new JSpinner();
			spnPeso.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spnPeso.setModel(new SpinnerNumberModel(new Integer(80), new Integer(80), null, new Integer(1)));
			spnPeso.setBounds(137, 74, 162, 20);
			panel.add(spnPeso);
			
			spnAltura = new JSpinner();
			spnAltura.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spnAltura.setModel(new SpinnerNumberModel(new Integer (163), new Integer (163), null, new Integer (1)));
			spnAltura.setBounds(421, 74, 162, 20);
			panel.add(spnAltura);
			
			JLabel lblNmero = new JLabel("N\u00FAmero #:");
			lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNmero.setBounds(359, 103, 55, 16);
			panel.add(lblNmero);
			
			JButton btnCargarImagen = new JButton("Cargar Imagen");
			btnCargarImagen.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnCargarImagen.setBounds(643, 192, 110, 26);
			panel.add(btnCargarImagen);
			
			JPanel panel_imagen = new JPanel();
			panel_imagen.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel_imagen.setBounds(619, 30, 156, 138);
			panel.add(panel_imagen);
			panel_imagen.setLayout(null);
			
			JLabel lblImagen = new JLabel("");
			lblImagen.setBounds(0, 0, 156, 138);
			panel_imagen.add(lblImagen);
			
			spnNumero = new JSpinner();
			spnNumero.setFont(new Font("Tahoma", Font.PLAIN, 11));
			spnNumero.setBounds(421, 101, 162, 20);
			panel.add(spnNumero);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
				btnRegistrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String nom, fecha, lanz, bat, pais, pos, equipo, num;
						Date date;
						int peso, altura, AB, D, H, HR, doble, triple, BB, SO;
						int H_Pitch, D_Pitch, CL, BB_Pitch, HR_Pitch, SO_Pitch;
						Estadistica estad;
						EstadPitcher estadPit;
						
						nom = txtNombre.getText();
						date = fechaNacimiento.getDate();
						Calendar cal = Calendar.getInstance();
						/*DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
						fecha = format.format(date);*/
						lanz = cbxLanzamiento.getSelectedItem().toString();
						bat = cbxBateo.getSelectedItem().toString();
						pais = cbxPais.getSelectedItem().toString();
						pos = cbxPosicion.getSelectedItem().toString();
						equipo = cbxEquipo.getSelectedItem().toString();
						peso = Integer.parseInt(spnPeso.getValue().toString());
						altura = Integer.parseInt(spnAltura.getValue().toString());
						num = spnNumero.getValue().toString();
						
						//Estadisticas del Jugador de Campo
						AB = Integer.parseInt(spnAB.getValue().toString());
						D = Integer.parseInt(spnD.getValue().toString());
						H = Integer.parseInt(spnH.getValue().toString());
						HR = Integer.parseInt(spnHR.getValue().toString());
						doble = Integer.parseInt(spn2B.getValue().toString());
						triple = Integer.parseInt(spn3B.getValue().toString());
						BB = Integer.parseInt(spnBB.getValue().toString());
						SO = Integer.parseInt(spnSO.getValue().toString());
						
						//Estadisticas del Pitcher
						H_Pitch = Integer.parseInt(spnH_Pitch.getValue().toString());
						D_Pitch = Integer.parseInt(spnD_Pitch.getValue().toString());
						CL = Integer.parseInt(spnCL.getValue().toString());
						BB_Pitch = Integer.parseInt(spnBB_Pitch.getValue().toString());
						HR_Pitch = Integer.parseInt(spnHR_Pitch.getValue().toString());
						SO_Pitch = Integer.parseInt(spnSO_Pitch.getValue().toString());
						
						if(nom.isEmpty() || date == null || cbxLanzamiento.getSelectedIndex() == 0 || cbxBateo.getSelectedIndex() == 0 ||
								cbxPais.getSelectedIndex() == 0 || cbxPosicion.getSelectedIndex() == 0 || peso == 0 || altura == 0) {
							JOptionPane.showMessageDialog(null, "Has dejado campos vac�os o sin seleccionar.","Advertencia",JOptionPane.WARNING_MESSAGE);
						}
						else if(fechaNacimiento.getCalendar().get(Calendar.YEAR) >= cal.get(Calendar.YEAR) || 
								(cal.get(Calendar.YEAR) - fechaNacimiento.getCalendar().get(Calendar.YEAR)) < 16){
							JOptionPane.showMessageDialog(null, "La fecha no es v�lida.","Advertencia",JOptionPane.WARNING_MESSAGE);
						}
						else if(index != 8){
							int edad = (cal.get(Calendar.YEAR) - fechaNacimiento.getCalendar().get(Calendar.YEAR));
							JugCampo jc = new JugCampo(nom, date, peso, altura, lanz, bat, pais, pos, equipo, null, edad);
							estad = new Estadistica(AB, D ,H ,HR , doble, triple, BB, SO, 0, 0, 0, 0, 0);
							//estad.AVG();
							jc.setEstad(estad);
							Administracion.getInstancia().getMisEquipos().get(cbxEquipo.getSelectedIndex()).getJugadores().add(jc);
							JOptionPane.showMessageDialog(null, "Se registr� el jugador con exito.");
							
						}
						else {
							int edad = (cal.get(Calendar.YEAR) - fechaNacimiento.getCalendar().get(Calendar.YEAR));
							Pitcher pit = new Pitcher(nom, date, peso, altura, lanz, bat, pais, pos, equipo, null, edad);
							estadPit = new EstadPitcher(0,H_Pitch, D_Pitch, CL, HR_Pitch, BB_Pitch, SO_Pitch, 0, 0, 0, 0);
							pit.setEstad(estadPit);
							//estadPit.PromCL();
							Administracion.getInstancia().getMisEquipos().get(cbxEquipo.getSelectedIndex()).getJugadores().add(pit);
							JOptionPane.showMessageDialog(null, "Se registr� el jugador con exito.");

						}
					}
				});
				btnRegistrar.setActionCommand("");
				buttonPane.add(btnRegistrar);
				getRootPane().setDefaultButton(btnRegistrar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 11));
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
}
