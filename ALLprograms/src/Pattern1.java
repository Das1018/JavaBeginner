import java.util.Scanner;

import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//int number=1;
			//b=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++)  {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		// TODO Auto-generated method stub
			}
	}

