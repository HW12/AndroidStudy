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
		//System.out.println("������" + name);
		//System.out.println("���䣺"+ age);
		//System.out.println("�Ը�"+type);
		//System.out.println("�Ա�"+sex);
		System.out.println("�ҽ�" + name + "��һ��" + age + type + "��" + sex + "��");
		// feeling1();
		feeling("�Ҽ����������", "������������������");
		input();
		//System.out.println("������" + name);
		//System.out.println("���䣺"+ age);
		//System.out.println("�Ը�"+type);
		System.out.println("�ҽ�" + name + "��һ��"+ age +type+"��" + sex + "��");
		feeling("��ʧ���˰�", "���������ޡ�����");
	}

	private static void feeling(String cause, String content) {
		System.out.println(cause);
		System.out.println(content);
	}

	// private static void feeling2() {
	// System.out.println("��ʧ���˰�");
	// System.out.println("���������ޡ�����");
	// }

	static void input() {
		Scanner scanner = new Scanner(System.in);
		//InputStreamReader iReader=new InputStreamReader(System.in);
		//BufferedReader bReader=new BufferedReader(iReader);
		//bReader.readLine()
		System.out.print("������" );
		name = scanner.next();
		System.out.print("�Ը�");
		type = scanner.next();
		System.out.print("���䣺");
		age = scanner.nextInt();
		System.out.print("�Ա�");
		sex = scanner.next().charAt(0);
		//scanner.close();
		
	}

}
