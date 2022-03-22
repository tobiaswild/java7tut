
public class uebung {

	public static void main(String[] args) {
		int[] a = new int[]{123,456,789};
		int[] b = new int[]{123,456,789};
		
		boolean even = true;
		for (int i = 0; i < b.length; i++) {
			if (a[i] != b[i]) {
				even = false;
				break;
			}
			
		}
		System.out.println(even);
	}

}
