package com.lascorz.game.mastermind.principiante;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import com.lascorz.game.mastermind.App;
import com.lascorz.game.mastermind.colorprincipiante.Colors;
import com.lascorz.game.mastermind.nivel.Niveles;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Principiante extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Tenemos 4 colores definidos para el nivel principiante //
	public static Color[] colores = new Color[4];
	static int count = 0;
	static int intentos = 0;
	
	// Definimos el diseño del juego //
	private JPanel contentPane;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_8;
	private static JTextField textField_9;
	private static JTextField textField_10;
	private static JTextField textField_11;
	private static JTextField textField_12;
	private static JTextField textField_13;
	private static JTextField textField_14;
	private static JTextField textField_15;
	private static JTextField textField_16;
	private static JTextField textField_17;
	private static JTextField textField_18;
	private static JTextField textField_19;
	private static JTextField textField_20;
	private static JTextField textField_21;
	private static JTextField textField_22;
	private static JTextField textField_23;
	private static JTextField textField_24;
	private static JTextField textField_25;
	private static JTextField textField_26;
	private static JTextField textField_27;
	private static JTextField textField_28;
	private static JTextField textField_29;
	private static JTextField textField_30;
	private static JTextField textField_31;
	private static JTextField textField_32;
	private static JTextField textField_33;
	private static JTextField textField_34;
	private static JTextField textField_35;
	private static JTextField textField_36;
	private static JTextField textField_37;
	private static JTextField textField_38;
	private static JTextField textField_39;
	private static JTextField textField_40;
	private static JTextField textField_41;
	private static JTextField textField_42;
	private static JTextField textField_43;
	private static JTextField textField_44;
	private static JTextField textField_45;
	private static JTextField textField_46;
	private static JTextField textField_47;
	private static JTextField textField_48;
	private static JTextField textField_49;
	private static JTextField textField_50;
	private static JTextField textField_51;
	private static JTextField textField_52;
	private static JTextField textField_53;
	private static JTextField textField_54;
	private static JTextField textField_55;
	private static JTextField textField_56;
	private static JTextField textField_57;
	private static JTextField textField_58;
	private static JTextField textField_59;
	private static JTextField textField_60;
	private static JTextField textField_61;
	private static JTextField textField_62;
	private static JTextField textField_63;
	private static JTextField textField_64;
	private static JTextField textField_65;
	private static JTextField textField_66;
	private static JTextField textField_67;
	private static JTextField textField_68;
	private static JTextField textField_69;
	private static JTextField textField_70;
	private static JTextField textField_71;
	private static JTextField textField_72;
	private static JTextField textField_73;
	private static JTextField textField_74;
	private static JTextField textField_75;
	private static JTextField textField_76;
	private static JTextField textField_77;
	private static JTextField textField_78;
	private static JTextField textField_79;
	private static JTextField textField_80;
	private static JTextField textField_81;
	private static JTextField textField_82;
	private static JTextField textField_83;
	private static JTextField textField_84;
	private static JTextField textField_85;
	private static JTextField textField_86;
	private static JTextField textField_87;
	private static JLabel lblColoresSecretos;
	private static JLayeredPane layeredPane_1;
	private static JMenuItem mntmNewMenuItem_2;
	private static JMenuItem mntmNewMenuItem_1;
	private static JMenuItem mntmNewMenuItem;

	public static Principiante principiante;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principiante = new Principiante();
					colors();
					addEventos();
					Primerajugada();
					principiante.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}

	/**
	 * Create the frame.
	 */
	public Principiante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 858, 615);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		// Botón opciones//
		JMenu mnNewMenu = new JMenu("Opciones");
		menuBar.add(mnNewMenu);

		// Botón seleccionar colores //
		mntmNewMenuItem = new JMenuItem("Seleccionar Colores");
		mntmNewMenuItem.setVisible(false);
		mnNewMenu.add(mntmNewMenuItem);

		// Botón seleccionar nivel//
		mntmNewMenuItem_1 = new JMenuItem("Seleccionar Nivel");
		mnNewMenu.add(mntmNewMenuItem_1);

		// Botón nuevo juego//
		mntmNewMenuItem_2 = new JMenuItem("Nuevo Juego");
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Botón colores disponibles //
		JLabel lblNewLabel = new JLabel("Colores Disponibles");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(588, 41, 116, 14);
		contentPane.add(lblNewLabel);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane.setForeground(Color.LIGHT_GRAY);
		layeredPane.setBounds(588, 60, 219, 62);
		contentPane.add(layeredPane);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 11, 42, 38);
		layeredPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(62, 11, 42, 38);
		layeredPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(114, 11, 42, 38);
		layeredPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(166, 11, 42, 38);
		layeredPane.add(textField_3);

		layeredPane_1 = new JLayeredPane();
		layeredPane_1.setForeground(Color.LIGHT_GRAY);
		layeredPane_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane_1.setBounds(588, 174, 219, 62);
		contentPane.add(layeredPane_1);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(10, 11, 42, 38);
		layeredPane_1.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(62, 11, 42, 38);
		layeredPane_1.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(114, 11, 42, 38);
		layeredPane_1.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(166, 11, 42, 38);
		layeredPane_1.add(textField_7);
		layeredPane_1.setVisible(false);

		// Colores secretos//
		lblColoresSecretos = new JLabel("Colores Secretos");
		lblColoresSecretos.setToolTipText("");
		lblColoresSecretos.setBounds(588, 155, 116, 14);
		contentPane.add(lblColoresSecretos);
		lblColoresSecretos.setVisible(false);

		// Diseño de todos los cuadrados del juego ( 4 filas x 5 columnas) //
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(35, 41, 42, 38);
		contentPane.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(87, 41, 42, 38);
		contentPane.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(139, 41, 42, 38);
		contentPane.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(191, 41, 42, 38);
		contentPane.add(textField_11);

		// Botón comprobar para ver si hemos acertado con los colores //
		final JButton btnNewButton = new JButton("Comp");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 13));
		btnNewButton.setForeground(new Color(51, 0, 153));
		btnNewButton.setBackground(new Color(51, 255, 51));
		btnNewButton.setBounds(250, 49, 81, 25);
		contentPane.add(btnNewButton);

		textField_12 = new JTextField();
		textField_12.setBackground(Color.GRAY);
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(349, 41, 42, 38);
		contentPane.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setBackground(Color.GRAY);
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(401, 41, 42, 38);
		contentPane.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setBackground(Color.GRAY);
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(453, 41, 42, 38);
		contentPane.add(textField_14);

		textField_15 = new JTextField();
		textField_15.setBackground(Color.GRAY);
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(505, 41, 42, 38);
		contentPane.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setEnabled(false);
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(35, 90, 42, 38);
		contentPane.add(textField_16);

		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(87, 90, 42, 38);
		contentPane.add(textField_17);

		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(139, 90, 42, 38);
		contentPane.add(textField_18);

		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(191, 90, 42, 38);
		contentPane.add(textField_19);

		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(35, 135, 42, 38);
		contentPane.add(textField_20);

		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(87, 135, 42, 38);
		contentPane.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(139, 135, 42, 38);
		contentPane.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(191, 135, 42, 38);
		contentPane.add(textField_23);

		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(35, 184, 42, 38);
		contentPane.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(87, 184, 42, 38);
		contentPane.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBounds(139, 184, 42, 38);
		contentPane.add(textField_26);

		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBounds(191, 184, 42, 38);
		contentPane.add(textField_27);

		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		textField_28.setBounds(35, 233, 42, 38);
		contentPane.add(textField_28);

		textField_29 = new JTextField();
		textField_29.setEditable(false);
		textField_29.setColumns(10);
		textField_29.setBounds(87, 233, 42, 38);
		contentPane.add(textField_29);

		textField_30 = new JTextField();
		textField_30.setEditable(false);
		textField_30.setColumns(10);
		textField_30.setBounds(139, 233, 42, 38);
		contentPane.add(textField_30);

		textField_31 = new JTextField();
		textField_31.setEditable(false);
		textField_31.setColumns(10);
		textField_31.setBounds(191, 233, 42, 38);
		contentPane.add(textField_31);

		textField_32 = new JTextField();
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		textField_32.setBounds(35, 282, 42, 38);
		contentPane.add(textField_32);

		textField_33 = new JTextField();
		textField_33.setEditable(false);
		textField_33.setColumns(10);
		textField_33.setBounds(87, 282, 42, 38);
		contentPane.add(textField_33);

		textField_34 = new JTextField();
		textField_34.setEditable(false);
		textField_34.setColumns(10);
		textField_34.setBounds(139, 282, 42, 38);
		contentPane.add(textField_34);

		textField_35 = new JTextField();
		textField_35.setEditable(false);
		textField_35.setColumns(10);
		textField_35.setBounds(191, 282, 42, 38);
		contentPane.add(textField_35);

		textField_36 = new JTextField();
		textField_36.setEditable(false);
		textField_36.setColumns(10);
		textField_36.setBounds(35, 331, 42, 38);
		contentPane.add(textField_36);

		textField_37 = new JTextField();
		textField_37.setEditable(false);
		textField_37.setColumns(10);
		textField_37.setBounds(87, 331, 42, 38);
		contentPane.add(textField_37);

		textField_38 = new JTextField();
		textField_38.setEditable(false);
		textField_38.setColumns(10);
		textField_38.setBounds(139, 331, 42, 38);
		contentPane.add(textField_38);

		textField_39 = new JTextField();
		textField_39.setEditable(false);
		textField_39.setColumns(10);
		textField_39.setBounds(191, 331, 42, 38);
		contentPane.add(textField_39);

		textField_40 = new JTextField();
		textField_40.setEditable(false);
		textField_40.setColumns(10);
		textField_40.setBounds(35, 380, 42, 38);
		contentPane.add(textField_40);

		textField_41 = new JTextField();
		textField_41.setEditable(false);
		textField_41.setColumns(10);
		textField_41.setBounds(87, 380, 42, 38);
		contentPane.add(textField_41);

		textField_42 = new JTextField();
		textField_42.setEditable(false);
		textField_42.setColumns(10);
		textField_42.setBounds(139, 380, 42, 38);
		contentPane.add(textField_42);

		textField_43 = new JTextField();
		textField_43.setEditable(false);
		textField_43.setColumns(10);
		textField_43.setBounds(191, 380, 42, 38);
		contentPane.add(textField_43);

		textField_44 = new JTextField();
		textField_44.setEditable(false);
		textField_44.setColumns(10);
		textField_44.setBounds(35, 429, 42, 38);
		contentPane.add(textField_44);

		textField_45 = new JTextField();
		textField_45.setEditable(false);
		textField_45.setColumns(10);
		textField_45.setBounds(87, 429, 42, 38);
		contentPane.add(textField_45);

		textField_46 = new JTextField();
		textField_46.setEditable(false);
		textField_46.setColumns(10);
		textField_46.setBounds(139, 429, 42, 38);
		contentPane.add(textField_46);

		textField_47 = new JTextField();
		textField_47.setEditable(false);
		textField_47.setColumns(10);
		textField_47.setBounds(191, 429, 42, 38);
		contentPane.add(textField_47);

		textField_48 = new JTextField();
		textField_48.setEditable(false);
		textField_48.setColumns(10);
		textField_48.setBounds(35, 478, 42, 38);
		contentPane.add(textField_48);

		textField_49 = new JTextField();
		textField_49.setEditable(false);
		textField_49.setColumns(10);
		textField_49.setBounds(87, 478, 42, 38);
		contentPane.add(textField_49);

		textField_50 = new JTextField();
		textField_50.setEditable(false);
		textField_50.setColumns(10);
		textField_50.setBounds(139, 478, 42, 38);
		contentPane.add(textField_50);

		textField_51 = new JTextField();
		textField_51.setEditable(false);
		textField_51.setColumns(10);
		textField_51.setBounds(191, 478, 42, 38);
		contentPane.add(textField_51);

		textField_52 = new JTextField();
		textField_52.setBackground(Color.GRAY);
		textField_52.setEditable(false);
		textField_52.setColumns(10);
		textField_52.setBounds(349, 90, 42, 38);
		contentPane.add(textField_52);

		textField_53 = new JTextField();
		textField_53.setBackground(Color.GRAY);
		textField_53.setEditable(false);
		textField_53.setColumns(10);
		textField_53.setBounds(401, 90, 42, 38);
		contentPane.add(textField_53);

		textField_54 = new JTextField();
		textField_54.setBackground(Color.GRAY);
		textField_54.setEditable(false);
		textField_54.setColumns(10);
		textField_54.setBounds(453, 90, 42, 38);
		contentPane.add(textField_54);

		textField_55 = new JTextField();
		textField_55.setBackground(Color.GRAY);
		textField_55.setEditable(false);
		textField_55.setColumns(10);
		textField_55.setBounds(505, 90, 42, 38);
		contentPane.add(textField_55);

		textField_56 = new JTextField();
		textField_56.setBackground(Color.GRAY);
		textField_56.setEditable(false);
		textField_56.setColumns(10);
		textField_56.setBounds(349, 135, 42, 38);
		contentPane.add(textField_56);

		textField_57 = new JTextField();
		textField_57.setBackground(Color.GRAY);
		textField_57.setEditable(false);
		textField_57.setColumns(10);
		textField_57.setBounds(401, 135, 42, 38);
		contentPane.add(textField_57);

		textField_58 = new JTextField();
		textField_58.setBackground(Color.GRAY);
		textField_58.setEditable(false);
		textField_58.setColumns(10);
		textField_58.setBounds(453, 135, 42, 38);
		contentPane.add(textField_58);

		textField_59 = new JTextField();
		textField_59.setBackground(Color.GRAY);
		textField_59.setEditable(false);
		textField_59.setColumns(10);
		textField_59.setBounds(505, 135, 42, 38);
		contentPane.add(textField_59);

		textField_60 = new JTextField();
		textField_60.setBackground(Color.GRAY);
		textField_60.setEditable(false);
		textField_60.setColumns(10);
		textField_60.setBounds(349, 184, 42, 38);
		contentPane.add(textField_60);

		textField_61 = new JTextField();
		textField_61.setBackground(Color.GRAY);
		textField_61.setEditable(false);
		textField_61.setColumns(10);
		textField_61.setBounds(401, 184, 42, 38);
		contentPane.add(textField_61);

		textField_62 = new JTextField();
		textField_62.setBackground(Color.GRAY);
		textField_62.setEditable(false);
		textField_62.setColumns(10);
		textField_62.setBounds(453, 184, 42, 38);
		contentPane.add(textField_62);

		textField_63 = new JTextField();
		textField_63.setBackground(Color.GRAY);
		textField_63.setEditable(false);
		textField_63.setColumns(10);
		textField_63.setBounds(505, 184, 42, 38);
		contentPane.add(textField_63);

		textField_64 = new JTextField();
		textField_64.setBackground(Color.GRAY);
		textField_64.setEditable(false);
		textField_64.setColumns(10);
		textField_64.setBounds(349, 233, 42, 38);
		contentPane.add(textField_64);

		textField_65 = new JTextField();
		textField_65.setBackground(Color.GRAY);
		textField_65.setEditable(false);
		textField_65.setColumns(10);
		textField_65.setBounds(401, 233, 42, 38);
		contentPane.add(textField_65);

		textField_66 = new JTextField();
		textField_66.setBackground(Color.GRAY);
		textField_66.setEditable(false);
		textField_66.setColumns(10);
		textField_66.setBounds(453, 233, 42, 38);
		contentPane.add(textField_66);

		textField_67 = new JTextField();
		textField_67.setBackground(Color.GRAY);
		textField_67.setEditable(false);
		textField_67.setColumns(10);
		textField_67.setBounds(505, 233, 42, 38);
		contentPane.add(textField_67);

		textField_68 = new JTextField();
		textField_68.setBackground(Color.GRAY);
		textField_68.setEditable(false);
		textField_68.setColumns(10);
		textField_68.setBounds(349, 282, 42, 38);
		contentPane.add(textField_68);

		textField_69 = new JTextField();
		textField_69.setBackground(Color.GRAY);
		textField_69.setEditable(false);
		textField_69.setColumns(10);
		textField_69.setBounds(401, 282, 42, 38);
		contentPane.add(textField_69);

		textField_70 = new JTextField();
		textField_70.setBackground(Color.GRAY);
		textField_70.setEditable(false);
		textField_70.setColumns(10);
		textField_70.setBounds(453, 282, 42, 38);
		contentPane.add(textField_70);

		textField_71 = new JTextField();
		textField_71.setBackground(Color.GRAY);
		textField_71.setEditable(false);
		textField_71.setColumns(10);
		textField_71.setBounds(505, 282, 42, 38);
		contentPane.add(textField_71);

		textField_72 = new JTextField();
		textField_72.setBackground(Color.GRAY);
		textField_72.setEditable(false);
		textField_72.setColumns(10);
		textField_72.setBounds(349, 331, 42, 38);
		contentPane.add(textField_72);

		textField_73 = new JTextField();
		textField_73.setBackground(Color.GRAY);
		textField_73.setEditable(false);
		textField_73.setColumns(10);
		textField_73.setBounds(401, 331, 42, 38);
		contentPane.add(textField_73);

		textField_74 = new JTextField();
		textField_74.setBackground(Color.GRAY);
		textField_74.setEditable(false);
		textField_74.setColumns(10);
		textField_74.setBounds(453, 331, 42, 38);
		contentPane.add(textField_74);

		textField_75 = new JTextField();
		textField_75.setBackground(Color.GRAY);
		textField_75.setEditable(false);
		textField_75.setColumns(10);
		textField_75.setBounds(505, 331, 42, 38);
		contentPane.add(textField_75);

		textField_76 = new JTextField();
		textField_76.setBackground(Color.GRAY);
		textField_76.setEditable(false);
		textField_76.setColumns(10);
		textField_76.setBounds(349, 380, 42, 38);
		contentPane.add(textField_76);

		textField_77 = new JTextField();
		textField_77.setBackground(Color.GRAY);
		textField_77.setEditable(false);
		textField_77.setColumns(10);
		textField_77.setBounds(401, 380, 42, 38);
		contentPane.add(textField_77);

		textField_78 = new JTextField();
		textField_78.setBackground(Color.GRAY);
		textField_78.setEditable(false);
		textField_78.setColumns(10);
		textField_78.setBounds(453, 380, 42, 38);
		contentPane.add(textField_78);

		textField_79 = new JTextField();
		textField_79.setBackground(Color.GRAY);
		textField_79.setEditable(false);
		textField_79.setColumns(10);
		textField_79.setBounds(505, 380, 42, 38);
		contentPane.add(textField_79);

		textField_80 = new JTextField();
		textField_80.setBackground(Color.GRAY);
		textField_80.setEditable(false);
		textField_80.setColumns(10);
		textField_80.setBounds(349, 429, 42, 38);
		contentPane.add(textField_80);

		textField_81 = new JTextField();
		textField_81.setBackground(Color.GRAY);
		textField_81.setEditable(false);
		textField_81.setColumns(10);
		textField_81.setBounds(401, 429, 42, 38);
		contentPane.add(textField_81);

		textField_82 = new JTextField();
		textField_82.setBackground(Color.GRAY);
		textField_82.setEditable(false);
		textField_82.setColumns(10);
		textField_82.setBounds(453, 429, 42, 38);
		contentPane.add(textField_82);

		textField_83 = new JTextField();
		textField_83.setBackground(Color.GRAY);
		textField_83.setEditable(false);
		textField_83.setColumns(10);
		textField_83.setBounds(505, 429, 42, 38);
		contentPane.add(textField_83);

		textField_84 = new JTextField();
		textField_84.setBackground(Color.GRAY);
		textField_84.setEditable(false);
		textField_84.setColumns(10);
		textField_84.setBounds(349, 478, 42, 38);
		contentPane.add(textField_84);

		textField_85 = new JTextField();
		textField_85.setBackground(Color.GRAY);
		textField_85.setEditable(false);
		textField_85.setColumns(10);
		textField_85.setBounds(401, 478, 42, 38);
		contentPane.add(textField_85);

		textField_86 = new JTextField();
		textField_86.setBackground(Color.GRAY);
		textField_86.setEditable(false);
		textField_86.setColumns(10);
		textField_86.setBounds(453, 478, 42, 38);
		contentPane.add(textField_86);

		textField_87 = new JTextField();
		textField_87.setBackground(Color.GRAY);
		textField_87.setEditable(false);
		textField_87.setColumns(10);
		textField_87.setBounds(505, 478, 42, 38);
		contentPane.add(textField_87);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (intentos == 0) {

					if (textField_8.getBackground().equals(textField_4.getBackground())) {
						textField_12.setBackground(Color.black);
					} else if(textField_8.getBackground().equals(textField_5.getBackground()) || textField_8.getBackground().equals(textField_6.getBackground()) || textField_8.getBackground().equals(textField_7.getBackground())) {
						textField_12.setBackground(Color.white);
					}
					if (textField_9.getBackground().equals(textField_5.getBackground())) {
						textField_13.setBackground(Color.black);
					} else if(textField_9.getBackground().equals(textField_4.getBackground()) || textField_9.getBackground().equals(textField_6.getBackground()) || textField_9.getBackground().equals(textField_7.getBackground())) {
						textField_13.setBackground(Color.white);
					}
					if (textField_10.getBackground().equals(textField_6.getBackground())) {
						textField_14.setBackground(Color.black);
					} else if(textField_10.getBackground().equals(textField_5.getBackground()) || textField_10.getBackground().equals(textField_4.getBackground()) || textField_10.getBackground().equals(textField_7.getBackground())) {
						textField_14.setBackground(Color.white);
					}
					if (textField_11.getBackground().equals(textField_7.getBackground())) {
						textField_15.setBackground(Color.black);
					} else if(textField_11.getBackground().equals(textField_4.getBackground()) || textField_11.getBackground().equals(textField_5.getBackground()) || textField_11.getBackground().equals(textField_6.getBackground())) {
						textField_15.setBackground(Color.white);
					}
					if (textField_12.getBackground().equals(Color.black)
							&& textField_13.getBackground().equals(Color.black)
							&& textField_14.getBackground().equals(Color.black)
							&& textField_15.getBackground().equals(Color.black)) {
						JOptionPane.showMessageDialog(null, "Enhorabuena has ganado!");
						lblColoresSecretos.setVisible(true);
						layeredPane_1.setVisible(true);
						App.PrimeraJugada = true;
						btnNewButton.setVisible(false);
					} else {
						intentos++;
						btnNewButton.setBounds(250, 95, 81, 25);

					}

				} else if (intentos == 1) {

					if (textField_16.getBackground().equals(textField_4.getBackground())) {
						textField_52.setBackground(Color.black);
					} else if(textField_16.getBackground().equals(textField_5.getBackground()) || textField_16.getBackground().equals(textField_6.getBackground()) || textField_16.getBackground().equals(textField_7.getBackground())) {
						textField_52.setBackground(Color.white);
					}
					if (textField_17.getBackground().equals(textField_5.getBackground())) {
						textField_53.setBackground(Color.black);
					} else if(textField_17.getBackground().equals(textField_4.getBackground()) || textField_17.getBackground().equals(textField_6.getBackground()) || textField_17.getBackground().equals(textField_7.getBackground())) {
						textField_53.setBackground(Color.white);
					}
					if (textField_18.getBackground().equals(textField_6.getBackground())) {
						textField_54.setBackground(Color.black);
					} else if(textField_18.getBackground().equals(textField_5.getBackground()) || textField_18.getBackground().equals(textField_4.getBackground()) || textField_18.getBackground().equals(textField_7.getBackground())) {
						textField_54.setBackground(Color.white);
					}
					if (textField_19.getBackground().equals(textField_7.getBackground())) {
						textField_55.setBackground(Color.black);
					} else if(textField_19.getBackground().equals(textField_5.getBackground()) || textField_19.getBackground().equals(textField_4.getBackground()) || textField_19.getBackground().equals(textField_6.getBackground())) {
						textField_55.setBackground(Color.white);
					}
					if (textField_52.getBackground().equals(Color.black)
							&& textField_53.getBackground().equals(Color.black)
							&& textField_54.getBackground().equals(Color.black)
							&& textField_55.getBackground().equals(Color.black)) {
						JOptionPane.showMessageDialog(null, "Enhorabuena has ganado!");
						lblColoresSecretos.setVisible(true);
						layeredPane_1.setVisible(true);
						App.PrimeraJugada = true;
						btnNewButton.setVisible(false);
					} else {
						intentos++;
						btnNewButton.setBounds(250, 140, 81, 25);
					}

				} else if (intentos == 2) {

					if (textField_20.getBackground().equals(textField_4.getBackground())) {
						textField_56.setBackground(Color.black);
					} else if(textField_20.getBackground().equals(textField_5.getBackground()) || textField_20.getBackground().equals(textField_6.getBackground()) || textField_20.getBackground().equals(textField_7.getBackground())) {
						textField_56.setBackground(Color.white);
					}
					if (textField_21.getBackground().equals(textField_5.getBackground())) {
						textField_57.setBackground(Color.black);
					} else if(textField_21.getBackground().equals(textField_4.getBackground()) || textField_21.getBackground().equals(textField_6.getBackground()) || textField_21.getBackground().equals(textField_7.getBackground())) {
						textField_57.setBackground(Color.white);
					}
					if (textField_22.getBackground().equals(textField_6.getBackground())) {
						textField_58.setBackground(Color.black);
					} else if(textField_22.getBackground().equals(textField_5.getBackground()) || textField_22.getBackground().equals(textField_4.getBackground()) || textField_22.getBackground().equals(textField_7.getBackground())) {
						textField_58.setBackground(Color.white);
					}
					if (textField_23.getBackground().equals(textField_7.getBackground())) {
						textField_59.setBackground(Color.black);
					} else if(textField_23.getBackground().equals(textField_5.getBackground()) || textField_23.getBackground().equals(textField_4.getBackground()) || textField_23.getBackground().equals(textField_6.getBackground())) {
						textField_59.setBackground(Color.white);
					}
					if (textField_56.getBackground().equals(Color.black)
							&& textField_57.getBackground().equals(Color.black)
							&& textField_58.getBackground().equals(Color.black)
							&& textField_59.getBackground().equals(Color.black)) {
						JOptionPane.showMessageDialog(null, "Enhorabuena has ganado!");
						lblColoresSecretos.setVisible(true);
						layeredPane_1.setVisible(true);
						App.PrimeraJugada = true;
						btnNewButton.setVisible(false);
					} else {
						intentos++;
						btnNewButton.setBounds(250, 190, 81, 25);
					}

				} else if (intentos == 3) {

					if (textField_24.getBackground().equals(textField_4.getBackground())) {
						textField_60.setBackground(Color.black);
					} else if(textField_24.getBackground().equals(textField_5.getBackground()) || textField_24.getBackground().equals(textField_6.getBackground()) || textField_24.getBackground().equals(textField_7.getBackground())) {
						textField_60.setBackground(Color.white);
					}
					if (textField_25.getBackground().equals(textField_5.getBackground())) {
						textField_61.setBackground(Color.black);
					} else if(textField_25.getBackground().equals(textField_4.getBackground()) || textField_25.getBackground().equals(textField_6.getBackground()) || textField_25.getBackground().equals(textField_7.getBackground())) {
						textField_61.setBackground(Color.white);
					}
					if (textField_26.getBackground().equals(textField_6.getBackground())) {
						textField_62.setBackground(Color.black);
					} else if(textField_26.getBackground().equals(textField_5.getBackground()) || textField_26.getBackground().equals(textField_4.getBackground()) || textField_26.getBackground().equals(textField_7.getBackground())) {
						textField_62.setBackground(Color.white);
					}
					if (textField_27.getBackground().equals(textField_7.getBackground())) {
						textField_63.setBackground(Color.black);
					} else if(textField_27.getBackground().equals(textField_5.getBackground()) || textField_27.getBackground().equals(textField_4.getBackground()) || textField_27.getBackground().equals(textField_6.getBackground())) {
						textField_63.setBackground(Color.white);
					}
					if (textField_60.getBackground().equals(Color.black)
							&& textField_61.getBackground().equals(Color.black)
							&& textField_62.getBackground().equals(Color.black)
							&& textField_63.getBackground().equals(Color.black)) {
						JOptionPane.showMessageDialog(null, "Enhorabuena has ganado!");
						lblColoresSecretos.setVisible(true);
						layeredPane_1.setVisible(true);
						App.PrimeraJugada = true;
						btnNewButton.setVisible(false);
					} else {
						intentos++;
						btnNewButton.setBounds(250, 240, 81, 25);
					}

				} else if (intentos == 4) {

					if (textField_28.getBackground().equals(textField_4.getBackground())) {
						textField_64.setBackground(Color.black);
					} else if(textField_28.getBackground().equals(textField_5.getBackground()) || textField_28.getBackground().equals(textField_6.getBackground()) || textField_28.getBackground().equals(textField_7.getBackground())) {
						textField_64.setBackground(Color.white);
					}
					if (textField_29.getBackground().equals(textField_5.getBackground())) {
						textField_65.setBackground(Color.black);
					} else if(textField_29.getBackground().equals(textField_4.getBackground()) || textField_29.getBackground().equals(textField_6.getBackground()) || textField_29.getBackground().equals(textField_7.getBackground())) {
						textField_65.setBackground(Color.white);
					}
					if (textField_30.getBackground().equals(textField_6.getBackground())) {
						textField_66.setBackground(Color.black);
					} else if(textField_30.getBackground().equals(textField_5.getBackground()) || textField_30.getBackground().equals(textField_4.getBackground()) || textField_30.getBackground().equals(textField_7.getBackground())) {
						textField_66.setBackground(Color.white);
					}
					if (textField_31.getBackground().equals(textField_7.getBackground())) {
						textField_67.setBackground(Color.black);
					} else if(textField_31.getBackground().equals(textField_5.getBackground()) || textField_31.getBackground().equals(textField_4.getBackground()) || textField_31.getBackground().equals(textField_6.getBackground())) {
						textField_67.setBackground(Color.white);
					}
					if (textField_64.getBackground().equals(Color.black)
							&& textField_65.getBackground().equals(Color.black)
							&& textField_66.getBackground().equals(Color.black)
							&& textField_67.getBackground().equals(Color.black)) {
						JOptionPane.showMessageDialog(null, "Enhorabuena has ganado!");
						lblColoresSecretos.setVisible(true);
						layeredPane_1.setVisible(true);
						App.PrimeraJugada = true;
						btnNewButton.setVisible(false);
					} else {
						intentos++;
						btnNewButton.setBounds(250, 290, 81, 25);
					}

				} else if (intentos == 5) {

					if (textField_32.getBackground().equals(textField_4.getBackground())) {
						textField_68.setBackground(Color.black);
					} else if(textField_32.getBackground().equals(textField_5.getBackground()) || textField_32.getBackground().equals(textField_6.getBackground()) || textField_32.getBackground().equals(textField_7.getBackground())) {
						textField_68.setBackground(Color.white);
					}
					if (textField_33.getBackground().equals(textField_5.getBackground())) {
						textField_69.setBackground(Color.black);
					} else if(textField_33.getBackground().equals(textField_4.getBackground()) || textField_33.getBackground().equals(textField_6.getBackground()) || textField_33.getBackground().equals(textField_7.getBackground())) {
						textField_69.setBackground(Color.white);
					}
					if (textField_34.getBackground().equals(textField_6.getBackground())) {
						textField_70.setBackground(Color.black);
					} else if(textField_34.getBackground().equals(textField_5.getBackground()) || textField_34.getBackground().equals(textField_4.getBackground()) || textField_34.getBackground().equals(textField_7.getBackground())) {
						textField_70.setBackground(Color.white);
					}
					if (textField_35.getBackground().equals(textField_7.getBackground())) {
						textField_71.setBackground(Color.black);
					} else if(textField_35.getBackground().equals(textField_5.getBackground()) || textField_35.getBackground().equals(textField_4.getBackground()) || textField_35.getBackground().equals(textField_6.getBackground())) {
						textField_71.setBackground(Color.white);
					}
					if (textField_68.getBackground().equals(Color.black)
							&& textField_69.getBackground().equals(Color.black)
							&& textField_70.getBackground().equals(Color.black)
							&& textField_71.getBackground().equals(Color.black)) {
						JOptionPane.showMessageDialog(null, "Enhorabuena has ganado!");
						lblColoresSecretos.setVisible(true);
						layeredPane_1.setVisible(true);
						App.PrimeraJugada = true;
						btnNewButton.setVisible(false);
					} else {
						intentos++;
						btnNewButton.setBounds(250, 335, 81, 25);
					}

				} else if (intentos == 6) {

					if (textField_36.getBackground().equals(textField_4.getBackground())) {
						textField_72.setBackground(Color.black);
					} else if(textField_36.getBackground().equals(textField_5.getBackground()) || textField_36.getBackground().equals(textField_6.getBackground()) || textField_36.getBackground().equals(textField_7.getBackground())) {
						textField_72.setBackground(Color.white);
					}
					if (textField_37.getBackground().equals(textField_5.getBackground())) {
						textField_73.setBackground(Color.black);
					} else if(textField_37.getBackground().equals(textField_4.getBackground()) || textField_37.getBackground().equals(textField_6.getBackground()) || textField_37.getBackground().equals(textField_7.getBackground())) {
						textField_73.setBackground(Color.white);
					}
					if (textField_38.getBackground().equals(textField_6.getBackground())) {
						textField_74.setBackground(Color.black);
					} else if(textField_38.getBackground().equals(textField_5.getBackground()) || textField_38.getBackground().equals(textField_4.getBackground()) || textField_38.getBackground().equals(textField_7.getBackground())) {
						textField_74.setBackground(Color.white);
					}
					if (textField_39.getBackground().equals(textField_7.getBackground())) {
						textField_75.setBackground(Color.black);
					} else if(textField_39.getBackground().equals(textField_5.getBackground()) || textField_39.getBackground().equals(textField_4.getBackground()) || textField_39.getBackground().equals(textField_6.getBackground())) {
						textField_75.setBackground(Color.white);
					}
					if (textField_72.getBackground().equals(Color.black)
							&& textField_73.getBackground().equals(Color.black)
							&& textField_74.getBackground().equals(Color.black)
							&& textField_75.getBackground().equals(Color.black)) {
						JOptionPane.showMessageDialog(null, "Enhorabuena has ganado!");
						lblColoresSecretos.setVisible(true);
						layeredPane_1.setVisible(true);
						App.PrimeraJugada = true;
						btnNewButton.setVisible(false);
					} else {
						intentos++;
						btnNewButton.setBounds(250, 385, 81, 25);
					}

				} else if (intentos == 7) {

					if (textField_40.getBackground().equals(textField_4.getBackground())) {
						textField_76.setBackground(Color.black);
					} else if(textField_40.getBackground().equals(textField_5.getBackground()) || textField_40.getBackground().equals(textField_6.getBackground()) || textField_40.getBackground().equals(textField_7.getBackground())) {
						textField_76.setBackground(Color.white);
					}
					if (textField_41.getBackground().equals(textField_5.getBackground())) {
						textField_77.setBackground(Color.black);
					} else if(textField_41.getBackground().equals(textField_4.getBackground()) || textField_41.getBackground().equals(textField_6.getBackground()) || textField_41.getBackground().equals(textField_7.getBackground())) {
						textField_77.setBackground(Color.white);
					}
					if (textField_42.getBackground().equals(textField_6.getBackground())) {
						textField_78.setBackground(Color.black);
					} else if(textField_42.getBackground().equals(textField_5.getBackground()) || textField_42.getBackground().equals(textField_4.getBackground()) || textField_42.getBackground().equals(textField_7.getBackground())) {
						textField_78.setBackground(Color.white);
					}
					if (textField_43.getBackground().equals(textField_7.getBackground())) {
						textField_79.setBackground(Color.black);
					} else if(textField_43.getBackground().equals(textField_5.getBackground()) || textField_43.getBackground().equals(textField_4.getBackground()) || textField_43.getBackground().equals(textField_6.getBackground())) {
						textField_79.setBackground(Color.white);
					}
					if (textField_76.getBackground().equals(Color.black)
							&& textField_77.getBackground().equals(Color.black)
							&& textField_78.getBackground().equals(Color.black)
							&& textField_78.getBackground().equals(Color.black)) {
						JOptionPane.showMessageDialog(null, "Enhorabuena has ganado!");
						lblColoresSecretos.setVisible(true);
						layeredPane_1.setVisible(true);
						App.PrimeraJugada = true;
						btnNewButton.setVisible(false);
					} else {
						intentos++;
						btnNewButton.setBounds(250, 435, 81, 25);
					}

				} else if (intentos == 8) {

					if (textField_44.getBackground().equals(textField_4.getBackground())) {
						textField_80.setBackground(Color.black);
					} else if(textField_44.getBackground().equals(textField_5.getBackground()) || textField_44.getBackground().equals(textField_6.getBackground()) || textField_44.getBackground().equals(textField_7.getBackground())) {
						textField_80.setBackground(Color.white);
					}
					if (textField_45.getBackground().equals(textField_5.getBackground())) {
						textField_81.setBackground(Color.black);
					} else if(textField_45.getBackground().equals(textField_4.getBackground()) || textField_45.getBackground().equals(textField_6.getBackground()) || textField_45.getBackground().equals(textField_7.getBackground())) {
						textField_81.setBackground(Color.white);
					}
					if (textField_46.getBackground().equals(textField_6.getBackground())) {
						textField_82.setBackground(Color.black);
					} else if(textField_46.getBackground().equals(textField_4.getBackground()) || textField_46.getBackground().equals(textField_5.getBackground()) || textField_46.getBackground().equals(textField_7.getBackground())) {
						textField_82.setBackground(Color.white);
					}
					if (textField_47.getBackground().equals(textField_7.getBackground())) {
						textField_83.setBackground(Color.black);
					} else if(textField_47.getBackground().equals(textField_5.getBackground()) || textField_47.getBackground().equals(textField_4.getBackground()) || textField_47.getBackground().equals(textField_6.getBackground())) {
						textField_83.setBackground(Color.white);
					}
					if (textField_80.getBackground().equals(Color.black)
							&& textField_81.getBackground().equals(Color.black)
							&& textField_82.getBackground().equals(Color.black)
							&& textField_83.getBackground().equals(Color.black)) {
						JOptionPane.showMessageDialog(null, "Enhorabuena has ganado!");
						lblColoresSecretos.setVisible(true);
						layeredPane_1.setVisible(true);
						App.PrimeraJugada = true;
						btnNewButton.setVisible(false);
					} else {
						intentos++;
						btnNewButton.setBounds(250, 485, 81, 25);
					}

				} else if (intentos == 9) {

					if (textField_48.getBackground().equals(textField_4.getBackground())) {
						textField_84.setBackground(Color.black);
					} else if(textField_48.getBackground().equals(textField_5.getBackground()) || textField_48.getBackground().equals(textField_6.getBackground()) || textField_48.getBackground().equals(textField_7.getBackground())) {
						textField_84.setBackground(Color.white);
					}
					if (textField_49.getBackground().equals(textField_5.getBackground())) {
						textField_85.setBackground(Color.black);
					} else if(textField_49.getBackground().equals(textField_4.getBackground()) || textField_49.getBackground().equals(textField_6.getBackground()) || textField_49.getBackground().equals(textField_7.getBackground())) {
						textField_85.setBackground(Color.white);
					}
					if (textField_50.getBackground().equals(textField_6.getBackground())) {
						textField_86.setBackground(Color.black);
					} else if(textField_50.getBackground().equals(textField_4.getBackground()) || textField_50.getBackground().equals(textField_5.getBackground()) || textField_50.getBackground().equals(textField_7.getBackground())) {
						textField_86.setBackground(Color.white);
					}
					if (textField_51.getBackground().equals(textField_7.getBackground())) {
						textField_87.setBackground(Color.black);
					} else if(textField_51.getBackground().equals(textField_5.getBackground()) || textField_51.getBackground().equals(textField_4.getBackground()) || textField_51.getBackground().equals(textField_6.getBackground())) {
						textField_87.setBackground(Color.white);
					}
					if (textField_84.getBackground().equals(Color.black)
							&& textField_85.getBackground().equals(Color.black)
							&& textField_86.getBackground().equals(Color.black)
							&& textField_87.getBackground().equals(Color.black)) {
						JOptionPane.showMessageDialog(null, "Enhorabuena has ganado!");
						lblColoresSecretos.setVisible(true);
						layeredPane_1.setVisible(true);
						App.PrimeraJugada = true;
						btnNewButton.setVisible(false);
					} else {
						intentos++;
						btnNewButton.setBounds(250, 485, 81, 25);
						JOptionPane.showMessageDialog(null, "Se te acabaron los intentos has perdido!");
						btnNewButton.setVisible(false);
						lblColoresSecretos.setVisible(true);
						layeredPane_1.setVisible(true);
						App.PrimeraJugada = true;
					}

				}
				Primerajugada();

			}

		});

		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecColor();
			}
		});

		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Niveles.main(null);
			}
		});

		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevo();
			}
		});

	}

	public static void selecColor() {
		if (intentos == 0) {
			Colors.main(null);
		}
	}

	public static void nuevo() {
		intentos = 0;
		principiante.dispose();
		App.main(null);
	}

	public static void Primerajugada() {
		if (App.PrimeraJugada) {
			mntmNewMenuItem.setVisible(true);
		}
	}

	public static void colors() {
		for (int i = 0; i < 4; i++) {
			colores[i] = new Color((int) (Math.random() * 0x1000000));
		}
		randomColors();
	}

	public static void randomColors() {
		textField.setBackground(colores[0]);
		textField_1.setBackground(colores[1]);
		textField_2.setBackground(colores[2]);
		textField_3.setBackground(colores[3]);

		Random r = new Random();
		textField_4.setBackground(colores[r.nextInt(4)]);
		textField_5.setBackground(colores[r.nextInt(4)]);
		textField_6.setBackground(colores[r.nextInt(4)]);
		textField_7.setBackground(colores[r.nextInt(4)]);
	}

	public static void addEventos() {
		textField_8.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_8.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_8.setBackground(colores[count]);
					count++;
				}
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
		textField_9.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_9.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_9.setBackground(colores[count]);
					count++;
				}
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
		textField_10.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_10.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_10.setBackground(colores[count]);
					count++;
				}
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
		textField_11.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_11.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_11.setBackground(colores[count]);
					count++;
				}
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
		textField_16.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_16.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_16.setBackground(colores[count]);
					count++;
				}
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
		textField_17.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_17.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_17.setBackground(colores[count]);
					count++;
				}
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
		textField_18.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_18.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_18.setBackground(colores[count]);
					count++;
				}
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
		textField_19.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_19.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_19.setBackground(colores[count]);
					count++;
				}
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
		textField_20.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_20.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_20.setBackground(colores[count]);
					count++;
				}
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
		textField_21.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_21.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_21.setBackground(colores[count]);
					count++;
				}
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
		textField_22.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_22.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_22.setBackground(colores[count]);
					count++;
				}
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
		textField_23.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_23.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_23.setBackground(colores[count]);
					count++;
				}
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
		textField_24.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_24.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_24.setBackground(colores[count]);
					count++;
				}
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
		textField_25.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_25.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_25.setBackground(colores[count]);
					count++;
				}
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
		textField_26.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_26.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_26.setBackground(colores[count]);
					count++;
				}
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
		textField_27.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_27.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_27.setBackground(colores[count]);
					count++;
				}
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
		textField_28.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_28.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_28.setBackground(colores[count]);
					count++;
				}
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
		textField_29.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_29.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_29.setBackground(colores[count]);
					count++;
				}
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
		textField_30.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_30.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_30.setBackground(colores[count]);
					count++;
				}
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
		textField_31.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_31.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_31.setBackground(colores[count]);
					count++;
				}
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
		textField_32.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_32.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_32.setBackground(colores[count]);
					count++;
				}
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
		textField_33.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_33.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_33.setBackground(colores[count]);
					count++;
				}
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
		textField_34.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_34.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_34.setBackground(colores[count]);
					count++;
				}
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
		textField_35.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_35.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_35.setBackground(colores[count]);
					count++;
				}
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
		textField_36.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_36.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_36.setBackground(colores[count]);
					count++;
				}
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
		textField_37.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_37.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_37.setBackground(colores[count]);
					count++;
				}
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
		textField_38.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_38.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_38.setBackground(colores[count]);
					count++;
				}
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
		textField_39.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_39.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_39.setBackground(colores[count]);
					count++;
				}
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
		textField_40.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_40.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_40.setBackground(colores[count]);
					count++;
				}
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
		textField_41.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_41.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_41.setBackground(colores[count]);
					count++;
				}
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
		textField_42.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_42.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_42.setBackground(colores[count]);
					count++;
				}
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
		textField_43.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_43.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_43.setBackground(colores[count]);
					count++;
				}
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
		textField_44.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_44.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_44.setBackground(colores[count]);
					count++;
				}
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
		textField_45.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_45.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_45.setBackground(colores[count]);
					count++;
				}
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
		textField_46.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_46.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_46.setBackground(colores[count]);
					count++;
				}
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
		textField_47.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_47.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_47.setBackground(colores[count]);
					count++;
				}
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
		textField_48.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_48.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_48.setBackground(colores[count]);
					count++;
				}
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
		textField_49.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_49.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_49.setBackground(colores[count]);
					count++;
				}
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
		textField_50.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_50.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_50.setBackground(colores[count]);
					count++;
				}
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
		textField_51.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_51.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_51.setBackground(colores[count]);
					count++;
				}
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
}
