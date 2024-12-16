package nithinr;
import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number of elements in array: ");
		
		int a[]=new int[10];
		for(int i=0;i<10;i++) 
			a[i]=scn.nextInt();
		System.out.println("max of 10 numbers is:");
		int max=a[0];
		for(int i=0;i<10;i++)
			if(a[i]>max)
				max=a[i];
		System.out.println(max);
		
	}

}
