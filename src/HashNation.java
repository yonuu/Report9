import java.util.*;

public class HashNation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.(��: Korea 5000)");
		while(true) {    // "�׸�"�� �Էµ� ������ �ݺ��Ѵ�
			System.out.print("���� �̸�, �α� >> ");		
			String nation = scanner.next();
			if(nation.equals("�׸�"))
				break;   // �Է��� �����Ѵ�
			int popul = scanner.nextInt();
			nations.put(nation, popul); // �ؽø� �����̸��� �μ� ����
		}
		
		while(true) {
			System.out.print("�α� �˻� >> ");
			String nation = scanner.next();
			if(nation.equals("�׸�"))
				break;
			Integer n = nations.get(nation);
			if(n == null)
				System.out.println(nation + " ����� �����ϴ�.");
			else 
				System.out.println(nation + "�� �α��� " + n); 
		}
		scanner.close();
	}
}

