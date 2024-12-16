package nithinr;

public class outer {
	int x;
	void display() {
		System.out.println("outer class display x:"+x);
		Inner inner = new Inner();
		inner.x = 100;
		inner.display();
		
	}
	class Inner {
		int x;
		void display() {
			System.out.println(" In Inner display x:"+x);
			
		}
	}

	public static void main(String[] args) {
		outer out = new outer ();
		out.x = 200;
		out.display();
	}

}
