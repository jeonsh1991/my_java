package ex0813;

import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class memberController extends JFrame {
	
	public memberController() {
	
		memberService service = new memberService();
		ArrayList<memberVO> list = service.findStudentbyKeyword();
		JPanel getli = new JPanel(new GridLayout(list.size(),1));
		Container c = getContentPane();
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
		
}
	

public static void main(String[] args) {
	// TODO Auto-generated method stub
	new memberController();

}

}



