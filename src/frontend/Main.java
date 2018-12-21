package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;

import backend.Evaluate;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frmAvatarCartoEvaluator;
	private static String[] speler1Array;
	private static String[] speler2Array;
	private static int aantalzetten;
	private int huidigezetS1;
	private int huidigezetS2;
	
	JLabel s11 = new JLabel("?");
	JLabel s12 = new JLabel("?");
	JLabel s13 = new JLabel("?");
	JLabel s14 = new JLabel("?");
	JLabel s15 = new JLabel("?");
	JLabel s16 = new JLabel("?");
	JLabel s17 = new JLabel("?");
	JLabel s18 = new JLabel("?");
	JLabel s19 = new JLabel("?");
	JLabel s21 = new JLabel("?");
	JLabel s22 = new JLabel("?");
	JLabel s23 = new JLabel("?");
	JLabel s24 = new JLabel("?");
	JLabel s25 = new JLabel("?");
	JLabel s26 = new JLabel("?");
	JLabel s27 = new JLabel("?");
	JLabel s28 = new JLabel("?");
	JLabel s29 = new JLabel("?");
	static JLabel evaluation = new JLabel("0");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		speler1Array = new String[9];
		speler2Array = new String[9];
		EventQueue.invokeLater(new Runnable() {
			public void run() {				
				try {
					Main window = new Main();
					window.frmAvatarCartoEvaluator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}
	
	public void setElement(String currentElement, int speler) {	
		if (speler == 1) {
			if (huidigezetS1 == 1) {
				s11.setText(currentElement);					
			} else if (huidigezetS1 == 2) {
				s12.setText(currentElement);
			} else if (huidigezetS1 == 3) {
				s13.setText(currentElement);
			} else if (huidigezetS1 == 4) {
				s14.setText(currentElement);
			} else if (huidigezetS1 == 5) {
				s15.setText(currentElement);
			} else if (huidigezetS1 == 6) {
				s16.setText(currentElement);
			} else if (huidigezetS1 == 7) {
				s17.setText(currentElement);
			} else if (huidigezetS1 == 8) {
				s18.setText(currentElement);
			} else {
				s19.setText(currentElement);
			}
		} else {
			if (huidigezetS2 == 1) {
				s21.setText(currentElement);
			} else if (huidigezetS2 == 2) {
				s22.setText(currentElement);
			} else if (huidigezetS2 == 3) {
				s23.setText(currentElement);
			} else if (huidigezetS2 == 4) {
				s24.setText(currentElement);
			} else if (huidigezetS2 == 5) {
				s25.setText(currentElement);
			} else if (huidigezetS2 == 6) {
				s26.setText(currentElement);
			} else if (huidigezetS2 == 7) {
				s27.setText(currentElement);
			} else if (huidigezetS2 == 8) {
				s28.setText(currentElement);
			} else {
				s29.setText(currentElement);
			}
		}		 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frmAvatarCartoEvaluator = new JFrame();
		frmAvatarCartoEvaluator.setTitle("Avatar Carto Evaluator");
		frmAvatarCartoEvaluator.setBounds(100, 100, 644, 452);
		frmAvatarCartoEvaluator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAvatarCartoEvaluator.getContentPane().setLayout(null);
		
		JButton btnWater1 = new JButton("Water");
		
		btnWater1.setBackground(Color.BLUE);
		btnWater1.setBounds(27, 27, 109, 30);
		frmAvatarCartoEvaluator.getContentPane().add(btnWater1);
		
		JButton btnVuur1 = new JButton("Vuur");
		btnVuur1.setBackground(Color.RED);
		btnVuur1.setBounds(146, 27, 109, 30);
		frmAvatarCartoEvaluator.getContentPane().add(btnVuur1);
		
		JButton btnAarde1 = new JButton("Aarde");
		btnAarde1.setBackground(new Color(0, 128, 0));
		btnAarde1.setBounds(265, 27, 109, 30);
		frmAvatarCartoEvaluator.getContentPane().add(btnAarde1);
		
		JButton btnLucht1 = new JButton("Lucht");
		btnLucht1.setBackground(new Color(255, 255, 0));
		btnLucht1.setBounds(382, 27, 109, 30);
		frmAvatarCartoEvaluator.getContentPane().add(btnLucht1);
		
		JButton btnDefensie1 = new JButton("Defensie");
		btnDefensie1.setBounds(496, 27, 109, 30);
		frmAvatarCartoEvaluator.getContentPane().add(btnDefensie1);
		
		JButton btnWater2 = new JButton("Water");
		btnWater2.setBackground(Color.BLUE);
		btnWater2.setBounds(27, 227, 109, 30);
		frmAvatarCartoEvaluator.getContentPane().add(btnWater2);
		
		JButton btnVuur2 = new JButton("Vuur");
		btnVuur2.setBackground(Color.RED);
		btnVuur2.setBounds(146, 227, 109, 30);
		frmAvatarCartoEvaluator.getContentPane().add(btnVuur2);
		
		JButton btnAarde2 = new JButton("Aarde");
		btnAarde2.setBackground(new Color(0, 128, 0));
		btnAarde2.setBounds(265, 227, 109, 30);
		frmAvatarCartoEvaluator.getContentPane().add(btnAarde2);
		
		JButton btnLucht2 = new JButton("Lucht");
		btnLucht2.setBackground(new Color(255, 255, 0));
		btnLucht2.setBounds(382, 227, 109, 30);
		frmAvatarCartoEvaluator.getContentPane().add(btnLucht2);
		
		JButton btnDefensie2 = new JButton("Defensie");
		btnDefensie2.setBounds(496, 227, 109, 30);
		frmAvatarCartoEvaluator.getContentPane().add(btnDefensie2);
		
		
		s11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s11.setBounds(46, 92, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s11);
		
		
		s12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s12.setBounds(77, 92, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s12);
		
		
		s13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s13.setBounds(108, 92, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s13);
		
		
		s14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s14.setBounds(174, 92, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s14);
		
		
		s15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s15.setBounds(205, 92, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s15);
		
		
		s16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s16.setBounds(236, 92, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s16);
		
		
		s17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s17.setBounds(301, 92, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s17);
		
		
		s18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s18.setBounds(332, 92, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s18);
		
		
		s19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s19.setBounds(363, 92, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s19);
		
		
		s21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s21.setBounds(46, 146, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s21);
		
		
		s22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s22.setBounds(77, 146, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s22);
		
		
		s23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s23.setBounds(108, 146, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s23);
		
		
		s24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s24.setBounds(174, 146, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s24);
		
		
		s25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s25.setBounds(205, 146, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s25);
		
		
		s26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s26.setBounds(236, 146, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s26);
		
		
		s27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s27.setBounds(301, 146, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s27);
		
		
		s28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s28.setBounds(332, 146, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s28);
		
		
		s29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		s29.setBounds(363, 146, 21, 30);
		frmAvatarCartoEvaluator.getContentPane().add(s29);
		
		JLabel lblEvaluation = new JLabel("Evaluation: ");
		lblEvaluation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEvaluation.setBounds(440, 91, 89, 37);
		frmAvatarCartoEvaluator.getContentPane().add(lblEvaluation);
		
		
		evaluation.setFont(new Font("Tahoma", Font.BOLD, 36));
		evaluation.setBounds(440, 131, 165, 49);
		frmAvatarCartoEvaluator.getContentPane().add(evaluation);
		
		JButton btnCalc = new JButton("Calculate");
		btnCalc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Evaluate eval = new Evaluate(speler1Array, speler2Array, aantalzetten);
				evaluation.setText(String.valueOf(eval.getEvaluation()));
			}
		});
		btnCalc.setBounds(386, 301, 185, 67);
		frmAvatarCartoEvaluator.getContentPane().add(btnCalc);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				speler1Array = new String[9];
				speler2Array = new String[9];
				aantalzetten = 0;
				huidigezetS1 = 0;
				huidigezetS2 = 0;
				s11.setText("?");
				s12.setText("?");
				s13.setText("?");
				s14.setText("?");
				s15.setText("?");
				s16.setText("?");
				s17.setText("?");
				s18.setText("?");
				s19.setText("?");
				s21.setText("?");
				s22.setText("?");
				s23.setText("?");
				s24.setText("?");
				s25.setText("?");
				s26.setText("?");
				s27.setText("?");
				s28.setText("?");
				s29.setText("?");
				evaluation.setText("0");
			}
		});
		btnReset.setBounds(77, 301, 194, 67);
		frmAvatarCartoEvaluator.getContentPane().add(btnReset);
		
		btnWater1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String current = "W";
				speler1Array[huidigezetS1] = current;
				huidigezetS1++;
				aantalzetten++;
				setElement(current, 1);
			}
		});
		
		btnVuur1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String current = "V";
				speler1Array[huidigezetS1] = current;
				huidigezetS1++;
				aantalzetten++;
				setElement(current, 1);			
			}
		});
		
		btnAarde1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String current = "A";
				speler1Array[huidigezetS1] = current;
				huidigezetS1++;
				aantalzetten++;
				setElement(current, 1);		
			}
		});
		
		btnLucht1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String current = "L";
				speler1Array[huidigezetS1] = current;
				huidigezetS1++;
				aantalzetten++;
				setElement(current, 1);			
			}
		});
		
		btnDefensie1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String current = "D";
				speler1Array[huidigezetS1] = current;
				huidigezetS1++;
				aantalzetten++;
				setElement(current, 1);			
			}
		});
		
		btnWater2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String current = "W";
				speler2Array[huidigezetS2] = current;
				huidigezetS2++;
				setElement(current, 2);
			}
		});
	
		btnVuur2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String current = "V";
				speler2Array[huidigezetS2] = current;
				huidigezetS2++;
				setElement(current, 2);
			}
		});
		
		btnAarde2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String current = "A";
				speler2Array[huidigezetS2] = current;
				huidigezetS2++;
				setElement(current, 2);
			}
		});
		
		btnLucht2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String current = "L";
				speler2Array[huidigezetS2] = current;
				huidigezetS2++;
				setElement(current, 2);
			}
		});
		
		btnDefensie2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String current = "D";
				speler2Array[huidigezetS2] = current;
				huidigezetS2++;
				setElement(current, 2);
			}
		});
	}
}
