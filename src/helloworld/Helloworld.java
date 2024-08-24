package helloworld;

public class Helloworld {
	public static void main(String[] args) {
		int x = 3;
		int m = 1;
		
		System.out.print("M" + m + ": \n");
		
		M1(x);
		m += 2;
		
		System.out.print("M" + m + ": \n");
		M3(x);
	}
	
	static void M1(int x) {
		System.out.print("A"+ x+ "\n");
		
		if (x > 0)
			M1(x-1);
		
		System.out.print("B" + x+ "\n");
	}
	
	static void M3(int x) {
		while (x > 0) {
			System.out.print("A" + x + "\n");
			x = x - 1;
		}
		//FUCK
		System.out.print("A" + x + "\n");
		
		while(x < 4) {
			System.out.print("B" + x + "\n");
			x++;
		}
	}
}
