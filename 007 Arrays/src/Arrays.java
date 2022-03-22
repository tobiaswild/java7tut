
public class Arrays {
	
	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 123;
		a[1] = 456;
		a[2] = 789;
		
		int[] b = new int[]{123,456,789};
		
		char[] text = {'H','a','l','l','o'};
		
		System.out.println(a.length);
		
		int[][] q = new int[3][5];
		
		int[][] w = new int[][]{{1,2,3},{4,5,6}};
		
		int[] e = new int[3];
		int r = 0;
		for (int i = 0; i < a.length; i++) {
			e[i] = ++r;
		}
		for (int i = 0; i < a.length; i++) {
			int t = e[i];
			System.out.println(t);
		}
		
	}

}
