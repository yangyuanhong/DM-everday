package com.yyh.ch10;

public class Test
{
	public static void main(String[] args)
	{
		Test test=new Test();
		test.test2();
	}
	public void test2()
	{ 
		int arr[][]=new int [3][];
		arr[0]=new int[]{4,4,4};
		arr[1]=new int[]{3,3,3};
		arr[2]=new int[]{1,2,3};
       for(int i=0;i<arr.length;i++){
		   System.out.print("µÚ"+(i+1)+"¸öÎ¬¶È");
	   for(int j=0;j<arr[i].length;j++)
		   {
		   System.out.print(arr[i][j]+",");
	   }
	   System.out.println();
	}
	}
	public void test1()
	{
		int[] arr=new int[5];
		Student stu=new Student();

		Student[] stus=new Student[3];
		stus[0]=new Student();
		stus[1]=new Student();
		stus[2]=new Student(1001L,"tom",12);

        System.out.println(stu);
		System.out.println(arr);
		System.out.println(stus);
        System.out.println(stus[0].name);   
	}
}