
public class Main {

	public static void main(String[] args) {
		int x;
		Randp rand = new Randp(6);
		x = rand.nextInt();	// randomly returns 5
		System.out.println(x);
		x = rand.nextInt();	// randomly returns 2
		System.out.println(x);
		x = rand.nextInt();	// randomly returns 6
		System.out.println(x);
		x = rand.nextInt();	// randomly returns 4
		System.out.println(x);
		x = rand.nextInt();	// randomly returns 1
		System.out.println(x);
		x = rand.nextInt();	// randomly returns 3
		System.out.println(x);
		x = rand.nextInt();	// returns 0
		System.out.println(x);
		x = rand.nextInt();	// returns 0
		System.out.println(x);

	}

}
