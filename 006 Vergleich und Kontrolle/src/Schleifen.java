
public class Schleifen {

	public static void main(String[] args) {
		int i = 0;
		int n = 5;
		System.out.println("while");
		while (i < 10) {
			System.out.println(i);
			if (i > n) {
				break;
			}
			i++;
		}
		
		i = 0;
		System.out.println();
		System.out.println("do while");
		do {
			System.out.println(i);
			if (i > n) {
				break;
			}
			i++;
		} while (i < 10);
		
		System.out.println();
		System.out.println("for");
		for(int q = 0, w = 5; q < 10; q++) {
			System.out.println(q);
			if (q > w) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("continue");
		for(int e = 0; e < 10; e++) {
			if (e == 5) {
				continue;
			}
			System.out.println(e);
		}

	}

}
