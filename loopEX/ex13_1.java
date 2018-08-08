package roopEX;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ex13_1 extends JFrame{
	int price1 = 0, price2=0, price3=0;
	ex13_1() {
		setTitle("피자 주문");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la1 = new JLabel("자바피자에 오신것을 환영합니다");
		
		
		JPanel pa1 = new JPanel(new GridLayout(4,1,1,18));
		pa1.setAlignmentX(LEFT_ALIGNMENT);
		ButtonGroup group1 = new ButtonGroup();
		JLabel la2 = new JLabel("종류");
		pa1.setBorder(LineBorder.createGrayLineBorder());
		JRadioButton radio1 = new JRadioButton("콤보");
		JRadioButton radio2 = new JRadioButton("포테이토");
		JRadioButton radio3 = new JRadioButton("불고기");
		
		
		group1.add(radio1); group1.add(radio2); group1.add(radio3);
		pa1.add(la2); pa1.add(radio1); pa1.add(radio2); pa1.add(radio3); 
		
		
		JPanel pa2 = new JPanel(new GridLayout(5,1,1,8));
		pa2.setBorder(LineBorder.createGrayLineBorder());
		ButtonGroup group2 = new ButtonGroup();
		JLabel la3 = new JLabel("추가토핑");
		JRadioButton radio4 = new JRadioButton("피망");
		JRadioButton radio5 = new JRadioButton("치즈");
		JRadioButton radio6 = new JRadioButton("페페로니");
		JRadioButton radio7 = new JRadioButton("베이컨");
		
		
		group2.add(radio4); group2.add(radio5); group2.add(radio6); group2.add(radio7);
		pa2.add(la3); pa2.add(radio4); pa2.add(radio5); pa2.add(radio6); pa2.add(radio7);
		
		JPanel pa3 = new JPanel(new GridLayout(4,1,1,18));
		pa3.setBorder(LineBorder.createGrayLineBorder());
		ButtonGroup group3 = new ButtonGroup();
		JLabel la4 = new JLabel("크기");
		JRadioButton radio8 = new JRadioButton("Small");
		JRadioButton radio9 = new JRadioButton("Medium");
		JRadioButton radio0 = new JRadioButton("Large");
		group3.add(radio8); group3.add(radio9); group3.add(radio0);
		pa3.add(la4); pa3.add(radio8); pa3.add(radio9); pa3.add(radio0);
		
		
		ActionListener radioHandler = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj=e.getSource();
				if(obj instanceof JRadioButton) {
					JRadioButton rb=(JRadioButton)obj;
					System.out.println(rb.getText());
					if(rb.getText().equals("콤보")) {
						price1 = 100;
					}
					else if(rb.getText().equals("포테이토")) {
						price1 = 200;
					}
					else if(rb.getText().equals("불고기")) {
						price1 = 300;
					}
					else if(rb.getText().equals("피망")) {
						price2 = 400;
					}
					else if(rb.getText().equals("치즈")) {
						price2 = 500;
					}
					else if(rb.getText().equals("페페로니")) {
						price2 = 600;
					}
					else if(rb.getText().equals("베이컨")) {
						price2 = 700;
					}
					else if(rb.getText().equals("Small")) {
						price3 = 5000;
					}
					else if(rb.getText().equals("Medium")) {
						price3 = 7000;
					}
					else if(rb.getText().equals("Large")) {
						price3 = 10000;
					}
				}
				
				
			}
			
			
		};
		
		radio1.addActionListener(radioHandler);
		radio2.addActionListener(radioHandler);
		radio3.addActionListener(radioHandler);
		radio4.addActionListener(radioHandler);
		radio5.addActionListener(radioHandler);
		radio6.addActionListener(radioHandler);
		radio7.addActionListener(radioHandler);
		radio8.addActionListener(radioHandler);
		radio9.addActionListener(radioHandler);
		radio0.addActionListener(radioHandler);
		
		JPanel pa4 = new JPanel(new FlowLayout());
		JButton acc = new JButton("계산");
		JButton can = new JButton("취소");
		JTextField tx = new JTextField(5);
		tx.setEditable(false);
		pa4.add(acc); pa4.add(can); pa4.add(can); pa4.add(tx);
		
		acc.addActionListener(e->{
			int total = price1 + price2+ price3;
			System.out.println(price1+price2+price3);
			tx.setText(""+total);
		});
			

		
		
		
		c.add(la1);
		c.add(pa1);
		c.add(pa2);
		c.add(pa3);
		c.add(pa4);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(280,300);
		setResizable(false);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new ex13_1();

	}

}
