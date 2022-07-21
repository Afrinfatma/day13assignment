package com.day13;

import java.util.Scanner;

public class uc1 {
    
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=input.nextInt();
		System.out.println("Enter Second Number");
		int num2=input.nextInt();
		System.out.println("Enter Third Number");
		int num3=input.nextInt();
		if( num1 > num2 && num1> num3) {
		  System.out.println("The max3 of three number is num1:" +num1);
			}
		else if (num2 > num3) {
			System.out.println("The max of three number is num2 :" +num2);
		}
		else {
			System.out.println("The max of three number is num3:" +num3);
		}
	
	}
}
