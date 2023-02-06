package AtividadePP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import idadeAnimal.Cachorro;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class TelaCalculadora extends JFrame {
	
	Calculadora cal = new Calculadora();

	private JPanel contentPane;
	private JTextField tfNumero1;
	private JLabel lblEscolhaUmaOperacao;
	private JLabel lblEscolhaUmNumero;
	private JLabel lblEscolhaUmNumero_1;
	private JLabel lblResultado;
	private JButton btnLimpar;
	private JButton btnEncerrar;
	private JCheckBox chckbxMultiplicao;
	private JCheckBox chckbxAdicao;
	private JCheckBox chckbxDivisao;
	private JCheckBox chckbxSubtrao;
	private JRadioButton rdbtn2;
	private JRadioButton rdbtn3;
	private JRadioButton rdbtn4;
	private JRadioButton rdbtn5;
	private JRadioButton rdbtn6;
	private JRadioButton rdbtn7;
	private JRadioButton rdbtn8;
	private JRadioButton rdbtn9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora frame = new TelaCalculadora();
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
	public TelaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteUmNumero = new JLabel("Digite um numero:");
		lblDigiteUmNumero.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblDigiteUmNumero.setBorder(new LineBorder(new Color(0, 0, 255), 2));
		lblDigiteUmNumero.setBounds(10, 10, 482, 65);
		contentPane.add(lblDigiteUmNumero);
		
		tfNumero1 = new JTextField();
		tfNumero1.setBounds(264, 27, 213, 32);
		contentPane.add(tfNumero1);
		tfNumero1.setColumns(10);
		
		lblEscolhaUmaOperacao = new JLabel("");
		lblEscolhaUmaOperacao.setVerticalAlignment(SwingConstants.TOP);
		lblEscolhaUmaOperacao.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblEscolhaUmaOperacao.setBorder(new LineBorder(new Color(0, 0, 255), 2));
		lblEscolhaUmaOperacao.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 2), "Escolha uma operação", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		lblEscolhaUmaOperacao.setBounds(10, 85, 482, 156);
		contentPane.add(lblEscolhaUmaOperacao);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(111, 85, -68, 19);
		contentPane.add(textPane);
		
		lblEscolhaUmNumero = new JLabel("");
		lblEscolhaUmNumero.setVerticalAlignment(SwingConstants.TOP);
		lblEscolhaUmNumero.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblEscolhaUmNumero.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 2), "Escolha um numero", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		
		lblEscolhaUmNumero.setBounds(140, 251, 220, 156);
		contentPane.add(lblEscolhaUmNumero);
		
		lblEscolhaUmNumero_1 = new JLabel("");
		lblEscolhaUmNumero_1.setVerticalAlignment(SwingConstants.TOP);
		lblEscolhaUmNumero_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblEscolhaUmNumero_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 2), "Resultado", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		lblEscolhaUmNumero_1.setBounds(10, 417, 482, 156);
		contentPane.add(lblEscolhaUmNumero_1);
		
		lblResultado = new JLabel("");
		lblResultado.setBorder(new LineBorder(Color.BLUE, 2));
		lblResultado.setBounds(39, 436, 190, 114);
		contentPane.add(lblResultado);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(326, 436, 135, 46);
		contentPane.add(btnLimpar);
		
		btnEncerrar = new JButton("Encerrar");
		btnEncerrar.setBounds(326, 504, 135, 46);
		contentPane.add(btnEncerrar);
		
		chckbxMultiplicao = new JCheckBox("Multiplica\u00E7\u00E3o");
		chckbxMultiplicao.setBounds(39, 107, 105, 32);
		contentPane.add(chckbxMultiplicao);
		
		chckbxAdicao = new JCheckBox("Adi\u00E7\u00E3o");
		chckbxAdicao.setBounds(39, 194, 105, 32);
		contentPane.add(chckbxAdicao);
		
		chckbxDivisao = new JCheckBox("Divis\u00E3o");
		chckbxDivisao.setBounds(329, 107, 105, 32);
		contentPane.add(chckbxDivisao);
		
		chckbxSubtrao = new JCheckBox("Subtra\u00E7\u00E3o");
		chckbxSubtrao.setBounds(329, 194, 105, 32);
		contentPane.add(chckbxSubtrao);
		
		JRadioButton rdbtn1 = new JRadioButton("1");
		rdbtn1.setBounds(171, 275, 39, 21);
		contentPane.add(rdbtn1);
		
		rdbtn2 = new JRadioButton("2");
		rdbtn2.setBounds(235, 275, 39, 21);
		contentPane.add(rdbtn2);
		
		rdbtn3 = new JRadioButton("3");
		rdbtn3.setBounds(302, 275, 39, 21);
		contentPane.add(rdbtn3);
		
		rdbtn4 = new JRadioButton("4");
		rdbtn4.setBounds(169, 314, 39, 21);
		contentPane.add(rdbtn4);
		
		rdbtn5 = new JRadioButton("5");
		rdbtn5.setBounds(235, 314, 39, 21);
		contentPane.add(rdbtn5);
		
		rdbtn6 = new JRadioButton("6");
		rdbtn6.setBounds(302, 314, 39, 21);
		contentPane.add(rdbtn6);
		
		rdbtn7 = new JRadioButton("7");
		rdbtn7.setBounds(169, 352, 39, 21);
		contentPane.add(rdbtn7);
		
		rdbtn8 = new JRadioButton("8");
		rdbtn8.setBounds(235, 352, 39, 21);
		contentPane.add(rdbtn8);
		
		rdbtn9 = new JRadioButton("9");
		rdbtn9.setBounds(302, 352, 39, 21);
		contentPane.add(rdbtn9);
	}
}
