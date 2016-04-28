package com.yyh.ch09;

public class Box1
{
	private int a;
    private int volume;
    private int area;
	public Box1()
		{
		System.out.println("调用无参构造函数");
		}
	public Box1(int a)
		{
		System.out.println("调用有参构造函数:");
		this.a=a;
		this.volume=a*a*a;
		this.area=a*a;
		}
		public void setA(int a)
			{
		this.a=a;
		}
	public int getA(){
			return this.a;
		}
	/**public void setVolume(int volume){
		this.volume=a*a*a;
		}*/
	public int getVolume(){
		    this.volume=a*a*a;
			return this.volume;
		}
    /**public void setArea(int area){
		this.area=a*a;
		}*/
	public int getArea(){
		    this.area=a*a;
			return this.area;
			}
		
public String toString(){
        return "box1[立方体边长a:"+this.a+",体积vloume:"+this.volume+",表面积area:"+this.area+"]";
   }
}