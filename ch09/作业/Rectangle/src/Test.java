package com.yyh.ch09;

public class Test
{
	public static void main(String[] args)
		{
		/**float v=1.0f;
		Box box=new Box();
		v=box.voume(10.0F,20.0F,30.0F);
		System.out.println("���ӵ����:v="+v);*/
		Box1 box1=new Box1();
		box1.setA(4);
		box1.getVolume();
		box1.getArea();
		System.out.println(box1);
		Box1 box2=new Box1(5);
		System.out.println(box2);

	}

}