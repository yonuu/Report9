public class Location {   // Location Ŭ���� �ۼ�
	private String name;
	private String lati;
	private String longi;   // private�� ����
	
	public Location(String name, String lati, String longi) {   // ������
		this.name = name;
		this.lati = lati;
		this.longi = longi;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setLati(String lati) {
		this.lati = lati;
	}
	public String getLati() {
		return lati;
	}
	public void setLongi(String longi) {
		this.longi = longi;
	}
	public String getLongi() {
		return longi;
	}
}


