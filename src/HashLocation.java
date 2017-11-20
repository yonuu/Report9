import java.util.*;

public class HashLocation {
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Location> dept = new HashMap<String, Location>();
	
	private void read() {
		System.out.println("����, �浵, ������ �Է��ϼ���.");
		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String lati = st.nextToken().trim();
			String longi = st.nextToken().trim();
			
			Location location = new Location(name, lati, longi);
			dept.put(name, location);   //�ؽøʿ� �����Ѵ�
		}
		System.out.println("---------------------------");
	}
	
	private void printAll() {
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next();   // �̸��� �˾Ƴ���
			Location location = dept.get(name); // �̸��� Ű���Ͽ� �ؽø����� Location ��ü�� ����
			System.out.println(location.getName() + " " + location.getLati() + " " + location.getLongi());
		}
		System.out.println("---------------------------");
	}
	
	private void processQuery() {
		while(true) {
			System.out.print("���� �̸� >> ");
			String name = scanner.nextLine(); // �л� �̸��� �Է��Ѵ�
			if(name.equals("�׸�"))
				return;
			
			Location location = dept.get(name); // �ؽøʿ��� �̸��� Ű�� �˻��Ѵ�
			if(location == null) { 
				System.out.println(name + "�� �����ϴ�.");
			}
			else {
				System.out.print(location.getName() + " ");
				System.out.print(location.getLati() + " ");
				System.out.println(location.getLongi() + " ");
			}
		}
	}
	
	public void run() {
		read();
		printAll();
		processQuery();
	}
	
	public static void main(String[] args) {
		HashLocation l = new HashLocation();
		l.run();
	}
}

