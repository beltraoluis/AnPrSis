package interfaceApp.Panel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import core.enumera.DocCliente;
import core.enumera.Uf;
import javax.swing.JFormattedTextField;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Checkbox;
import java.awt.Label;

public class ClientePanel extends JPanel {
	private JTextField tfNome;
	private JTextField tfDocumento;
	private JTextField tfCidade;
	private JTextField textField;
	private JTextField tfBairro;
	private JTextField tfCep;
	private JTextField tfDdd1;
	private JTextField tfTelefone;
	private JTextField tfDdd2;
	private JTextField tfCelular;

	/**
	 * Create the panel.
	 */
	public ClientePanel() {
		
		JLabel lblNome = new JLabel("Nome:");
		add(lblNome);
		
		tfNome = new JTextField();
		add(tfNome);
		tfNome.setColumns(27);
		
		Checkbox checkbox = new Checkbox("Seguradora");
		add(checkbox);
		
		JLabel lblDocumento = new JLabel("Documento:");
		add(lblDocumento);
		
		JComboBox cbDocumento = new JComboBox();
		cbDocumento.setModel(new DefaultComboBoxModel(DocCliente.values()));
		add(cbDocumento);
		
		tfDocumento = new JTextField();
		add(tfDocumento);
		tfDocumento.setColumns(11);
		
		JLabel lblUfEmisora = new JLabel("UF Emissora:");
		add(lblUfEmisora);
		
		JComboBox cbUfEmissora = new JComboBox();
		cbUfEmissora.setModel(new DefaultComboBoxModel(Uf.values()));
		add(cbUfEmissora);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(30);
		add(horizontalStrut_1);
		
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
		
		Component horizontalStrut = Box.createHorizontalStrut(180);
		add(horizontalStrut);
		
		JLabel lblLougradouro = new JLabel("Lougradouro:");
		add(lblLougradouro);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(31);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		add(lblNumero);
		
		JFormattedTextField ftfNumero = new JFormattedTextField();
		ftfNumero.setColumns(4);
		add(ftfNumero);
		
		JLabel lblBairro = new JLabel("Bairro:");
		add(lblBairro);
		
		tfBairro = new JTextField();
		add(tfBairro);
		tfBairro.setColumns(15);
		
		JLabel lblCep = new JLabel("CEP:");
		add(lblCep);
		
		tfCep = new JTextField();
		add(tfCep);
		tfCep.setColumns(6);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		add(lblTelefone);
		
		tfDdd1 = new JTextField();
		add(tfDdd1);
		tfDdd1.setColumns(2);
		
		tfTelefone = new JTextField();
		add(tfTelefone);
		tfTelefone.setColumns(7);
		
		JLabel lblRamal = new JLabel("Ramal:");
		add(lblRamal);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setColumns(3);
		add(formattedTextField);
		
		JLabel lblCelular = new JLabel("Celular:");
		add(lblCelular);
		
		tfDdd2 = new JTextField();
		add(tfDdd2);
		tfDdd2.setColumns(2);
		
		tfCelular = new JTextField();
		add(tfCelular);
		tfCelular.setColumns(7);

	}

}
