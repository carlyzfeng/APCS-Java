import java.sql.Array;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] mergesort(int[] a) {
		if(a.length < 2) {
			return a;
		}
		else {
			return merge(mergesort(partition1 (a)), mergesort(partition2 (a)));
		}
	}
	
	public static int[] merge(int[] a, int[] b) {
		if(a == null) {
			return b;
		}
		else if(b == null) {
			return a;
		}
		else if(a[0] < b[0]) {
			return a + merge(cdr a, b); 
		}
		else {
			return a[0] + merge(a, cdr b);
		}
	}
	
	public static int[] partition1(int[] a) {
		int numelements = (int) a.length / 2;
		private part(int counter, int[]a) {
			if(counter == numelements)
		}
		return a;
		
	}
	
	public static int[] partition2(int[] a) {
		return a;
		
	}

}
