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
		String week=null;
		switch(num){
			case 1:{
				week="周一";
				break;
			}
			case 2:{
				week="周二";
				break;
			}
				case 3:{
				week="周三";
				break;
			}	
			   case 4:{
				week="周四";
				break;
			}	
			    case 5:{
				week="周五";
				break;
			}	
			    case 6:{
				week="周六";
				break;
			}	
			default:{
				week="周日";
				break;
			}
			}
            return week;
		}
}
