package com.hw.ex;

import java.util.Scanner;

public class test1 {

	/**�ŷ�
	 * @param args
	 */
	public static void main(String[] args) {
		//char sex="��";
		//String name="�ŷ�";
		//int age;�Ե�
		int age=12;
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next(); 
		/*��int��*/ age = scanner.nextInt();
		char sex=scanner.next().charAt(0);
	    scanner.close();
	   	System.out.println("�ҽ�"+name+"��һ��"+age+"��"+sex+"��");
	} 
}
