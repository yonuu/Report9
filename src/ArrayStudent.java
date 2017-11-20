import java.util.*;

public class ArrayStudent {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Student> dept = new ArrayList<Student>();
	
	private void read() {
		System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			String id = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			
			Student student = new Student(name, department, id, grade);
			dept.add(student);   // ArrayList��  student�� �����Ѵ�
		}		
		System.out.println("---------------------------");
	}
	
	private void printAll() { 
		Iterator<Student> it = dept.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println("�̸�:" + student.getName());
			System.out.println("�а�:" + student.getDepartment());
			System.out.println("�й�:" + student.getId());
			System.out.println("�������:" + student.getGrade());
			System.out.println("---------------------------");
		}		
	}

	private void processQuery() {
		while(true) {
			System.out.print("�л� �̸� >> ");
			String name = scanner.nextLine();   // �л� �̸��� �Է��Ѵ�
			if(name.equals("�׸�"))
				return; 
			
			for(int i=0; i<dept.size(); i++) { 
				Student student = dept.get(i);
				if(student.getName().equals(name)) {    // �̸��� ���� Student�� Ȯ���Ѵ�
					System.out.print(student.getName() + ", ");
					System.out.print(student.getDepartment() + ", ");
					System.out.print(student.getId() + ", ");
					System.out.println(student.getGrade());
					break; 
				}
			} 
		}
	}
	public void run() {
		read();
		printAll();
		processQuery();
	}
	public static void main (String[] args) {
		ArrayStudent man = new ArrayStudent();
		man.run();
	}
}


