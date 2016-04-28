package com.briup.ch09;

import java.util.Scanner;
import java.util.Arrays;

public class Hero {
	public static void main(String[] args){
		System.out.println("*********前世今生*********");
		Scanner sc = new Scanner(System.in);
		Hero hero = new Hero();
		while(true){
			System.out.print("请输入今生的名字：");
			String name = sc.nextLine();
			//李春雨  ->  李世民  李白  李元霸 ...
			String firstName = name.substring(0,1);
			String lastName 
					= hero.getLastNameByFirstName(firstName);
			if(lastName != null){
				System.out.println("您前世为："+firstName+lastName);
			}else{
				System.out.println("sorry! 您前世未知...");
			}
		}
	}						
	private String[] firstNames = { "赵", "钱" ,"孙", "李" ,"周", "吴", "郑", "王",

                    "冯"," 陈"," 楮", "卫", "蒋", "沈", "韩"," 杨",

                    "朱"," 秦 ","尤"," 许"," 何"," 吕"," 施",

                   " 孔"," 曹", "严"," 华"," 金"," 魏 ","陶"," 姜",

                    "戚 ","谢 ","邹"," 喻"," 柏"," 水"," 窦"," 章",

                   " 云"," 苏"," 潘"," 葛"," 奚"," 范"," 彭"," 郎",

                    "鲁 ","韦"," 昌"," 马"," 苗 ","凤 ","花"," 方",		

                    "俞"," 任 ","袁"," 柳"," 酆"," 鲍"," 史"," 唐"

                    };
	private String[][] lastNames = {
		{"靖","德纲"},
		{"世民","白","元霸","逵","云龙"},
		{"安石","维","思聪"},
		{"三丰","无忌","翠山","仪"}
	};

	//通过姓获取对应的名
	public String getLastNameByFirstName(String firstName){
		String lastName = null;
		int index = getIndex(firstName);
		if(index >= 0){
			//获取到该姓所对应的名的数组
			String[] names = lastNames[index];
			//获取随机数
			int i = (int)(Math.random()*names.length);
			lastName = names[i];
		}
		return lastName;
	}
	//通过姓获取姓在姓数组中的位置
	public int getIndex(String firstName){
		int i;
		for(i=0;i<firstNames.length;i++){
			if(firstName.equals(firstNames[i])){
				break;
			}
		}
		return i>=firstNames.length?-1:i;
	}
}