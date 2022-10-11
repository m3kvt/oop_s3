import java.util.*;
import java.lang.Math;
class armstrong{
public static void main(String a[]){
int temp,n, digits=0, last=0, sum=0;
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number to be checked: ");   
n=sc.nextInt();  
temp=n;    
while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   
temp = n;   
while(temp>0)   
{   
last = temp % 10;   
sum +=  (Math.pow(last, digits));   
temp = temp/10;   
}  
    if (sum==n){
      System.out.println("It is an armstrong number");
    }
    else
      System.out.println("Not an armstrong number");
    
  }
}
