
import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(5, 7));   // ������Ʈ ������ ������ ����
		
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("West"), BorderLayout.WEST);
		
		setSize(500, 300);   // �������� ũ�� ����
		setVisible(true);    // �������� ȭ�鿡 ���
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}

