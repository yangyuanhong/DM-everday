package com.yyh.ch09;

public class Mult2
{
	public static void main(String[] args)
		{
         for(int i=9;i>=1;i--)
		     for(int j=1;j<=i;j++)
             {
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