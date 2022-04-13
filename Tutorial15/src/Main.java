
public class Main {

	public static void main(String[] args) {
		
		Node one = new Node(10, 20);
		Node two = new Node(30, 40);
		Node result = one.getCenter(two);
		System.out.println("x : " + result.getX() + ", y : " + result.getY());
		
		String test1 = new String("test");
		String test2 = new String("test");
		if(test1 == test2) {
			System.out.print("°°´Ù");		}
	}

}
