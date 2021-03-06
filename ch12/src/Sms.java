package com.yyh.ch12;

import java.util.Scanner;
public class Sms
{
	private Student[] stus=new Student[3];
	private int index;

public void save(Student student)
	{
	if(index>=stus.length)
		{
		Student[] dome=new Student[stus.length+3];
		System.arraycopy(stus,0,dome,0,index);
			stus=dome;
	}
	stus[index++]=student;
}
public Student[] queryAll()
	{   
	Student[] demo =new Student[index];
	System.arraycopy(stus,0,demo,0,index);
	return demo;
}
public Student queryById(long id){
    int num=getIntdexById(id);
	return num==-1?null:stus[num];

}
private int getIntdexById(long id)
	{
	int num=-1;
	for(int i=0;i<index;i++)
		if(stus[i].getId()==id)
		{
		num=i;
		break;
	}
	return num;
}
public int deleteById(long id){
     return 0;
}





















public void menu()
	{
	System.out.println("********学生信息管理系统********");
    System.out.println("*1 查询学生信息");
	System.out.println("*2 录入学生信息");
    System.out.println("*3 删除学生信息");
	System.out.println("*4 通过id查找学生信息");
	System.out.println("*5 修改学生信息");
	System.out.println("*exit 退出系统!");
	System.out.println("*help 获取帮助");
	System.out.println("********************************");

}




	public static void main(String[] args)
		{
		Sms sms=new Sms();
		sms.menu();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("*请输入对应指令");
		 String num=sc.nextLine();
		 switch(num)
			 {
			 case"1":
				 System.out.println("以下是所有学生信息:");
			     Student[] stus=sms.queryAll();
				 for(Student stu: stus){
				 System.out.println(stu);
				 }
				 System.out.println("总共查询到"+sms.index+"个学生");
				 break;
			 case"2":
				 while(true){
			        System.out.println("请输入学生信息【id*name*age】或者输入break返回上一层");
		         String stustr=sc.nextLine();
				 if(stustr.equals("break"))
				 {
					 break;
				 }
				 String[] stuArr=stustr.split("#");
                 long id=Long.parseLong(stuArr[0]);
				 String name=stuArr[1];
				 int age=Integer.parseInt(stuArr[2]);
				 Student stu=new Student(id,name,age);
				 sms.save(stu);
				 System.out.println("保存成功!");
				 }
 				 break;
			 case"3":
                 while(true){
			        System.out.println("请输入要删除的学生id或者输入break返回上一层");
		         String idstr=sc.nextLine();
				 if(idstr.equals("break"))
				 {
					 break;
				 }
				 long id =Long.parseLong(idstr);
				 int nums=sms.deleteById(id);
                 System.out.println(nums==0?"删除失败":"删除成功!当前学生个数:"+sms.index);
			 }
				 break;
			 case"4":
                 while(true){
			        System.out.println("请输入要查找的学生id或者输入break返回上一层");
		         String idstr=sc.nextLine();
				 if(idstr.equals("break"))
				 {
					 break;
				 }
				 long id =Long.parseLong(idstr);
				 Student stu=sms.queryById(id);
				 System.out.println(stu==null?"sorry!Not found":stu);
			 }
				  
				 break;
			 case"5":
				 break;
			 case"exit":
				 System.out.println("拜拜!欢迎下次使用,");
				 System.exit(0);
			 default:
				 sms.menu();
                 break;

		 }
		}
	}
}