package jp.ac.chibafjb.x15g031.kd151;

import java.util.Scanner;

import jp.ac.chibafjb.x15g031.kd144.kd144;

public class kd151 extends kd144 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.println("整数ａの入力  --> ");
		double a=sin.nextFloat();
		System.out.println("整数bの入力  --> ");
		double b=sin.nextFloat();
		sin.close();
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
	}

}
