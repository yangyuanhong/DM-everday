package com.yyh.ch05;

public class Teacher
{
	private String name;
	private int age;
	private long id;
public Teacher (){
	}
public Teacher(String name,int age,long id){
	   this.name=name;
	   this.age=age;
	   this.id=id;
	}
	public void setName(String name){
	   this.name=name;

	}
	public String getName(){
	  return this.name;
	}
	public void setAge(int age){
	   this.age=age;
    }
	public int getAge(){
		return this.age;}
	public void setId(long id){
	    this.id=id;

	}
	public long getId(){
	    return this.id;
	}
public  String toString(){
	 return "teacher[ id:"+this.id+",name:"+this.name+",age,"+this.age+"]";

 }
	
}