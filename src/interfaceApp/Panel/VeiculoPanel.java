package interfaceApp.Panel;

import javax.swing.JPanel;
import java.awt.List;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import core.enumera.Cor;
import java.awt.FlowLayout;
import java.awt.Checkbox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.Box;

public class VeiculoPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField tfChassi;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public VeiculoPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel_1, BorderLayout.CENTER);
		
		JRadioButton rdbtnVeiculo = new JRadioButton("Veiculo");
		panel_1.add(rdbtnVeiculo);
		
		JRadioButton rdbtnMoto = new JRadioButton("Moto");
		panel_1.add(rdbtnMoto);
		
		JRadioButton rdbtnCaminho = new JRadioButton("Caminh\u00E3o");
		panel_1.add(rdbtnCaminho);
		
		JRadioButton rdbtnOutro = new JRadioButton("Outro");
		panel_1.add(rdbtnOutro);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnVeiculo);
		bg.add(rdbtnMoto);
		bg.add(rdbtnCaminho);
		bg.add(rdbtnOutro);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(13);
		
		JLabel lblPlaca = new JLabel("Placa:");
		panel_1.add(lblPlaca);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(7);
		
		JLabel lblCor = new JLabel("Cor:");
		panel_1.add(lblCor);
		
		JComboBox cbCor = new JComboBox();
		cbCor.setModel(new DefaultComboBoxModel(Cor.values()));
		panel_1.add(cbCor);
		
		Checkbox ckbCor = new Checkbox("Met\u00E1lico");
		panel_1.add(ckbCor);
		
		Component horizontalStrut = Box.createHorizontalStrut(120);
		panel_1.add(horizontalStrut);
		
		JLabel lblChassi = new JLabel("Chassi:");
		panel_1.add(lblChassi);
		
		tfChassi = new JTextField();
		panel_1.add(tfChassi);
		tfChassi.setColumns(18);
		
		JButton btnNd = new JButton("N/D");
		panel_1.add(btnNd);
		
		JLabel lblKm = new JLabel("km:");
		panel_1.add(lblKm);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setColumns(6);
		panel_1.add(formattedTextField);
		
		JLabel lblPintura = new JLabel("Pintura:");
		panel_1.add(lblPintura);
		
		JComboBox cnbPintura = new JComboBox();
		panel_1.add(cnbPintura);
		
		JLabel lblMaoDeObra = new JLabel("M\u00E3o de Obra:");
		panel_1.add(lblMaoDeObra);
		
		JComboBox cmbMaoDeObra = new JComboBox();
		panel_1.add(cmbMaoDeObra);
		
		JLabel lblMarca = new JLabel("Marca:");
		panel_1.add(lblMarca);
		
		JComboBox cmbMarca = new JComboBox();
		panel_1.add(cmbMarca);
		
		JLabel lblVeiculo = new JLabel("Veiculo:");
		panel_1.add(lblVeiculo);
		
		JComboBox cmbVeiculo = new JComboBox();
		panel_1.add(cmbVeiculo);
		
		JLabel lblModelo = new JLabel("Modelo:");
		panel_1.add(lblModelo);
		
		JComboBox cmbModelo = new JComboBox();
		panel_1.add(cmbModelo);
		
		JLabel lblCarroceria = new JLabel("Carroceria:");
		panel_1.add(lblCarroceria);
		
		JComboBox cmbCarroceria = new JComboBox();
		panel_1.add(cmbCarroceria);
		
		JLabel lblMotor = new JLabel("Motor");
		panel_1.add(lblMotor);
		
		JComboBox cmbMotor = new JComboBox();
		panel_1.add(cmbMotor);
		
		JLabel lblTransmissao = new JLabel("Transmiss\u00E3o:");
		panel_1.add(lblTransmissao);
		
		JComboBox cmbTransmissao = new JComboBox();
		panel_1.add(cmbTransmissao);
		
		JLabel lblAno = new JLabel("Ano:");
		panel_1.add(lblAno);
		
		JComboBox cmbAnoFab = new JComboBox();
		panel_1.add(cmbAnoFab);
		
		JLabel label = new JLabel("/");
		panel_1.add(label);
		
		JComboBox cmbAnoMod = new JComboBox();
		panel_1.add(cmbAnoMod);
		
	}

}
