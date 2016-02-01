package jp.ac.chibafjb.x15g031.kd144;

import java.util.Scanner;

public class kd144 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.println("住所の入力 -->");
		String s = sin.next();
		System.out.println("氏名の入力 -->");
		String t = sin.next();
		System.out.println("電話番号の入力 --> ");
		String f = sin.next();
		sin.close();
		System.out.print("＜確認＞住    所：");
		System.out.println(s);
		System.out.print("        氏    名：");
		System.out.println(t);
		System.out.print("        電話番号：");
		System.out.println(f);
	}

}
