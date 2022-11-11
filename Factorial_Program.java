package com.GitHub_Updates;
import java.util.Scanner;
public class Factorial_Program {

	public static void main(String[] args) {
		int i=1;
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Factorial number :");
		int n = sc.nextInt();
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}

}
