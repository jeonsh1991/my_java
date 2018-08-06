package home0806;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class ex13 extends JFrame {
	ex13() {
		setTitle("ex13");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		JTextField tf = new JTextField(5);
		JLabel la = new JLabel("거리를 마일 단위로 입력하시오");
		JTextField mi = new JTextField(21);
		mi.setEditable(false);
		JButton btn = new JButton("변환");
		btn.addActionListener(e -> { 
			if(tf.getText()!=null) {
				int ab = Integer.parseInt(tf.getText());
				float cd = (float) (ab*1.609344);
				mi.setText(tf.getText()+"마일은 "+cd+"킬로미터입니다.");
			}
			else if(tf.getText()==null) {
				mi.setText("1마일은 킬로미터입니다");
			}
			
			
			
		});
		
		c.add(la);
		c.add(tf);
		c.add(btn); 
		c.add(mi);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(263,130);
		setResizable(false);
		setVisible(true);
	}
		

	public static void main(String[] args) {
		new ex13();
	}

}
