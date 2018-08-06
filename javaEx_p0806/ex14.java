package home0806;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class ex14 extends JFrame{
	
	
	ex14() {
		setTitle("ex14");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel price = new JLabel("원금을 입력하시오");
		JTextField tf = new JTextField(5);
		JLabel per = new JLabel("이율을 입력하시오");
		JTextField pert = new JTextField(5);
		JTextField ans = new JTextField(15);
		ans.setEditable(false);
		
		
		
		JButton btn = new JButton("변환");
		
		btn.addActionListener(e -> {
			int a = Integer.parseInt(tf.getText());
			float b = Float.parseFloat(pert.getText());
			
			int ab = (int)(a * b / 100);
			ans.setText("이자는 연"+ab+"만원 입니다.");
			
		});
		
		c.add(price);
		c.add(tf);
		c.add(per);
		c.add(pert);
		c.add(btn);
		c.add(ans);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,150);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ex14();

	}

}
