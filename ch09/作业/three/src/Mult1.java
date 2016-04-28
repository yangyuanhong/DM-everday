package com.yyh.ch09;

public class Mult1
{
	public static void main(String[] args)
		{
		for(int i=1;i<=9;i++)
			for(int j=1;j<=i;j++){
              if(i*j<10){
			 System.out.print(j+"*"+i+" = "+i*j+"   ");
			  }else 
			{
			  System.out.print(j+"*"+i+" = "+i*j+"  ");
			  }
				if(i==j)
			{
			      System.out.println();	
			}
			  }
                 System.out.println();
		}
}