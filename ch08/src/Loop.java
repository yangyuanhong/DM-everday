package com.yyh.ch08;

public class Loop
{
	public static void main(String[] args)
		{
		Loop loop =new Loop();
		loop.test6();
		}
		public void test6()
	   {
			for(int j=1;j<9;j++){
			for(int i=1;i<=j;i++)
				{
				String space ="  ";
				if(i*j<10)
					{
				    space="   ";
				}
				System.out.print(i+"*"+j+" = "+i*j+space);
			   }
			   System.out.println();
			}
		}
		public void test5()
			{int sum=0;
		   int i=1;
		for(i=1;i<=10;i++)
				{if(i%2!=0){
			continue;}
			sum+=i;}
			System.out.println("sum:"+sum+",i="+i);
				
		}
		public void test4()
			{
			int sum=0;
			int i=1;
			while(true)
				{
				sum+=i;
				i++;
				if(i==101)
					{
					break;
				}
			}
			System.out.println("while(true):sum:"+sum+",i"+i);
		}
		public void test3()
	   {
			int sum=0;
			int i=1;
			do{
				sum+=i;
				i++;
			}
			while(i<=100);
			System.out.println("do-while:sum:"+sum+",i="+i);
		}
		public void test2()
	    {
			int sum=0;
			int i=1;
			while (i<=100)
			{
				sum+=i;
				i++;
			}
			System.out.println("while:sum:"+sum+",i="+i);
		}
		public void test1()
			{
			int sum=0;
			int i=1;
		for ( i=1;i<=100 ;i++ )
		{
			sum+=i;
		}
			System.out.println("1~100µÄºÍ:"+sum+",i="+i);
	}
		
}