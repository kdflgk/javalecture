package bit.r45.ch06;

public class Member {
	//필드
	private String id;
	private String name;
	private int point;
	
	//생성자
	public Member() 
	{		
	}
	
	public Member(String id1, String name1, int point1) {
		this.id=id1;
		this.name=name1;
		this.point=point1;
	}
	
	//get
	public String getName() {		
		return name;
	}
	
	public int getPoint() {		
		return point;
	}
	
	public String getId() {
		return id;
	}
		
	//set
	public void setName(String name) {		
		this.name = name;
	}
	
	public void setPoint(int point) {		
		this.point=point;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	//print
	public void info() {
		System.out.println(id+"\t"+name+"\t"+point);
	}
	
	public void printInfo() {
		System.out.println("ID : "+ id);
		System.out.println("이름 : " + name);
		System.out.println("POINT : " + point);
	}

	
}
