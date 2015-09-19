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
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import core.enumera.DocCliente;
import core.enumera.Uf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField tf_nome;
	private JTextField tf_doc;
	private JTextField tf_loug;
	private int docFlag = 0;
	private JTextField tf_cidade;

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
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmGerarRelatorio = new JMenuItem("Gerar Relat\u00F3rio");
		mnArquivo.add(mntmGerarRelatorio);
		
		JMenuItem mntmAbrirRelatrio = new JMenuItem("Abrir Relat\u00F3rio");
		mnArquivo.add(mntmAbrirRelatrio);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		List list = new List();
		contentPane.add(list, BorderLayout.WEST);
		for(int i = 0; i < 30; i++){
			list.add("v-" + i);
		}
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		tabbedPane.addTab("Cliente", null, panel, null);
		
		JLabel lbl_nome = new JLabel("Nome:");
		panel.add(lbl_nome);
		
		tf_nome = new JTextField();
		panel.add(tf_nome);
		tf_nome.setColumns(35);
		
		JLabel lbl_doc = new JLabel("Documento:");
		panel.add(lbl_doc);
		
		JComboBox cb_doc = new JComboBox();
		cb_doc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==cb_doc){
					JComboBox cb = (JComboBox)e.getSource();
					DocCliente dc = (DocCliente)cb.getSelectedItem();
					docFlag = dc.getId();
					panel.repaint();
				}
			}
		});
		cb_doc.setModel(new DefaultComboBoxModel(DocCliente.values()));
		panel.add(cb_doc);	
		
		tf_doc = new JTextField();
		panel.add(tf_doc);
		tf_doc.setColumns(11);
		
		JLabel lbl_ufEmissor = new JLabel("UF Emissor:");
		panel.add(lbl_ufEmissor);
		
		JComboBox cb_ufEmissor = new JComboBox();
		if(docFlag == 0){
			cb_ufEmissor.setEnabled(true);
		}else{
			cb_ufEmissor.setEnabled(false);
		}
		cb_ufEmissor.setModel(new DefaultComboBoxModel(Uf.values()));
		if(docFlag == 0){

		}
		panel.add(cb_ufEmissor);
		
		JLabel lbl_cidade = new JLabel("Cidade:");
		panel.add(lbl_cidade);
		
		tf_cidade = new JTextField();
		panel.add(tf_cidade);
		tf_cidade.setColumns(10);
		
		JLabel lbl_uf = new JLabel("UF:");
		panel.add(lbl_uf);
		
		JComboBox cb_uf = new JComboBox();
		cb_uf.setModel(new DefaultComboBoxModel(Uf.values()));
		panel.add(cb_uf);
		
		JLabel lbl_loug = new JLabel("Lougradouro:");
		panel.add(lbl_loug);
		
		tf_loug = new JTextField();
		panel.add(tf_loug);
		tf_loug.setColumns(10);
		
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
