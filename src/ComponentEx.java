import javax.swing.*;
import java.awt.*;

public class ComponentEx extends JFrame{
	public ComponentEx() {
		super("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		for(int i=0; i<20; i++) {
			JLabel label = new JLabel();
			label.setBackground(Color.BLUE);
			label.setOpaque(true);            // 20���� ������Ʈ�� ����Ѵ�
			
			int x = (int)(Math.random() * 200) + 50;
			int y = (int)(Math.random() * 200) + 50;
			label.setLocation(x, y);
			label.setSize(10, 10);
			add(label);                                 // JLabel ������Ʈ�� ��ġ�� �����ϰ� ����
		}
		setSize(300, 300);   // �������� ũ�⸦ ����
		setVisible(true);    // �������� ȭ�鿡 ���
	}
	public static void main(String[] args) {
		new ComponentEx();
	}
}

