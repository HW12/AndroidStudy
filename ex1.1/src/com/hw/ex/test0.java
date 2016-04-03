package com.hw.ex;

import java.awt.DefaultFocusTraversalPolicy;
import java.util.Scanner;

public class test0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入分数：");
		int score = scanner.nextInt();
		boolean ispass = (score >= 60 && score <= 80);
		System.out.println(ispass ? "及格" : "不及格");
		ispass = (score > 80 && score <= 100);
		System.out.println(ispass ? "优秀" : "不及格");

	}

}
