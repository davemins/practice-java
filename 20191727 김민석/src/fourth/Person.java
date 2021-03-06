package fourth;

//키와 체중을 멤버로 하는 Person 클래스
public class Person {
	
	private double height; //키 객체 생성
	private double weight; //체중 객체 생성
	
	public double getHeight() { //키의 값에 접근하는 메소드
		return height;
	}
	public void setHeight(double height) { //키의 값을 변경하는 메소드
		this.height = height;
	}
	public double getWeight() { //체중의 값에 접근하는 메소드
		return weight;
	}
	public void setWeight(double weight) { //체중의 값을 변경하는 메소드
		this.weight = weight;
	}
	
	
	public Person(double height, double weight) { //생성자 선언
		super();
		this.height = height;
		this.weight = weight;
	}
	
}
