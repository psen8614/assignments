package package2;

import java.util.Scanner;

class Series {
	public static void main(String[] args) {
		
		int i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("please give input");
		i=s.nextInt();
		int sum=0;
		System.out.print("output");
		for(int j=1;j<=i;j++) {
			for(int a=0;a<j;a++) {
				 sum=a+j;
			 
		}
			System.out.print(" "+sum);
	}
	}

}
