package question;
import java.util.Scanner;
public class seriesofno {
	
	  public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter the series length");
		int a=obj1.nextInt();
		int b=1;
		for(int i=1;i<=a;i++) {
			System.out.println(b);
			b=b+2;
		}
	  }
}

