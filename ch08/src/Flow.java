package com.yyh.ch08;

public class Flow
{
	public static void main(String[] args)
		{
		String arg =args[0];
		int num =Integer.parseInt(arg);
		Flow flow=new Flow();
		String week=flow.converse(num);
		System.out.println("������"+week);
	}
	public String converse(int num)
		{
		if(num==1){
			return "����һ";
		}else if (num==2)
		{
			return"���ڶ�";
		}else if (num==3)
		{
			return"������";
		}else if (num==4)
		{
			return"������";
		}else if (num==5)
		{
			return"������";
		}else if (num==6)
		{
			return"������";
		}else  
		{
			return"������";
		}
	}
}