package javatest3;

public class Test {
	private static final int ROWS=6;
	public static void main(String[] args) {
		
		for(int i=1;i<=ROWS;i++) {
			int currentDigit = (i%2==0) ? 0 : 1;
			for(int j=1;j<=i;j++) {
				System.out.print(currentDigit + " ");
				currentDigit = (currentDigit ==0) ? 1 : 0;
			}
			System.out.println();
		}
	}

}
