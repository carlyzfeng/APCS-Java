
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 loops
		int[] data = new int[10];
		data[0] = 4;
		data[1] = 6;
		data[2] = 3;
		data[3] = 8;
		data[4] = 9;
		data[5] = 2;
		data[6] = 1;
		data[7] = 5;
		data[8] = 7;
		data[9] = 0;
		
		for (int w = 0; w < data.length; w++) {
			for (int i = 0; i < data.length - 1; i++) {
				if(data[i] > data[i+1]) {
					int x = data[i];
					data[i] = data[i+1];
					data[i+1] = x;
				}
			}
			System.out.print(data.length - w - 1);
		}
		
	}

}
