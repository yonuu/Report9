import java.util.*;

public class ArrayListGrade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> grade = new ArrayList<Character>();  // ArrayList ��ü�� �����Ѵ�
		
		double sum=0;
		int count=0;
		double score[] = new double[6];  // �Ǽ��� �迭 score�� �����Ѵ�
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>> ");
		
		while(count != 6) {
			String st = scanner.next();   // String�� ���ڿ��� �Է��Ѵ�
			char c = st.charAt(0);
			if((c>='A' && c<='D') || c == 'F') {
				grade.add(c);
				count++;
			} else
				continue;
		}
		for(int i=0; i<grade.size(); i++) {
			if(grade.get(i) == 'A') 
				score[i] = 4.0;
			else if(grade.get(i) == 'B')
				score[i] = 3.0;
			else if(grade.get(i) == 'C')
				score[i] = 2.0;
			else if(grade.get(i) == 'D')
				score[i] = 1.0;
			else if(grade.get(i) == 'F')
				score[i] = 0;
			
			sum += score[i];
		}
		System.out.println(sum/grade.size());   // ����� ����Ѵ�
	}
}


