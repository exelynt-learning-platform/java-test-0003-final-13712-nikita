package javatest3;

public class Test {
	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<=n;i++) {
			int num;
			if(i%2==0) {
				num=0;
			}else {
				num=1;
			}
			for(int j=1;j<=i;j++) {
				System.out.print(num);
				num=(num ==0) ? 1:0;
			}
			System.out.println();
		}
	}

}
