import java.awt.*;
import javax.swing.*;

public class ColorButton extends JFrame {
	public ColorButton() {
		super("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));  // ��ư�� ũ��� �����ϴ�
		
		JLabel [] label = new JLabel[10];
		Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE,
				         Color.MAGENTA, Color.DARK_GRAY, Color.PINK, Color.LIGHT_GRAY};   // Color �迭�� ����� ������ �Է��Ѵ�
		
		JButton [] jb = new JButton [10];
		for(int i=0; i<jb.length; i++) {
			jb[i] = new JButton(Integer.toString(i));
			c.add(jb[i]);     // 10���� ��ư�� ���
			jb[i].setBackground(color[i]);
			add(jb[i], color[i]);   // add�� �̿��Ͽ� ��ư�� ������ �߰��Ѵ�
		}
		setSize(600, 300);   // �������� ũ�� ����
		setVisible(true);    // �������� ȭ�鿡 ���
	}
	public static void main(String[] args) {
		new ColorButton();
	}
}


