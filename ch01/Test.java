package com.yyh.ch11;

import java.util.Scanner;
public class Test
{
	public static void main(String[] args)
	{ 
		Test test=new Test();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("\n请输入学生的名字:");
         String line=sc.nextLine();
			test.add(line);
         System.out.println("\n以下是所有学生:");
			test.showName();
		}

	}
	private String[] names=new String[3];
	private int num=0;
	public void add(String name){
	if(num>=names.length){
	 String[] des =new String[names.length+3];
	 System.arraycopy(names,0,des,0,names.length);
	 names=des;}
	 names[num++]=name;
	}
	public void showName()
		{
		for(int i=0;i<num;i++)
			{
			System.out.print(names[i]+",");
		}
	}
	public void test3()
	{
		int[] src=new int[]{2,3,5};
		int[] des=new int[src.length+3];

		System.arraycopy(src,0,des,0,src.length);
		showArry(src);
		showArry(des);
	}
	public void showArry(int[] arr)
	{
		for(int a:arr){
			System.out.print(a+",");}
			System.out.println();
	}
	public void test2()
	{
		String str="hello";
    	String 	str2=new String("hello");
		System.out.println(str.equals(str2));
		System.out.println(str==str2);

        String str3 ="1001#terry#12";
		String[] arr=str3.split("#");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}


	}
	public void test1()
	{
     Scanner sc =new Scanner(System.in);
	while(true){
	 String  line=sc.nextLine();
	 System.out.println("接收到:"+line);
	}
	}
}