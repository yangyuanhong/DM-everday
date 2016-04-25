package com.yyh.ch08;

public class Flow
{
	public static void main(String[] args)
		{
		String arg =args[0];
		int num =Integer.parseInt(arg);
		Flow flow=new Flow();
		String week=flow.converse(num);
		System.out.println("今天是"+week);
	}
	public String converse(int num)
		{
		if(num==1){
			return "星期一";
		}else if (num==2)
		{
			return"星期二";
		}else if (num==3)
		{
			return"星期三";
		}else if (num==4)
		{
			return"星期四";
		}else if (num==5)
		{
			return"星期五";
		}else if (num==6)
		{
			return"星期六";
		}else  
		{
			return"星期日";
		}
	}
}