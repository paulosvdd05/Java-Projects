package att;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaImagens extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel = new JLabel("");
	JLabel lblTexto = new JLabel("0/9");
	int i =0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaImagens frame = new telaImagens();
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
	public telaImagens() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 538);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 255, 0));
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(100, 150, 0), 2, true), "IMAGENS", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(100, 150, 0)));
		panel.setBounds(10, 69, 537, 303);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		lblNewLabel.setIcon(new ImageIcon(""));
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setBounds(10, 22, 517, 260);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.BLUE);
		lblNewLabel_1.setBounds(38, 224, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnImagem = new JButton("ANTERIOR");
		btnImagem.setForeground(Color.DARK_GRAY);
		btnImagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				i--;
				trocarImagem(i);
				System.out.println(i);
			}
		});
		btnImagem.setBackground(new Color(51, 153, 0));
		btnImagem.setBounds(73, 410, 117, 57);
	
		contentPane.add(btnImagem);
		
		JButton btnImagem_2 = new JButton("PROXIMO");
		btnImagem_2.setBounds(367, 410, 132, 57);
		contentPane.add(btnImagem_2);
		btnImagem_2.setForeground(Color.DARK_GRAY);
		btnImagem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				trocarImagem(i);
				System.out.println(i);
				if (i>=9) {
					i=9;
				}if (i<=0) {
					i=1;
				}
			}
		});
		btnImagem_2.setBackground(new Color(51, 153, 0));
		
		JButton btnImagem_1 = new JButton("X");
		btnImagem_1.setBounds(248, 421, 63, 35);
		contentPane.add(btnImagem_1);
		btnImagem_1.setForeground(Color.DARK_GRAY);
		btnImagem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Encerrar programa",
						JOptionPane.YES_NO_OPTION);
				if (resposta == 0) {
					System.exit(0);
				}
			}
		});
		btnImagem_1.setBackground(new Color(51, 153, 0));
		
		
		lblTexto.setForeground(new Color(51, 153, 0));
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setBorder(new LineBorder(new Color(0, 153, 0), 3));
		lblTexto.setBounds(178, 11, 210, 47);
		contentPane.add(lblTexto);
	}
	
	public void trocarImagem(int i) {
		switch (i) {
		case 1:
			lblNewLabel.setIcon(new ImageIcon("/img1.jpg"));
			lblTexto.setText("1/9");
			break;
		case 2:
			lblNewLabel.setIcon(new ImageIcon("/img2.jpg"));
			lblTexto.setText("2/9");
			break;
		case 3:
			lblNewLabel.setIcon(new ImageIcon("/img3.jpg"));
			lblTexto.setText("3/9");
			break;
		case 4:
			lblNewLabel.setIcon(new ImageIcon("/img4.png"));
			lblTexto.setText("4/9");
			break;
		case 5:
			lblNewLabel.setIcon(new ImageIcon("/img5.jpg"));
			lblTexto.setText("5/9");
			break;

		case 6:
			lblNewLabel.setIcon(new ImageIcon("/img6.jpg"));
			lblTexto.setText("6/9");
			break;

		case 7:
			lblNewLabel.setIcon(new ImageIcon("/img7.jpg"));
			lblTexto.setText("7/9");
			break;

		case 8:
			lblNewLabel.setIcon(new ImageIcon("/img8.jpeg"));
			lblTexto.setText("8/9");
			break;

		case 9:
			lblNewLabel.setIcon(new ImageIcon("/img9.jpg"));
			lblTexto.setText("9/9");
			break;


		default:
			break;
		}
	}
}
