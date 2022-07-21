package com.day13;

public class MaximumTest<T extends Comparable<T>> {
  T x,y,z;
  public MaximumTest (T x,T y,T z) {
	  this.x=x;
	  this.y=y;
	  this.z=z;
  }
	  public T maximum() {
		  return MaximumTest.maximum(x,y,z);
	  }
	 public static <T extends Comparable <T>>T Maximum (T x ,T y ,T z){
		 T max=x;
		 if (y.compareTo(max)>0) {
			 max=y;
		 }
	   if (z.compareTo(max)>0){
		   max=z;
	   }
		 printMax(x,y,z,max);
		 return max;
  }
	 public static String  testMaximum (String x ,String y ,String z){
		 String max=x;
		 if (y.compareTo(max)>0) {
			 max=y;
		 }
	   if (z.compareTo(max)>0){
		   max=z;
	   }
		 printMax(x,y,z,max);
		 return max;
  }
	 
	 
	private static <T> void printMax(T x, T y, T z,T max) {
		System.out.printf("max of %s %s and %s is %s \n",x,y,z,max);
	}
	public static void main(String[] args){
		Integer xInt=5 ,yInt=4,zInt =8;
		Float xFlt=5.2f,yFlt=7.0f,zFlt=8.6f;
		String xStr="Welcome",yStr="to", zStr="java";
		
		MaximumTest.testMaximum(xStr ,yStr ,zStr);
		new MaximumTest(xInt ,yInt,zInt).maximum();
		new MaximumTest(xFlt ,yFlt,zFlt).maximum();
		new MaximumTest(xStr ,yStr,zStr).maximum();
		
		
		
	}
  
  
  
  
}
