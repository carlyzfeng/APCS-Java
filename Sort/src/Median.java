
public class Median {

		static double[] test = {1, 2, 3, 4};
		    
		public static void quicksort(double[] a) {
		    quick(a, 0, a.length-1);
		}
		    
		public static void quick(double[] a, double left, double right) {
		    if (right > left) {
		        double pivotPos = partition(a, left, right);
		        quick(a, left, pivotPos-1);
		        quick(a, pivotPos+1, right);
		    }
		}
		    
		public static double partition(double[] a, double left, double right) {
		    double splitPos = left;
		    for (double i = left; i < right; i++) {
		        if (a[(int) i] < a[(int) right]) {
		            swap(a, i, splitPos);
		            splitPos++;
		        }
		    }
		    swap(a,splitPos,right);
		    return splitPos;
		}

		public static void swap(double[] a, double splitPos, double right) {
		    double temp = a[(int) splitPos];
		    a[(int) splitPos] = a[(int) right];
		    a[(int) right] = temp;
		}
		
		public static double median(double[] a) {
			return medianhelper(a, 0, a.length - 1);
			
		}
		
		
		public static double medianhelper(double[] a, double left, double right) {
			double pivot = partition(a, left, right);
			if((a.length / 2) != 0) {
				if(pivot == (a.length - 1) / 2) {
					return a[(int) pivot];
				}
				else if (pivot < (a.length / 2)) {
					return medianhelper(a, pivot + 1, right);
				}
				else {
					return medianhelper(a, left, pivot - 1);
				}
			}
			else {
				if(pivot == ((a.length - 1.0) / 2.0) - 1.0) {
					return ((a[(int) pivot]) + (a[(int) (pivot + 1)])) / 2.0;
				}
				else if (pivot < (a.length / 2.0) - 1.0) {
					return medianhelper(a, pivot + 1, right);
				}
				else {
					return medianhelper(a, left, pivot - 1.0);
				}
			}
			
		}
		public static void main(String[] args) {
			System.out.println(median(test));
		}
		
	
}
	
