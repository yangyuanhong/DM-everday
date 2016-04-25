package com.yyh.ch07;

public class variables 
{
	public char a;
	public static int b;
	public void aa()
		{
	System.out.println("--aa--");
	}
	public static void bb()
		{
     System.out.println("--bb--");
	}
	public static void main(String[] args)
		{
		variables vas =new variables();
		vas.aa();
		bb();
       System.out.println("|"+vas.a+"|");
	}
}