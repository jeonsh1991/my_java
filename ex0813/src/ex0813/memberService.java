package ex0813;

import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

public class memberService extends JFrame {
	
	
	public ArrayList<memberVO> findStudentbyKeyword() {
		
		memberDAO dao = new memberDAO();
		
		ArrayList<memberVO> list = dao.list();
		return list;
		
	}
		
}
