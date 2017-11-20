import java.util.*;

public class ArrayListGrade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> grade = new ArrayList<Character>();  // ArrayList 객체를 생성한다
		
		double sum=0;
		int count=0;
		double score[] = new double[6];  // 실수형 배열 score를 생성한다
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");
		
		while(count != 6) {
			String st = scanner.next();   // String에 문자열을 입력한다
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
		System.out.println(sum/grade.size());   // 평균을 출력한다
	}
}


