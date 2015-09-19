package interfaceApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import core.enumera.DocCliente;
import core.enumera.Uf;
import interfaceApp.Panel.ClientePanel;


public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private int docFlag = 0;
	private JMenuBar menuBar;
	private JMenu mnArquivo;
	private JMenuItem mntmGerarRelatorio;
	private JMenuItem mntmAbrirRelatrio;
	private List list;
	private JTabbedPane tabbedPane;
	private JPanel Cliente;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		mntmGerarRelatorio = new JMenuItem("Gerar Relat\u00F3rio");
		mnArquivo.add(mntmGerarRelatorio);
		
		mntmAbrirRelatrio = new JMenuItem("Abrir Relat\u00F3rio");
		mnArquivo.add(mntmAbrirRelatrio);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		list = new List();
		contentPane.add(list, BorderLayout.WEST);
		//temporario----------------
		for(int i = 0; i < 30; i++){
			list.add("v-" + i);
		}
		//---------------------------
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		Cliente = new ClientePanel();
		FlowLayout fl_Cliente = (FlowLayout) Cliente.getLayout();
		fl_Cliente.setAlignment(FlowLayout.LEFT);
		tabbedPane.addTab("Cliente", null, Cliente, null);
				
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Veiculo", null, panel_1, null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Sinistro", null, tabbedPane_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Relat\u00F3rio", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_3, BorderLayout.NORTH);
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		panel_3.add(btnBuscar);
		
			
		
	}

}
