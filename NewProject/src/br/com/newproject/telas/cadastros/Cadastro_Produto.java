package br.com.newproject.telas.cadastros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import br.com.newproject.telas.Principal;

import java.awt.Font;
import java.awt.Image;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class Cadastro_Produto extends JFrame {

	private JPanel contentPane;
	private JTextField textCod;
	private JTextField textNome;
	private JTextField textUnd;
	private JTextField textEstCrt;
	private String[] cat_test = {"","MASSAS","CERVEJAS","PLACAS","LUVAS","JOELHOS"};
	private String[] tp_test = {"","ALIMENTO","BEBIDA","ELETRONICOS","CONEXOES"};

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_Produto frame = new Cadastro_Produto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Cadastro_Produto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Cadastro de Produto");
		lblNewJgoodiesTitle.setFont(new Font("Dialog", Font.BOLD, 40));
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblUnidade = new JLabel("Unidade:");
		lblUnidade.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblCategoria = new JLabel("Tipo:");
		lblCategoria.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblTipo = new JLabel("Categoria:");
		lblTipo.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblEstoqueCrtico = new JLabel("Estoque Cr\u00EDtico:");
		lblEstoqueCrtico.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		textCod = new JTextField();
		textCod.setFont(new Font("Dialog", Font.PLAIN, 16));
		textCod.setColumns(10);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		textNome.setColumns(10);
		
		textUnd = new JTextField();
		textUnd.setFont(new Font("Dialog", Font.PLAIN, 16));
		textUnd.setColumns(10);
		
		textEstCrt = new JTextField();
		textEstCrt.setFont(new Font("Dialog", Font.PLAIN, 16));
		textEstCrt.setColumns(10);
		
		JComboBox comboBox_tp = new JComboBox(tp_test);
		comboBox_tp.setFont(new Font("Dialog", Font.PLAIN, 16));
		comboBox_tp.setEditable(false);
		
		JComboBox comboBox_cat = new JComboBox(cat_test);
		comboBox_cat.setFont(new Font("Dialog", Font.PLAIN, 16));
		comboBox_cat.setEditable(false);
		
		//Icon icoG = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/save.png"));
		
		ImageIcon iconG = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/save.png"));
		Image imaG = iconG.getImage();
		Image imagemG = imaG.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoG = new ImageIcon(imagemG);
		
		JButton btnGravar = new JButton("Salvar",icoG);
		
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGravar.setFont(new Font("Dialog", Font.BOLD, 14));
		
		ImageIcon iconL = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/clear.png"));
		Image imaL = iconL.getImage();
		Image imagemL = imaL.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoL = new ImageIcon(imagemL);
		
		JButton btnLimpar = new JButton("Limpar", icoL);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textCod.setText("");
				textNome.setText("");
				textUnd.setText("");
				textEstCrt.setText("");
				comboBox_tp.setSelectedItem(cat_test[0]);
				comboBox_cat.setSelectedItem(tp_test[0]);
				
			}
		});
		btnLimpar.setFont(new Font("Dialog", Font.BOLD, 14));
		
		ImageIcon iconV = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/back.png"));
		Image imaV = iconV.getImage();
		Image imagemV = imaV.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoV = new ImageIcon(imagemV);
		
		JButton btnVoltar = new JButton("Voltar", icoV);
		btnVoltar.setFont(new Font("Dialog", Font.BOLD, 15));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                Principal frame = new Principal();
                Cadastro_Produto.this.dispose();
                frame.setVisible(true);
                frame.setResizable(false);
			}
		});
		
		JTextArea mov_Individual = new JTextArea();
		mov_Individual.setBackground(new Color(220, 220, 220));
		mov_Individual.setEditable(false);
		
		JLabel lblBreveMovimentao = DefaultComponentFactory.getInstance().createTitle("Breve movimenta\u00E7\u00E3o");
		lblBreveMovimentao.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel lblLogo = DefaultComponentFactory.getInstance().createTitle("");
		lblLogo.setBounds(6, 300, 35, 35);
		ImageIcon icon = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/logo.png"));
		Image ima = icon.getImage();
		Image imagem = ima.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT);
		Icon ico = new ImageIcon(imagem);
		lblLogo.setIcon(ico);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		JLabel lblHora = DefaultComponentFactory.getInstance().createTitle(dtf.format(now));
		lblHora.setFont(new Font("Dialog", Font.BOLD, 13));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblCategoria, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNome)
								.addComponent(lblTipo)
								.addComponent(lblCdigo)
								.addComponent(lblUnidade))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textCod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textUnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(63)
									.addComponent(lblEstoqueCrtico)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textEstCrt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(textNome)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(comboBox_cat, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(comboBox_tp, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnGravar)
											.addGap(18)
											.addComponent(btnLimpar)))
									.addGap(18)
									.addComponent(btnVoltar))))
						.addComponent(lblNewJgoodiesTitle))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(mov_Individual, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblHora, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblLogo)))
							.addGap(113))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblBreveMovimentao, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblBreveMovimentao, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewJgoodiesTitle, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCdigo)
								.addComponent(textCod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNome))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblUnidade)
								.addComponent(textUnd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEstoqueCrtico)
								.addComponent(textEstCrt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCategoria)
								.addComponent(comboBox_tp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTipo)
								.addComponent(comboBox_cat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(26))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(mov_Individual, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnLimpar)
							.addComponent(btnVoltar)
							.addComponent(btnGravar))
						.addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHora, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}