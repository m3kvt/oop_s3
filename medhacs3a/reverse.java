import java.util.*;
class reverse {
    public static void main(String a[]){  
        int rem,rev=0,temp;    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int num = sc.nextInt();
        temp=num;    
        while(num>0){    
         rem=num%10;  //getting remainder  
         rev=(rev*10)+rem;    
         num=num/10;    
        }    
        System.out.println("The reversed number is "+rev);
}
}