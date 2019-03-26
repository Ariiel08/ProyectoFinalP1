package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Gesti\u00F3n de Estad\u00EDsticas de beisbol");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 370);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNuevo = new JMenu("Nuevo");
		mnNuevo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		menuBar.add(mnNuevo);
		
		JMenuItem mntmJugador = new JMenuItem("Jugador");
		mntmJugador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegJugador regj = new RegJugador();
				regj.setModal(true);
				regj.setVisible(true);
			}
		});
		mntmJugador.setFont(new Font("Tahoma", Font.PLAIN, 11));
		mnNuevo.add(mntmJugador);
		
		JMenuItem mntmEquipo = new JMenuItem("Equipo");
		mntmEquipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		mnNuevo.add(mntmEquipo);
		
		JMenu mnGestionar = new JMenu("Gestionar");
		mnGestionar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		menuBar.add(mnGestionar);
		
		JMenuItem mntmJugadores = new JMenuItem("Jugadores");
		mntmJugadores.setFont(new Font("Tahoma", Font.PLAIN, 11));
		mnGestionar.add(mntmJugadores);
		
		JMenuItem mntmEquipos = new JMenuItem("Equipos");
		mntmEquipos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		mnGestionar.add(mntmEquipos);
		
		JMenu mnCalendario = new JMenu("Calendario");
		mnCalendario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		menuBar.add(mnCalendario);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
