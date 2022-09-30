package question;

import java.util.Scanner;

public class Programe_3 {
     public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
	System.out.println("enter the integer");
		int x=obj1.nextInt();
     int b=1;
     if (x%2==0) {
     for(int i=1;i<=x-1;i++) {
           System.out.print(b+" ");
           b=b+2;
           }
     }
     else if(x%2!=0) {
    	for(int i=1;i<=x;i++) {
    		System.out.print(b+" ");
    		b=b+2;
    	}
     
   }
 }
}
