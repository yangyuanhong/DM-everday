package com.yyh.ch05;

public class Test
{
	public static void main(String[] args){
		Teacher te1=new Teacher();
		
        te1.setName("���");
		te1.setAge(28);
		te1.setId(1001L);
		System.out.println(te1);
		Teacher te2=new Teacher("����",25,1002L);
        System.out.println(te2);
	}
}