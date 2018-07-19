import java.sql.Array;

public class HeapSort {

//	public static void main(String[] args) {
//		int[] data = {3, 6, 1, 4, 2, 10, 7, 9, 8, 5};
//		
//		heapSort(data);
//		for (int n: data) {
//			System.out.print(n + " ");
//		}
//	}
//	
//	public static void swap(int[] a, int i, int j) {
//	    int temp = a[i];
//	    a[i] = a[j];
//	    a[j] = temp;
//	}
//	
//	public static void heapSort(int[] arr) {
//		buildHeap(arr);
//		sortHeap(arr);
//	}
//	
//	private static void buildHeap(int[] a) {
//		
//		for(int x = a.length - 1; x >= 0; x--) {
//			int LC = (2*x)+1;
//			int RC = (2*x)+2;
//			//I did a seperate method called trickle which takes in a position of the element you want to trickle and trickles it down the tree
//			//After trickle, I used that procedure with a if loop to build the heap
//			//then i used that procedure with anothe if loop in sortheap to sort the heap
//			//for checking for children, I checked if there is a left child first 
//			//because if you dont have a left child, you dont even have to check for a right child
//			//So I did: left child true -> Check if right child true. If right child true, maybe swap with the larger child
//			//If right child false, only check the left child
//			if(LC > a.length - 1) { // no left child
//			}
//			else if (a[LC] > a[x]) { //yes left child & greater than parent
//				if(RC > a.length - 1) { //no right child
//					swap(a, LC, x);
//				}
//				else { // yes right child
//					if(a[RC] > a[LC]) {
//						swap(a, RC, x);
//					}
//					else {
//						swap(a, LC, x);
//					}
//				}
//			}
//			else {
//				if(RC > a.length - 1) { //no right child
//				}
//				else { // yes right child
//					if(a[RC] > a[x]) {
//						swap(a, RC, x);
//					}
//				}
//			}
//		}
//		
//	}
//	
//	public static void sortHeap(int[] arr) {
//		
//		
//	}
//	
//	public static void adjust() {
//		
//		
//	}
	
	
	// Note the use of modular, top-down programming
    // We know that heapsort needs to build a heap and then sort it,
    // so why not write that as code and then fill in the needed methods?
    public static void heapsort(int[]a) {
        buildHeap(a);
        sortHeap(a);
    }
        
    // I let the other methods be private to make a point about public.
    // The only method that should be visible if you want to do heapsort
    // is the heapsort method itself.  Unless you have a reason to let
    // a method like buildheap be visible outside this class, it probably
    // should be private.  That said, the AP graders are expecting public
    // methods and private instance variables; on the actual test, use
    // public everywhere for methods unless instructed otherwise.
    
    // Trickle hasn't been written, but building the heap is the process
    // of going through the array, right to left, and performing trickle
    // at each place.
    private static void buildHeap(int[] a) {
        for (int i = a.length-1; i >= 0; i--) {
            trickle(a, i, a.length);
        }
    }

    // Swap the root with the last unsorted position
    // Then trickle the new root to maintain a heap
    private static void sortHeap(int[] a) {
        for (int i = a.length-1; i >= 0; i--) {
            swap(a, 0, i);
            trickle(a, 0, i);
        }
    }
        
    // The game plan:
    // * If a node has no children, done
    // * If a node has one child, check to see if a swap is needed
    // * If a node has two children, check to see which is bigger and if a swap is needed
    private static void trickle(int[] a, int i, int lastPosition) {
        // max contains the bigger child datum
        // maxPos contains the place in the array where the bigger child datum is contained
        int max = 0, maxPos = 0;
        if (hasChildren(i, lastPosition)) {
            if (hasOnlyLeftChild(i, lastPosition)) { 
                max = a[left(i)];
                maxPos = left(i);
            } else {
                maxPos = (a[left(i)] > a[right(i)]) ? left(i) : right(i);
                max = a[maxPos];
            }
            // Now determine if a swap is warranted
            // Note that lastPosition holds the biggest array index into which
            // a datum can be trickled.  We don't want to trickle into something
            // that is already sorted!
            if (max > a[i]) {
                swap(a, i, maxPos);
                trickle(a, maxPos, lastPosition);
            }
        }
    }

    // A slew of helper functions to get the details done
    // Sometimes it is easier to identify some of these and write them
    // before writing the higher-level stuff.  Deciding what to write
    // first can be an art form.
    private static int left(int x) { return 2*x + 1; }
    private static int right(int x) { return 2*x + 2; }
    private static int parent(int x) { return (x-1) / 2; }
    
    private static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
        
    private static boolean hasChildren(int index, int length) {
        // Imagine a binary number.  Shifting all of the 1s to the right
        // by a position is the same thing as dividing by two.  It also
        // behaves as integer arithmetics as if there is a one in the 
        // rightmost position, it gets shifted out of existence.
        // No critical reason to do it this way, just wanted to show it.
        return (index+1 <= (length >> 1));
    }

    private static boolean hasOnlyLeftChild(int index, int length) {
        return ((index*2)+2 == length);
    }

	
	
	//left child l(p) = 2p+1
	//right child l(p) = 2p + 2
	//arr.length = 10
}
