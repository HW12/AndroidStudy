package com.hw.ex;

import java.awt.DefaultFocusTraversalPolicy;
import java.util.Scanner;

public class test0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("�����������");
		int score = scanner.nextInt();
		boolean ispass = (score >= 60 && score <= 80);
		System.out.println(ispass ? "����" : "������");
		ispass = (score > 80 && score <= 100);
		System.out.println(ispass ? "����" : "������");

	}

}
