package com.yyh.ch09;

public class Mult3
{
	public static void main(String[] args)
		{
		int i=0;
		int j=0;
		for( i=1;i<=9;i++){
            Control  con=new Control();
			con.get(i,j);
             for( j=1;j<=i;j++)
             {
              if(i*j<10){
			 System.out.print(j+"*"+i+" =  "+i*j+"  ");
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
}