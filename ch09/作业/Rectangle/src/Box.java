package com.yyh.ch09;

public class Box
{
 private float length;
 private float width;
 private float height;
 private float V;
 public Box()
	 {
     System.out.println("调用构造函数:");
	 this.length=length;
	 this.width=width;
	 this.height=height;
 }
 
 public  float voume(float length,float width,float height)
	 {
	 return length*width*height;
	 }

}