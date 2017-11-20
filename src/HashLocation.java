import java.util.*;

public class HashLocation {
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Location> dept = new HashMap<String, Location>();
	
	private void read() {
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String lati = st.nextToken().trim();
			String longi = st.nextToken().trim();
			
			Location location = new Location(name, lati, longi);
			dept.put(name, location);   //해시맵에 저장한다
		}
		System.out.println("---------------------------");
	}
	
	private void printAll() {
		Set<String> key = dept.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next();   // 이름을 알아낸다
			Location location = dept.get(name); // 이름을 키로하여 해시맵으로 Location 객체를 얻어낸다
			System.out.println(location.getName() + " " + location.getLati() + " " + location.getLongi());
		}
		System.out.println("---------------------------");
	}
	
	private void processQuery() {
		while(true) {
			System.out.print("도시 이름 >> ");
			String name = scanner.nextLine(); // 학생 이름을 입력한다
			if(name.equals("그만"))
				return;
			
			Location location = dept.get(name); // 해시맵에서 이름을 키로 검색한다
			if(location == null) { 
				System.out.println(name + "는 없습니다.");
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

