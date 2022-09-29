package package2;
import java.util.Scanner;

class Newabc {

	public static void main(String[] args) {

		double a = 0;
		double b=0;
		String typeofoperation="calculation";
		double c;
		double d;
		double e;
		double f;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number a");
		a=s.nextDouble();
		System.out.println("enter number b");
		b=s.nextDouble();
		 c=a+b;
		 d=a*b;
		 e=a/b;
		 f=a-b;
		System.out.println("addition result "+" "+typeofoperation+""+c);
		System.out.println("muliplication result "+" "+typeofoperation+""+d);
		System.out.println("division result "+" "+typeofoperation+""+e);
		System.out.println("substraction result "+" "+typeofoperation+""+f);
	}
	
}	
		
		
