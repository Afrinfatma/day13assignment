package com.day13;

import java.util.Scanner;

public class uc1<Static> {
   static String s1="Afrin";
   static String s2="hi";
   static String s3="bye";

   private static void getMax() {
			
		if( s1.length ()> s2.length() && s1.length()> s3.length()) {
		  System.out.println("The max3 of three string is s1:" +s1.length());
			}
		else if (s2.length() > s3.length()) {
			System.out.println("The max of three string  is s2 :" +s2.length());
		}
		else {
			System.out.println("The max of three string is s3:" +s3.length());
		}
		}
	    
      public static void main(String[] args){  
	    getMax();
	    
      }
      }
