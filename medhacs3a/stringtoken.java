import java.util.Scanner;
import java.io.IOException;
import java.util.StringTokenizer;
class stringtoken{
	public static void main(String a[]){
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the list of integers:");
		str=sc.nextLine();
		StringTokenizer sto=new StringTokenizer(str," ");
		int sum=0;
		System.out.println("The integers are:");
		while(sto.hasMoreTokens()){
			int n = 0;
			n = Integer.parseInt(sto.nextToken());
			System.out.println(n);
			sum += n;
		}
		System.out.println("Sum of the numbers is: "+sum);
		
}
}
