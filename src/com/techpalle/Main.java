package com.techpalle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test t = new Test();
		System.out.println("Enter a Number");
		int m = sc.nextInt();
		switch(m){
		case 1:
			t.creating();
			System.out.println("Your Code Is Terminated");
			break;
		case 2:
			System.out.println("enter a eno");
			int a = sc.nextInt();
			System.out.println("enter a name");
			String b = sc.next();
			System.out.println("enter a salary");
			int c = sc.nextInt();
			t.inserting(a,b,c);
			System.out.println("Your Code Is Terminated");
			break;
		case 3:
			System.out.println("enter a eno");
			int c1 = sc.nextInt();
			System.out.println("enter a ename");
			String a1 = sc.next();
			System.out.println("enter a esal");
			int b1 = sc.nextInt();
			t.update(c1,a1,b1);
			System.out.println("Your Code Is Terminated...");
			break;
		case 4:
			System.out.println("enter a eno");
			int a2 = sc.nextInt();
			t.delete(a2);
			System.out.println("Your Code Is Terminated...");

			break;
		case 5:
			System.out.println("Exit");
			System.out.println("Your Code Is Terminated...");
			break;
			default:
				System.out.println("Enter no between 1 to 5");
		}
	}

}
