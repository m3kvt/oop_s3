import java.util.*;
import java.lang.Math;
class armstrong{
  public static void main(String a[]){
    int digit,digits=0,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    while(num!=0){
      digit=num%10;
      digits+=1;
      num=num/10;
    }
    while(num!=0){
      digit=num%10;
      sum+=pow(digit,digits);
      num=num/10;
      
    }
    if (sum==num){
      System.out.println("It is an armstrong number");
    }
    else
      System.out.println("Not an armstrong number");
  }
}
