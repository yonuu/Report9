import java.util.*;
import java.util.Vector;

public class VectorRain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����)>> ");
			int r = scanner.nextInt();
			if(r == 0)
				break;   // 0�� �ԷµǸ� ���α׷��� ����ȴ�
			v.add(r);    // �Էµ� ���� Vector�� �����Ѵ�
		
			for(int i=0; i<v.size(); i++) {
				int n = v.get(i);
			}
			
			// Iterator�� �̿��Ͽ� ��� ������ ����Ѵ�
			Iterator<Integer> it = v.iterator();
			while(it.hasNext()) {
				int n = it.next();
				System.out.print(n + " ");
			}
			
			// Iterator�� �̿��Ͽ� ��� ������ ���Ѵ�
			int sum=0;
			it = v.iterator();
			while(it.hasNext()) {
				int n = it.next();
				sum += n;
			}
			System.out.println();
			System.out.println("���� ��� " + sum/v.size());   // ����� ����ؼ� ����Ѵ�
		}
	}
}

