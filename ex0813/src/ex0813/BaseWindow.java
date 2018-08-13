package ex0813;
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
	
	JTextField jf1;
	JTextField jf2;
	JTextField jf3;
	JTextField jf4;
	JTextField jf5;
	
	JButton view;
	JButton insert;
	JButton ref;
	JButton del;
	
	BaseWindow() {
		setTitle("BASEWINDOW");
		
		Container c = getContentPane();
		JPanel jp1 = new JPanel(new GridLayout(5,2));
		c.setLayout(new FlowLayout());
		JLabel la1 = new JLabel("아이디");
		System.out.println("error"+la1.getText());
		JTextField jf1 = new JTextField(15);
		System.out.println("error"+jf1.getText());
		la1.setHorizontalAlignment(JLabel.CENTER);
		jp1.add(la1); jp1.add(jf1);
		
		JLabel la2 = new JLabel("이름");
		JTextField jf2 = new JTextField(15);
		la2.setHorizontalAlignment(JLabel.CENTER);
		jp1.add(la2); jp1.add(jf2);
		
		JLabel la3 = new JLabel("키");
		JTextField jf3 = new JTextField(15);
		la3.setHorizontalAlignment(JLabel.CENTER);
		jp1.add(la3); jp1.add(jf3);
		
		JLabel la4 = new JLabel("몸무게");
		JTextField jf4 = new JTextField(15);
		la4.setHorizontalAlignment(JLabel.CENTER);
		jp1.add(la4); jp1.add(jf4);
		
		JLabel la5 = new JLabel("나이");
		JTextField jf5 = new JTextField(15);
		la5.setHorizontalAlignment(JLabel.CENTER);
		jp1.add(la5); jp1.add(jf5);
		
		
		
		c.add(jp1);
		//c.add(pa1, FlowLayout.LEFT); c.add(pa2, FlowLayout.RIGHT);
		/*c.add(la1); c.add(jf1); c.add(la2); c.add(jf2);
		c.add(la3); c.add(jf3); c.add(la4); c.add(jf4);
		c.add(la5); c.add(jf5);*/
		
		JLabel lijl = new JLabel("    아이디          이름              키          몸무게        나이");
		lijl.setHorizontalAlignment(JLabel.CENTER);
		c.add(lijl);
		
		
		memberService service = new memberService();
		ArrayList<memberVO> list = service.findStudentbyKeyword();
		JPanel getli = new JPanel(new GridLayout(list.size(),1));
		for(int i=0; i<list.size(); i++) {
			memberVO data =  (memberVO) list.get(i);
			String id = data.getId();
			String name=data.getName();
			int height=data.getHeight();
			int weight=data.getWeight();
			int age=data.getAge();
			JTextField serjl = new JTextField(30);
			serjl.setText(id +"            "+ name +"            "+ height +"            "+ weight +"            "+ age);
			serjl.setHorizontalAlignment(JTextField.CENTER);
			getli.add(serjl);
			c.add(getli);
			System.out.println(id+name+height+weight+age);
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
		setSize(400,300);
		setVisible(true);
		

	}
	public class MemberHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == view) {
				
				memberController mc = new memberController();
			}
			else if (e.getSource() == insert) {
				memberVO mem = new memberVO();
				System.out.println("error999");
				System.out.println("error11"+jf1.getText());
				String id = jf1.getText();
				String name = jf2.getText();
				int height = Integer.parseInt(jf3.getText());
				int weight = Integer.parseInt(jf4.getText());
				int age = Integer.parseInt(jf5.getText());
				
				mem.setId(id);
				mem.setName(name);
				mem.setHeight(height);
				mem.setWeight(weight);
				mem.setAge(age);
				
				memberInsert mb = new memberInsert(mem);
				
			}
			else if(e.getSource() == ref) {
				memberController mc = new memberController();
			}
			else if(e.getSource() == del) {
				memberController mc = new memberController();
			}
			
		}
		
	}
	
	 
	

	public static void main(String[] args) {
		new BaseWindow();
	}

}
