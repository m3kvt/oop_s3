import java.util.*;
class compare{
  public static void main(String a[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    if (num1==num2)
      System.out.println(num1+" is equal to "+num2);
    else if (num1>num2)
      System.out.println(num1+" greater than "+num2);
    else if (num1<num2)
      System.out.println(num1+" less than "+num2);
    
  }
}
