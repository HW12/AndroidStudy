package com.hw.ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test2 {
	static String name;
	static int age;
	static char sex;
	static String type;
	public static void main(String[] args) {
		input();
		//System.out.println("姓名：" + name);
		//System.out.println("年龄："+ age);
		//System.out.println("性格："+type);
		//System.out.println("性别："+sex);
		System.out.println("我叫" + name + "是一个" + age + type + "的" + sex + "人");
		// feeling1();
		feeling("我捡了五百万了", "哈哈哈哈哈哈。。。");
		input();
		//System.out.println("姓名：" + name);
		//System.out.println("年龄："+ age);
		//System.out.println("性格："+type);
		System.out.println("我叫" + name + "是一个"+ age +type+"的" + sex + "人");
		feeling("我失恋了啊", "呜呜呜呜无。。。");
	}

	private static void feeling(String cause, String content) {
		System.out.println(cause);
		System.out.println(content);
	}

	// private static void feeling2() {
	// System.out.println("我失恋了啊");
	// System.out.println("呜呜呜呜无。。。");
	// }

	static void input() {
		Scanner scanner = new Scanner(System.in);
		//InputStreamReader iReader=new InputStreamReader(System.in);
		//BufferedReader bReader=new BufferedReader(iReader);
		//bReader.readLine()
		System.out.print("姓名：" );
		name = scanner.next();
		System.out.print("性格：");
		type = scanner.next();
		System.out.print("年龄：");
		age = scanner.nextInt();
		System.out.print("性别：");
		sex = scanner.next().charAt(0);
		//scanner.close();
		
	}

}
