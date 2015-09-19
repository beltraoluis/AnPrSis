package interfaceApp.Panel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import core.enumera.DocCliente;
import core.enumera.Uf;
import javax.swing.JFormattedTextField;

public class ClientePanel extends JPanel {
	private JTextField tfNome;
	private JTextField tfDocumento;
	private JTextField tfCidade;
	private JTextField textField;
	private JTextField tfBairro;
	private JTextField tfCep;

	/**
	 * Create the panel.
	 */
	public ClientePanel() {
		
		JLabel lblNome = new JLabel("Nome:");
		add(lblNome);
		
		tfNome = new JTextField();
		add(tfNome);
		tfNome.setColumns(35);
		
		JLabel lblDocumento = new JLabel("Documento:");
		add(lblDocumento);
		
		JComboBox cbDocumento = new JComboBox();
		cbDocumento.setModel(new DefaultComboBoxModel(DocCliente.values()));
		add(cbDocumento);
		
		tfDocumento = new JTextField();
		add(tfDocumento);
		tfDocumento.setColumns(11);
		
		JLabel lblUfEmisora = new JLabel("UF Emisora:");
		add(lblUfEmisora);
		
		JComboBox cbUfEmissora = new JComboBox();
		cbUfEmissora.setModel(new DefaultComboBoxModel(Uf.values()));
		add(cbUfEmissora);
		
		JLabel lblCidade = new JLabel("Cidade:");
		add(lblCidade);
		
		tfCidade = new JTextField();
		add(tfCidade);
		tfCidade.setColumns(10);
		
		JLabel lblUf = new JLabel("UF:");
		add(lblUf);
		
		JComboBox cbUf = new JComboBox();
		cbUf.setModel(new DefaultComboBoxModel(Uf.values()));
		add(cbUf);
		
		JLabel lblLougradouro = new JLabel("Lougradouro:");
		add(lblLougradouro);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(35);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		add(lblNumero);
		
		JFormattedTextField ftfNumero = new JFormattedTextField();
		ftfNumero.setColumns(4);
		add(ftfNumero);
		
		JLabel lblBairro = new JLabel("Bairro:");
		add(lblBairro);
		
		tfBairro = new JTextField();
		add(tfBairro);
		tfBairro.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		add(lblCep);
		
		tfCep = new JTextField();
		add(tfCep);
		tfCep.setColumns(10);

	}

}
