package cauculadora;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class tela {

	private JFrame frmCalculadora;
	private JTextField txtField;
	double numero1;
	double numero2;
	double resultado;
	String operacao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(new Color(255, 255, 255));
		frmCalculadora.getContentPane().setForeground(new Color(64, 0, 128));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 315, 300);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Californian FB", Font.BOLD, 18));
		txtField.setBounds(0, 0, 299, 31);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btnc = new JButton("C");
		btnc.setForeground(new Color(64, 0, 64));
		btnc.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnc.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnc.setBounds(223, 42, 63, 43);
		frmCalculadora.getContentPane().add(btnc);
		
		JButton btnsoma = new JButton("+");
		btnsoma.setForeground(new Color(64, 0, 64));
		btnsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
			}
		});
		btnsoma.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnsoma.setBounds(223, 84, 63, 43);
		frmCalculadora.getContentPane().add(btnsoma);
		
		JButton btnsub = new JButton("-");
		btnsub.setForeground(new Color(64, 0, 64));
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
			}
		});
		btnsub.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnsub.setBounds(223, 129, 63, 43);
		frmCalculadora.getContentPane().add(btnsub);
		
		JButton btnmult = new JButton("x");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "*";
			}
		});
		btnmult.setForeground(new Color(64, 0, 64));
		btnmult.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnmult.setBounds(223, 173, 63, 43);
		frmCalculadora.getContentPane().add(btnmult);
		
		JButton btndiv = new JButton("/");
		btndiv.setForeground(new Color(64, 0, 64));
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "/";
			}
		});
		btndiv.setFont(new Font("Arial Black", Font.BOLD, 20));
		btndiv.setBounds(223, 216, 63, 43);
		frmCalculadora.getContentPane().add(btndiv);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn6.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn6.setForeground(new Color(0, 0, 255));
		btn6.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn6.setBounds(150, 108, 63, 43);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(new Color(128, 128, 128));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn9.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn9.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn9.setBounds(150, 65, 63, 43);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(new Color(255, 128, 255));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn8.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn8.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn8.setBounds(77, 65, 63, 43);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn5.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn5.setForeground(new Color(0, 128, 255));
		btn5.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn5.setBounds(77, 108, 63, 43);
		frmCalculadora.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(new Color(255, 128, 0));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn2.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn2.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn2.setBounds(77, 151, 63, 43);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn3.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn3.setForeground(new Color(255, 255, 0));
		btn3.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn3.setBounds(150, 151, 63, 43);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btnponto = new JButton(".");
		btnponto.setForeground(new Color(64, 0, 64));
		btnponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btnponto.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btnponto.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnponto.setBounds(77, 194, 63, 43);
		frmCalculadora.getContentPane().add(btnponto);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(new Color(128, 0, 255));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn7.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn7.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn7.setBounds(10, 65, 63, 43);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(new Color(0, 255, 0));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn4.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn4.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn4.setBounds(10, 108, 63, 43);
		frmCalculadora.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn1.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn1.setForeground(new Color(255, 0, 0));
		btn1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn1.setBounds(10, 151, 63, 43);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(new Color(0, 0, 0));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText()+btn0.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn0.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn0.setBounds(10, 194, 63, 43);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btnigual = new JButton("=");
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionar;
				numero2 = Double.parseDouble(txtField.getText());
				if(operacao.equals("+")) {
					    resultado = numero1+numero2;
						selecionar = String.format("%.0f", resultado);
						txtField.setText(selecionar);
						
				}else if(operacao.equals("-")) {
					resultado = numero1-numero2;
					selecionar = String.format("%.0f", resultado);
					txtField.setText(selecionar);	
					
				}else if(operacao.equals("*")) {
					resultado = numero1*numero2;
					selecionar = String.format("%.0f", resultado);
					txtField.setText(selecionar);
					
			    }else if(operacao.equals("/")) {
					resultado = numero1/numero2;
					selecionar = String.format("%.0f", resultado);
					txtField.setText(selecionar);
			 }
		    }
		});
		btnigual.setForeground(new Color(64, 0, 64));
		btnigual.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnigual.setBounds(150, 194, 63, 43);
		frmCalculadora.getContentPane().add(btnigual);
	}
}
