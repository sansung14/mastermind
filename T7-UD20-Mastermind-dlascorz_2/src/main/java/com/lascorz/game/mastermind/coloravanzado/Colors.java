package com.lascorz.game.mastermind.coloravanzado;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.lascorz.game.mastermind.avanzado.Avanzado;
import com.lascorz.game.mastermind.colores.Paletacolores;

public class Colors extends JFrame {

	/**
	 * 
	 */
	
	// Diseño del juego //
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static Colors venta;
	static Color[]	rgb = new Color[13];
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	static int count = 0;
	private static JTextField textField_4;
	private static JTextField textField_5;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					venta = new Colors();
					SelecColor();
					addEventos();
					venta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Colors() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 265);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(50, 48, 40, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(112, 48, 40, 36);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(177, 48, 40, 36);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(242, 48, 40, 36);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(128, 140, 89, 23);
		contentPane.add(btnNewButton);
		
		// Botón cancelar //
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(242, 140, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(306, 48, 40, 36);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(371, 48, 40, 36);
		contentPane.add(textField_5);
		
		// Botón aceptar //
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Avanzado.colores[0]=textField.getBackground();
				Avanzado.colores[1]=textField_1.getBackground();
				Avanzado.colores[2]=textField_2.getBackground();
				Avanzado.colores[3]=textField_3.getBackground();
				Avanzado.colores[4]=textField_4.getBackground();
				Avanzado.colores[5]=textField_5.getBackground();

				Avanzado.randomColors();
				venta.dispose();
			}
		});

		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setBackground(rgb[0]);
				textField_1.setBackground(rgb[0]);
				textField_2.setBackground(rgb[0]);
				textField_3.setBackground(rgb[0]);
				textField_4.setBackground(rgb[0]);
				textField_5.setBackground(rgb[0]);

			}
		});
	}
	
	public static void addEventos() {
		textField.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setBackground(Paletacolores.main(null,textField));
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

		});
		textField_1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_1.setBackground(Paletacolores.main(null,textField_1));
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

		});
		textField_2.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_2.setBackground(Paletacolores.main(null,textField_2));
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

		});
		textField_3.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_3.setBackground(Paletacolores.main(null,textField_3));
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

		});
		textField_4.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_4.setBackground(Paletacolores.main(null,textField_4));
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

		});
		textField_5.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_5.setBackground(Paletacolores.main(null,textField_5));
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

		});
		
	}
	
	
	// Creamos un array de colores //
	public static void SelecColor() {
		rgb[0] = Color.white;
		rgb[1] = Color.lightGray;
		rgb[2] = Color.gray;
		rgb[3] = Color.darkGray;
		rgb[4] = Color.black;
		rgb[5] = Color.red;
		rgb[6] = Color.pink;
		rgb[7] = Color.orange;
		rgb[8] = Color.yellow;
		rgb[9] = Color.green;
		rgb[10] = Color.magenta;
		rgb[11] = Color.cyan;
		rgb[12] = Color.blue;
		textField.setBackground(rgb[0]);
		textField_1.setBackground(rgb[0]);
		textField_2.setBackground(rgb[0]);
		textField_3.setBackground(rgb[0]);
		textField_4.setBackground(rgb[0]);
		textField_5.setBackground(rgb[0]);


	}
}