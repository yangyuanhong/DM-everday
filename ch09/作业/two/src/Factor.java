package com.yyh.ch09;

import java.util.Scanner;
public class Factor
{
  public static void main(String[] args)
	{
	  long fac=1;
	    int X = 1;
		Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数X:");
		   X= scanner.nextInt();
	   while(X>=1)
		{
	        fac=fac*X;
            X--;
	   }
	   System.out.println("X!="+fac);
  }

}

