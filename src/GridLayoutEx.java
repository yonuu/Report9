import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		super("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));  // ��ư�� ũ��� �����ϴ�
		
		JButton [] jb = new JButton [10];
		for(int i=0; i<jb.length; i++) {
			jb[i] = new JButton(Integer.toString(i));
			c.add(jb[i]);     // 10���� ��ư�� ���
		}
		setSize(600, 300);   // �������� ũ�� ����
		setVisible(true);    // �������� ȭ�鿡 ���
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}
