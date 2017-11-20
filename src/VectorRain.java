import java.util.*;
import java.util.Vector;

public class VectorRain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int r = scanner.nextInt();
			if(r == 0)
				break;   // 0이 입력되면 프로그램이 종료된다
			v.add(r);    // 입력된 수를 Vector에 저장한다
		
			for(int i=0; i<v.size(); i++) {
				int n = v.get(i);
			}
			
			// Iterator를 이용하여 모든 정수를 출력한다
			Iterator<Integer> it = v.iterator();
			while(it.hasNext()) {
				int n = it.next();
				System.out.print(n + " ");
			}
			
			// Iterator를 이용하여 모든 정수를 더한다
			int sum=0;
			it = v.iterator();
			while(it.hasNext()) {
				int n = it.next();
				sum += n;
			}
			System.out.println();
			System.out.println("현재 평균 " + sum/v.size());   // 평균을 계산해서 출력한다
		}
	}
}

