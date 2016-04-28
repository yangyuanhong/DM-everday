package com.yyh.ch09;

public class Test
{
	public static void main(String[] ages)
		{
		Test test=new Test();
		test.test3();
	}
	public void test3()
		{
		int[] arr={3,2,1,5,6,4};
		  showArray(arr);
            for (int i = 1; i < arr.length; i++)
            {
                for (int j = 0; j < arr.length - i; j++)
                {
                    if (arr[j] > arr[j + 1])
                    {
                       int a = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = a;
                    }
                }
            }
		showArray(arr);
	}
	public void showArray(int[] arr)
	{
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}

	public void test2()
	{
		String[] arr;
		 arr=new String[]{"terry","larry"};
         System.out.println("数组的长度:"+arr.length);
		 for(int i=0;i<arr.length;i++){
			 System.out.print(arr[i]+",");
	}
	}
	public void test1()
	{
		Ages age=new Ages(11,22,11,23,65);
		System.out.println(age.age3);
	
	}
}