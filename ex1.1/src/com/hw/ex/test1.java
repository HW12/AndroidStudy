package com.hw.ex;

import java.util.Scanner;

public class test1 {

	/**张飞
	 * @param args
	 */
	public static void main(String[] args) {
		//char sex="男";
		//String name="张飞";
		//int age;对的
		int age=12;
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next(); 
		/*（int）*/ age = scanner.nextInt();
		char sex=scanner.next().charAt(0);
	    scanner.close();
	   	System.out.println("我叫"+name+"是一个"+age+"的"+sex+"人");
	} 
}
