package ex0813;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BaseWindow2 extends JFrame{
	
	BaseWindow2() {
		setTitle("BASEWINDOW");

		JFrame frame = new JFrame("회원관리창");
		JLabel lId = new JLabel("아이디", Label.RIGHT);
		JLabel lName = new JLabel("이름", Label.RIGHT);
		JLabel lHeight = new JLabel("키", Label.RIGHT);
		JLabel lWeight = new JLabel("몸무게", Label.RIGHT);
		JLabel lAge = new JLabel("나이", Label.RIGHT);
		
		lId.setHorizontalAlignment(JLabel.CENTER);
		lName.setHorizontalAlignment(JLabel.CENTER);
		lHeight.setHorizontalAlignment(JLabel.CENTER);
		lWeight.setHorizontalAlignment(JLabel.CENTER);
		lAge.setHorizontalAlignment(JLabel.CENTER);
		
		JTextField tId = new JTextField();
		JTextField tName = new JTextField();
		JTextField tHeight = new JTextField();
		JTextField tWeight = new JTextField();
		JTextField tAge = new JTextField();
		
		JButton btnSearch = new JButton("조회");
		JButton btnInsert = new JButton("추가");
		JButton btnUpdate = new JButton("수정");
		JButton btnDelete = new JButton("삭제");
		
		JPanel part1 = new JPanel();
		part1.setLayout(new GridLayout(1,0));
		part1.add(lId);
		part1.add(tId);
		
		JPanel part2 = new JPanel();
		part2.add(lName);
		part2.add(tName);
		
		JPanel part3 = new JPanel();
		part1.add(lHeight);
		part1.add(tHeight);
		
		JPanel part4 = new JPanel();
		part1.add(lWeight);
		part1.add(tWeight);
		
		JPanel part5 = new JPanel();
		part1.add(lAge);
		part1.add(tAge);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(0,1));
		p1.add(part1); 
		p1.add(part2);
		p1.add(part3);
		p1.add(part4);
		p1.add(part5);
		
		
		JPanel p2 = new JPanel();
		p2.add(btnSearch);
		p2.add(btnInsert);
		p2.add(btnUpdate);
		p2.add(btnDelete);
		
		List guiList = new List(2, false);
		guiList.setBackground(Color.green);
		
		btnSearch.addActionListener(new MemberHandler());
		btnInsert.addActionListener(new MemberHandler());
		btnUpdate.addActionListener(new MemberHandler());
		btnDelete.addActionListener(new MemberHandler());
		
		frame.add(p1,"North");
		frame.add(guiList, "Center");
		frame.add(p2, "South");
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	
	public class MemberHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}
		
	}
	 
	

	public static void main(String[] args) {
		new BaseWindow2();
	}

}
