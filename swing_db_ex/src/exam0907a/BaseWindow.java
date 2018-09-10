package exam0907a;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class BaseWindow extends JFrame{
	
	MemberVo memberVO = new MemberVo();
	ArrayList<MemberVo> list = new ArrayList<MemberVo>();
	JPanel getli = new JPanel(new GridLayout(5,1));
	Container c = getContentPane();
	
	JTextField jf1;
	JTextField jf2;
	JTextField jf3;
	JTextField jf4;
	JTextField jf5;
	
	JTextField serjl;
	
	JButton view;
	JButton insert;
	JButton ref;
	JButton del;
	
	JTextField userAge = new JTextField();
	
	ArrayList getList = new ArrayList();
	
	BaseWindow() {
		setTitle("BASEWINDOW");
		
		JPanel jp1 = new JPanel(new GridLayout(5,2));
		c.setLayout(new FlowLayout());
		JLabel la1 = new JLabel("아이디");
		System.out.println("error"+la1.getText());
		jf1 = new JTextField(15);
		System.out.println("error"+jf1.getText());
		la1.setHorizontalAlignment(JLabel.CENTER);
		jp1.add(la1); jp1.add(jf1);
		
		JLabel la2 = new JLabel("이름");
		jf2 = new JTextField(15);
		la2.setHorizontalAlignment(JLabel.CENTER);
		jp1.add(la2); jp1.add(jf2);
		
		JLabel la3 = new JLabel("키");
		jf3 = new JTextField(15);
		la3.setHorizontalAlignment(JLabel.CENTER);
		jp1.add(la3); jp1.add(jf3);
		
		JLabel la4 = new JLabel("몸무게");
		jf4 = new JTextField(15);
		la4.setHorizontalAlignment(JLabel.CENTER);
		jp1.add(la4); jp1.add(jf4);
		
		JLabel la5 = new JLabel("나이");
		jf5 = new JTextField(15);
		la5.setHorizontalAlignment(JLabel.CENTER);
		jp1.add(la5); jp1.add(jf5);
		
		
		
		c.add(jp1);
		
		JLabel lijl = new JLabel("    아이디          이름              키          몸무게        나이");
		lijl.setHorizontalAlignment(JLabel.CENTER);
		c.add(lijl);
		
		ArrayList<MemberVo> vlist = new ArrayList<MemberVo>();
		memberDAO dao = new memberDAO();
		vlist = dao.listMember();
		for(int i=0; i<vlist.size(); i++) {
			String getID = vlist.get(i).getUserID();
			String getName = vlist.get(i).getUserName();
			int getHeight = vlist.get(i).getHeight();
			int getWeight = vlist.get(i).getWeight();
			int getAge = vlist.get(i).getAge(); 
			userAge = new JTextField("    "+getID+"          "+getName+"              "+getHeight+"          "+getWeight+"        "+getAge);
			c.add(userAge);
		}

		
		
		JPanel buttonPanel = new JPanel(new GridLayout(1,4));
		view = new JButton("조회");
		insert = new JButton("등록");
		ref = new JButton("갱신");
		del = new JButton("삭제");
		
		view.addActionListener(new MemberHandler());
		insert.addActionListener(new MemberHandler());
		ref.addActionListener(new MemberHandler());
		del.addActionListener(new MemberHandler());
		
		
		buttonPanel.add(view); buttonPanel.add(insert); buttonPanel.add(ref);
		buttonPanel.add(del);
		c.add(buttonPanel);
		
			
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300+(vlist.size()*5));
		setVisible(true);
		

	}
	public class MemberHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == view) {
				ArrayList<MemberVo> vlist = new ArrayList<MemberVo>();
				memberDAO dao = new memberDAO();
				vlist = dao.listMember();
				JTextField[] listM;
				listM = new JTextField[vlist.size()];
				for(int i=0; i<vlist.size(); i++) {
					String getID = vlist.get(i).getUserID();
					String getName = vlist.get(i).getUserName();
					int getHeight = vlist.get(i).getHeight();
					int getWeight = vlist.get(i).getWeight();
					int getAge = vlist.get(i).getAge(); 
					listM[i].setText("    "+getID+"          "+getName+"              "+getHeight+"          "+getWeight+"        "+getAge);
					c.add(listM[i]);
				}
				setVisible(true);
			}
			if (e.getSource() == insert) {
				MemberVo mem = new MemberVo();
				String id = jf1.getText();
				String name = jf2.getText();
				int height = Integer.parseInt(jf3.getText());
				int weight = Integer.parseInt(jf4.getText());
				int age = Integer.parseInt(jf5.getText());
				mem.setUserID(id);
				mem.setUserName(name);
				mem.setHeight(height);
				mem.setWeight(weight);
				mem.setAge(age);
				
				memberDAO memDAO = new memberDAO();
				memDAO.insertMember(mem);
				
			}
			else if(e.getSource() == ref) {
				MemberVo dao = new MemberVo();
				String id = jf1.getText();
				String name = jf2.getText();
				int height = Integer.parseInt(jf3.getText());
				int weight = Integer.parseInt(jf4.getText());
				int age = Integer.parseInt(jf5.getText()); 
				dao.setUserID(id);
				dao.setUserName(name);
				dao.setHeight(height);
				dao.setWeight(weight);
				dao.setAge(age);
				
				memberDAO DAO = new memberDAO();
				DAO.updateMember(dao);
			}
			else if(e.getSource() == del) {
				MemberVo dao = new MemberVo();
				String id = jf1.getText();
				
				dao.setUserID(id);
				memberDAO DAO = new memberDAO();
				DAO.deleteMember(dao);
			}
			
		}
		
	}
	
	 
	

	public static void main(String[] args) {
		new BaseWindow();
	}

}
