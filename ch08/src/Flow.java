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
		String week=null;
		switch(num){
			case 1:{
				week="��һ";
				break;
			}
			case 2:{
				week="�ܶ�";
				break;
			}
				case 3:{
				week="����";
				break;
			}	
			   case 4:{
				week="����";
				break;
			}	
			    case 5:{
				week="����";
				break;
			}	
			    case 6:{
				week="����";
				break;
			}	
			default:{
				week="����";
				break;
			}
			}
            return week;
		}
}