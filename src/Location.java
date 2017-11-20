public class Location {   // Location 클래스 작성
	private String name;
	private String lati;
	private String longi;   // private로 선언
	
	public Location(String name, String lati, String longi) {   // 생성자
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


