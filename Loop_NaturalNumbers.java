package com.GitHub_Updates;
import java.util.Scanner;
public class Loop_NaturalNumbers {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sum of natural number :");
		int n = sc.nextInt();
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}
