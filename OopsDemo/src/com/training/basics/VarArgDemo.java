package com.training.basics;

public class VarArgDemo {
       void calSum(String name,int...marks)
       {
    	   System.out.println("welcome");
    	   int  sum=0;
    	   for(int value:marks)
    	   {
    		   sum+=value;
    	   }
    	   System.out.println("sum is :"+sum);
    	   System.out.println();
       }
       
       public static void main(String[] args) {
		VarArgDemo demo=new VarArgDemo();
		demo.calSum("sadik",10,20,45);
		demo.calSum("naveen",10,20,45,70,05);
		demo.calSum("hi",10,20);
	}
}
