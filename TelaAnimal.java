package idadeAnimal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Choice;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAnimal extends JFrame {
	
	Cachorro cach = new Cachorro();
	Gato gato = new Gato();
	
	
	
	JLabel lblResultadoIdade = new JLabel("");
	JLabel lblResultadoComida = new JLabel("");

	private JPanel contentPane;
	private JTextField tfAnimal;
	private JTextField tfNome;
	private JTextField tfIdade;
	private JTextField tfPeso;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAnimal frame = new TelaAnimal();
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
	public TelaAnimal() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 462);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalculadoraDeIdade = new JLabel("Calculadora Animal");
		lblCalculadoraDeIdade.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblCalculadoraDeIdade.setOpaque(true);
		lblCalculadoraDeIdade.setBackground(new Color(0, 100, 0));
		lblCalculadoraDeIdade.setForeground(Color.WHITE);
		lblCalculadoraDeIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculadoraDeIdade.setBounds(0, 0, 444, 49);
		contentPane.add(lblCalculadoraDeIdade);
		
		JLabel lblSelecioneOAnimal = new JLabel("Digite a esp\u00E9cie do Animal");
		lblSelecioneOAnimal.setForeground(new Color(0, 128, 0));
		lblSelecioneOAnimal.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		lblSelecioneOAnimal.setBounds(43, 72, 183, 32);
		contentPane.add(lblSelecioneOAnimal);
		
		JLabel lblgParaGato = new JLabel("(G para gato e C para cachorro)");
		lblgParaGato.setHorizontalAlignment(SwingConstants.CENTER);
		lblgParaGato.setForeground(new Color(0, 128, 0));
		lblgParaGato.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 10));
		lblgParaGato.setBounds(31, 85, 201, 32);
		contentPane.add(lblgParaGato);
		
		tfAnimal = new JTextField();
		tfAnimal.setHorizontalAlignment(SwingConstants.CENTER);
		tfAnimal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfAnimal.setForeground(new Color(0, 128, 0));
		tfAnimal.setBorder(new LineBorder(new Color(0, 128, 0)));
		tfAnimal.setBounds(231, 78, 72, 26);
		contentPane.add(tfAnimal);
		tfAnimal.setColumns(10);
		
		JLabel lblDigiteONome = new JLabel("Digite o nome do animal:");
		lblDigiteONome.setForeground(new Color(0, 128, 0));
		lblDigiteONome.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		lblDigiteONome.setBounds(53, 115, 183, 32);
		contentPane.add(lblDigiteONome);
		
		tfNome = new JTextField();
		tfNome.setHorizontalAlignment(SwingConstants.CENTER);
		tfNome.setForeground(new Color(0, 128, 0));
		tfNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNome.setColumns(10);
		tfNome.setBorder(new LineBorder(new Color(0, 128, 0)));
		tfNome.setBounds(231, 117, 168, 26);
		contentPane.add(tfNome);
		
		JLabel lblDigiteAIdade = new JLabel("Digite a idade do animal:");
		lblDigiteAIdade.setForeground(new Color(0, 128, 0));
		lblDigiteAIdade.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		lblDigiteAIdade.setBounds(43, 194, 183, 32);
		contentPane.add(lblDigiteAIdade);
		
		tfIdade = new JTextField();
		tfIdade.setHorizontalAlignment(SwingConstants.CENTER);
		tfIdade.setForeground(new Color(0, 128, 0));
		tfIdade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfIdade.setColumns(10);
		tfIdade.setBorder(new LineBorder(new Color(0, 128, 0)));
		tfIdade.setBounds(231, 196, 72, 26);
		contentPane.add(tfIdade);
		
		JLabel lblDigiteOPeso = new JLabel("Digite o peso do animal:");
		lblDigiteOPeso.setForeground(new Color(0, 128, 0));
		lblDigiteOPeso.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		lblDigiteOPeso.setBounds(53, 225, 183, 32);
		contentPane.add(lblDigiteOPeso);
		
		tfPeso = new JTextField();
		tfPeso.setHorizontalAlignment(SwingConstants.CENTER);
		tfPeso.setForeground(new Color(0, 128, 0));
		tfPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfPeso.setColumns(10);
		tfPeso.setBorder(new LineBorder(new Color(0, 128, 0)));
		tfPeso.setBounds(231, 231, 72, 26);
		contentPane.add(tfPeso);
		
		JLabel lblIdadeHumana = new JLabel("Idade Humana");
		lblIdadeHumana.setForeground(new Color(0, 128, 0));
		lblIdadeHumana.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblIdadeHumana.setBounds(53, 268, 119, 32);
		contentPane.add(lblIdadeHumana);
		
		
		lblResultadoIdade.setOpaque(true);
		lblResultadoIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultadoIdade.setForeground(Color.WHITE);
		lblResultadoIdade.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblResultadoIdade.setBackground(new Color(0, 100, 0));
		lblResultadoIdade.setBounds(22, 293, 168, 49);
		contentPane.add(lblResultadoIdade);
		
		JLabel lblQuantidadeDeComida = new JLabel("Quantidade de Comida");
		lblQuantidadeDeComida.setForeground(new Color(0, 128, 0));
		lblQuantidadeDeComida.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblQuantidadeDeComida.setBounds(252, 250, 185, 32);
		contentPane.add(lblQuantidadeDeComida);
		
		JLabel lblDiaria = new JLabel("Diaria(g)");
		lblDiaria.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiaria.setForeground(new Color(0, 128, 0));
		lblDiaria.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblDiaria.setBounds(285, 268, 98, 32);
		contentPane.add(lblDiaria);
		
	
		lblResultadoComida.setOpaque(true);
		lblResultadoComida.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultadoComida.setForeground(Color.WHITE);
		lblResultadoComida.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblResultadoComida.setBackground(new Color(0, 100, 0));
		lblResultadoComida.setBounds(252, 293, 168, 49);
		contentPane.add(lblResultadoComida);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					pegarDados();
					exibir();
				} catch (ArithmeticException erro) {
					JOptionPane.showMessageDialog(contentPane, "Erro: Divisão por Zero" + "\n");
					limpar();
				} catch (NumberFormatException erro) {
					JOptionPane.showMessageDialog(contentPane, "Erro: Digitação" + "\n");
					limpar();
				} finally {
					JOptionPane.showMessageDialog(contentPane, "Função executada!");
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(22, 365, 103, 39);
		contentPane.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setBackground(new Color(0, 128, 0));
		btnLimpar.setBounds(169, 365, 103, 39);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Encerrar programa",
						JOptionPane.YES_NO_OPTION);
				if (resposta == 0) {
					System.exit(0);
				}
			}
		});
		btnSair.setForeground(Color.WHITE);
		btnSair.setBackground(new Color(0, 128, 0));
		btnSair.setBounds(317, 365, 103, 39);
		contentPane.add(btnSair);
		
		JLabel lblSexo = new JLabel("sexo:");
		lblSexo.setForeground(new Color(0, 128, 0));
		lblSexo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		lblSexo.setBounds(185, 158, 183, 32);
		contentPane.add(lblSexo);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(new Color(0, 128, 0));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(0, 128, 0)));
		textField.setBounds(231, 157, 168, 26);
		contentPane.add(textField);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		
	}
	
	
	
	public void pegarDados() {
		String c = tfAnimal.getText().toUpperCase();
		System.out.println(c);
		
		if(c.equals("C")) {
			cach.setNome(tfNome.getText());
			cach.setIdadeAnimal(Integer.parseInt(tfIdade.getText()));
			cach.setPeso(Double.parseDouble(tfPeso.getText()));
			cach.calcular(cach.getIdadeAnimal(), cach.getPeso());
		} else if (c.equals("G")) {
			gato.setNome(tfNome.getText());
			gato.setIdadeAnimal(Integer.parseInt(tfIdade.getText()));
			gato.setPeso(Double.parseDouble(tfPeso.getText()));
			gato.calcular(gato.getIdadeAnimal(), gato.getPeso());
			
		}
		
	}
	
	public void exibir() {
		String c = tfAnimal.getText().toUpperCase();
		System.out.println(gato.getResultado());
		
		if(c.equals("C")) {
			lblResultadoComida.setText(String.valueOf(cach.getResultado()));
			lblResultadoIdade.setText(String.valueOf(cach.getIdadeHumana()));
			System.out.println(cach.getIdadeHumana());
		}else if(c.equals("G")) {
			lblResultadoComida.setText(String.valueOf(gato.getResultado()));
			lblResultadoIdade.setText(String.valueOf(gato.getIdadeHumana()));
			System.out.println(gato.getIdadeHumana());
		}
		
		
	}
	
	public void limpar(){
		tfAnimal.setText(null);
		tfIdade.setText(null);
		tfNome.setText(null);
		textField.setText(null);
		tfPeso.setText(null);
		lblResultadoComida.setText(null);
		lblResultadoIdade.setText(null);
	}
}
