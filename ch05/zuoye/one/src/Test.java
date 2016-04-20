package com.yyh.ch05;

public class Test
{
	public static void main(String[] args){
		School sc1=new School();
		
        sc1.setId(1001L);
		sc1.setName("江西理工大学");
		sc1.setName("江西南昌");
		System.out.println(sc1);
		School sc2=new School(1002L,"华东交大","江西南昌");
        System.out.println(sc2);
	}
}