package com.yyh.ch05;

public class School
{
	private long id;
	private String name;
	private String address;
public School(){
	System.out.println("�����޲ι��캯��");
}
public School(long id,String name,String address){
	System.out.println("�����вι��캯��");
    this.id=id;
    this.name=name;
	this.address=address;
}
public void setId(long id){
	this.id=id;
}
public long getId(){
	return this.id;
}
public void setName(String name){
    this.name=name;
}
public String getName(){
	return this.name;
}
public void setAddress(String address){
    this.address=address;
}
public String getAddress(){
    return this.address;
}
 public  String toString(){
	 return "school[ id:"+this.id+",name:"+this.name+",address:"+this.address+"]";

 }
}






