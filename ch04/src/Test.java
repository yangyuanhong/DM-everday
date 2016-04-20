package com.yyh.ch04;

public class Test{
	public static void main(String[] args){
		test3();
	}
	public static void test3(){
		float f1=19.1f;
		float f2=20.0f;
		System.out.println(f2-f1);
	
	}
	public static void test1(){
		for(int i=1;i<=9;i++)
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+" = "+i*j+" ");
                
			    }
                 System.out.println();
			}
	public static void test2(){
		char c1=6;
		char c2='6';
		char c3=65;
		char c6=0101;
		char c7=0x41;
		char c8=0b1000001;
		System.out.println(c3);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		
            }
			}