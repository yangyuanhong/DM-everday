package com.yyh.ch05;

public class Test
{
	public static void main(String[] args){
		School sc1=new School();
		
        sc1.setId(1001L);
		sc1.setName("��������ѧ");
		sc1.setName("�����ϲ�");
		System.out.println(sc1);
		School sc2=new School(1002L,"��������","�����ϲ�");
        System.out.println(sc2);
	}
}