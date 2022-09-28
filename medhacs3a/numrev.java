import java.util.*;
class numrev{
  public static void main(String a[]){
    int lastdig,rev=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    while(num!=0){
      lastdig=num%10;
      rev=rev*10+lastdig;
      num=num/10;
      
    }
    System.out.println("The reversed number is "+rev);
  }
}
