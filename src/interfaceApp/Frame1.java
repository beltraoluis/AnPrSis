package interfaceApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Frame1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
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
	public Frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 451);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmArquivo = new JMenuItem("Novo");
		mnNewMenu.add(mntmArquivo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mnNewMenu.add(mntmAbrir);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mnNewMenu.add(mntmSalvar);
		
		JMenu mnPeas = new JMenu("Pe\u00E7as");
		menuBar.add(mnPeas);
		
		JMenu mnImagem = new JMenu("Imagem");
		menuBar.add(mnImagem);
		
		JMenu mnImpresso = new JMenu("Impress\u00E3o");
		menuBar.add(mnImpresso);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmBemVindo = new JMenuItem("Bem Vindo");
		mnAjuda.add(mntmBemVindo);
		
		JMenuItem mntmDocumentao = new JMenuItem("Documenta\u00E7\u00E3o");
		mnAjuda.add(mntmDocumentao);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mnAjuda.add(mntmSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Dados", null, panel, null);
		panel.setLayout(new GridLayout(8, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 7, 5, 1));
		
		JLabel lblNewLabel = new JLabel("Placa");
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cor");
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Chassi");
		panel_1.add(lblNewLabel_2);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel_1.add(horizontalStrut);
		
		JLabel lblNewLabel_3 = new JLabel("km");
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Pintura");
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("M\u00E3o de Obra");
		panel_1.add(lblNewLabel_5);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		panel_1.add(btnNewButton);
		
		textField_3 = new JTextField();
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		panel_1.add(comboBox_1);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Or\u00E7amento", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Relat\u00F3rio", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Aviso", null, panel_6, null);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Pedido", null, panel_7, null);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("Conclus\u00E3o", null, panel_8, null);
	}

}
