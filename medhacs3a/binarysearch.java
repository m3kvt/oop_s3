import java.io.*;
import java.util.Scanner;
class binarysearch{
	public static void main(String a[]){
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		  for(int i=0; i < n; i++){  
       for(int j=1; j < (n-i); j++){  
         if(arr[j-1] > arr[j]){  
          temp = arr[j-1];  
          arr[j-1] = arr[j];  
          arr[j] = temp;  
   }}}
		System.out.println("Sorted array:");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		int low=0;
		int high=n-1;
		int key;
		System.out.println("Enter the element to be searched:");
		key=sc.nextInt();
		int mid=(low+high)/2;
		int flag=0;
		while (low<high){
			if (arr[mid]==key){
				System.out.println("Element found at index "+mid);
				flag=1;
				break;}
			else if (arr[mid]<key)
				low=mid+1;
			else 
				high=mid-1;
		}
		if(flag==0){
			System.out.println("Element not found");}
		


}}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
