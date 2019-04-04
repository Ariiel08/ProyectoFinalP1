package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Simulacion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JPanel panel_6;
	private JLabel label;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JPanel panel_7;
	private JLabel lblCHE;


	public Simulacion() {
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
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(20, 0, 36, 36);
			panel_5.add(textField);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(76, 0, 36, 36);
			panel_5.add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(132, 0, 36, 36);
			panel_5.add(textField_2);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(188, 0, 36, 36);
			panel_5.add(textField_3);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(244, 0, 36, 36);
			panel_5.add(textField_4);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(300, 0, 36, 36);
			panel_5.add(textField_5);
			
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(356, 0, 36, 36);
			panel_5.add(textField_6);
			
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(412, 0, 36, 36);
			panel_5.add(textField_7);
			
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(468, 0, 36, 36);
			panel_5.add(textField_8);
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
				
				textField_9 = new JTextField();
				textField_9.setColumns(10);
				textField_9.setBounds(20, 0, 36, 36);
				panel_4.add(textField_9);
				
				textField_10 = new JTextField();
				textField_10.setColumns(10);
				textField_10.setBounds(76, 0, 36, 36);
				panel_4.add(textField_10);
				
				textField_11 = new JTextField();
				textField_11.setColumns(10);
				textField_11.setBounds(132, 0, 36, 36);
				panel_4.add(textField_11);
				
				textField_12 = new JTextField();
				textField_12.setColumns(10);
				textField_12.setBounds(188, 0, 36, 36);
				panel_4.add(textField_12);
				
				textField_13 = new JTextField();
				textField_13.setColumns(10);
				textField_13.setBounds(244, 0, 36, 36);
				panel_4.add(textField_13);
				
				textField_14 = new JTextField();
				textField_14.setColumns(10);
				textField_14.setBounds(300, 0, 36, 36);
				panel_4.add(textField_14);
				
				textField_15 = new JTextField();
				textField_15.setColumns(10);
				textField_15.setBounds(356, 0, 36, 36);
				panel_4.add(textField_15);
				
				textField_16 = new JTextField();
				textField_16.setColumns(10);
				textField_16.setBounds(412, 0, 36, 36);
				panel_4.add(textField_16);
				
				textField_17 = new JTextField();
				textField_17.setColumns(10);
				textField_17.setBounds(468, 0, 36, 36);
				panel_4.add(textField_17);
				
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
				
				textField_18 = new JTextField();
				textField_18.setColumns(10);
				textField_18.setBounds(8, 12, 36, 36);
				panel_3.add(textField_18);
				
				textField_19 = new JTextField();
				textField_19.setColumns(10);
				textField_19.setBounds(52, 12, 36, 36);
				panel_3.add(textField_19);
				
				textField_20 = new JTextField();
				textField_20.setColumns(10);
				textField_20.setBounds(96, 12, 36, 36);
				panel_3.add(textField_20);
				
				textField_21 = new JTextField();
				textField_21.setColumns(10);
				textField_21.setBounds(8, 85, 36, 36);
				panel_3.add(textField_21);
				
				textField_22 = new JTextField();
				textField_22.setColumns(10);
				textField_22.setBounds(52, 85, 36, 36);
				panel_3.add(textField_22);
				
				textField_23 = new JTextField();
				textField_23.setColumns(10);
				textField_23.setBounds(96, 85, 36, 36);
				panel_3.add(textField_23);
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
	}
}
