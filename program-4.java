package package2;
import java.util.Scanner;

class Dictionary1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("please enter the total number");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("please enter the values");
		
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
				System.out.println(arr[i]);
				
				}
			
		}
	}
