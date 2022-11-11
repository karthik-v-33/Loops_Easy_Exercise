package com.GitHub_Updates;
import java.util.Scanner;
public class Loop_n_OddNumbers {

	public static void main(String[] args) {
		int n;
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		n = sc.nextInt();
		while(i<=n) {
			if(i%2!=0) {
			System.out.println(i);
			}
			i++;
		}
	}

}
