
public class Operatoren {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		System.out.println(a == b);
		System.out.println(a != b);	
		System.out.println();		
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println();
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println();
		System.out.println(!(a == b));
		System.out.println();
		
		int q = 1;
		int w = -2;
		boolean c = (q > 0) & (w > 0);
		System.out.println(c);
		//überprüft alle
		boolean d = (q > 0) | (w > 0);
		System.out.println(d);
		//überprüft nur einen (wenn true dann abbruch und ist true)
		boolean e = (q > 0) || (w > 0);
		System.out.println(e);
		//überprüft nur einen (wenn false dann abbruch und ist false)
		boolean f = (q > 0) && (w > 0);
		System.out.println(f);

	}

}
