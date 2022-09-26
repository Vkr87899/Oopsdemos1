package com.training.basics;

public class Shape {
	   
      void  calArea(int x)
      {
    	  System.out.println("square "+(x*x));
      }
      void calArea(double  x)
      {
    	  System.out.println("circle "+(Math.PI*x*x));
      }
      
      int calArea(int x, int y)
      {
    	  return x*y;
      }
      double calArea(int x, float y)
      {
    	  return 0.5*x*y;
      }
}
