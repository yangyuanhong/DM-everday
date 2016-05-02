package com.yyh.ch13;

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
public void deleteById(long id){
     int num=getIntdexById(id);
	 for(int i=num;i<index-1;i++)
	{
		 stus[i]=stus[i+1];
	 }
		 stus[--index]=null;
}
public void Update(Student student)
	{
	for(int i=0;i<index;i++)
		{
		if(student.getId()==stus[i].getId()){
          
			stus[i].setName(student.getName());
			stus[i].setAge(student.getAge());
		}
	}
}




















public void menu()
	{
	System.out.println("********ѧ����Ϣ����ϵͳ********");
    System.out.println("*1 ��ѯѧ����Ϣ");
	System.out.println("*2 ¼��ѧ����Ϣ");
    System.out.println("*3 ɾ��ѧ����Ϣ");
	System.out.println("*4 ͨ��id����ѧ����Ϣ");
	System.out.println("*5 �޸�ѧ����Ϣ");
	System.out.println("*exit �˳�ϵͳ!");
	System.out.println("*help ��ȡ����");
	System.out.println("********************************");

}




	public static void main(String[] args)
		{
		Sms sms=new Sms();
		sms.menu();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("*�������Ӧָ��");
		 String num=sc.nextLine();
		 switch(num)
			 {
			 case"1":
				 System.out.println("����������ѧ����Ϣ:");
			     Student[] stus=sms.queryAll();
				 for(Student stu: stus){
				 System.out.println(stu);
				 }
				 System.out.println("�ܹ���ѯ��"+sms.index+"��ѧ��");
				 break;
			 case"2":
				 while(true){
			        System.out.println("������ѧ����Ϣ��id*name*age����������break������һ��");
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
				 System.out.println("����ɹ�!");
				 }
 				 break;
			 case"3":
                 while(true){
			        System.out.println("������Ҫɾ����ѧ��id��������break������һ��");
		         String idstr=sc.nextLine();
				 if(idstr.equals("break"))
				 {
					 break;
				 }
				 long id =Long.parseLong(idstr);
				 Student stu=sms.queryById(id);
				 if(stu==null){
				     System.out.println("��Ҫɾ����ѧ����Ϣ������!");
					 continue;
				 }
				 sms.deleteById(id);
				 System.out.println("ɾ���ɹ�!");
			 }
				 break;
			 case"4":
                 while(true){
			        System.out.println("������Ҫ���ҵ�ѧ��id��������break������һ��");
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
				 while(true){
			        System.out.println("������Ҫ�޸ĵ�ѧ��id��������break������һ��");
		         String idstr=sc.nextLine();
				 if(idstr.equals("break"))
				 {
					 break;
				 }
				 long id =Long.parseLong(idstr);
				 Student stu=sms.queryById(id);
				 if(stu==null){
				     System.out.println("��Ҫ�޸ĵ�ѧ����Ϣ������!");
					 continue;
				 }
				 System.out.println("ԭ��ϢΪ:"+stu);
				 System.out.println("����������Ϣ��name#age��:");
				 String str=sc.nextLine();
				 String[] stuArr=str.split("#");
				 String name=stuArr[0];
				 int age =Integer.parseInt(stuArr[1]);
				 Student newstu=new Student(id,name,age);
				 sms.Update(newstu);
				 System.out.println("�޸ĳɹ�!");
			 }
				 break;
			 case"exit":
				 System.out.println("�ݰ�!��ӭ�´�ʹ��,");
				 System.exit(0);
			 default:
				 sms.menu();
                 break;

		 }
		}
	}
}