
public class WennSonst {

	public static void main(String[] args) {
		int a = -1;
		int b = 3;
		
		if (a < 0) {
			a = 0;
			b = 0;
		} else {
			a = 2;
			b = 2;
		}
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int q = -1;
		q = q < 0 ? 0 : 2;
		System.out.println("q: " + q);
		
		int w = 9;
		int e = 3;
		switch(w) {
		case -1:
			e = 7;
			break;
		case 9:
			e = 70;
			break;
		default:
			e = 3;
		}
		System.out.println("e: " + e);

	}

}
