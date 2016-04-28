package com.yyh.ch09;

public class Review
{
	public static void main(String[] args)
		{
		Review review=new Review();
		review.test1();
	}
	public void test1()
		{
		int x=4;
		Object result=(x>4)?"hello":9;
		System.out.println("value is:"+result);
	}
	public void test()
	{
		int x=4;
		double result=(x>4)?99.9:9;
		System.out.println("value is:"+result);

	}
}