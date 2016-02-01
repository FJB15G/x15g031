package jp.ac.chibafjb.x15g031.kd143;

import java.util.Scanner;

public class kd143 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner sin = new Scanner(System.in);
			System.out.println("住所の入力 -->");
			String s = sin.next();
			System.out.println("氏名の入力 -->");
			String m = sin.next();
			System.out.println("電話番号の入力 --> ");
			String sm = sin.next();
			sin.close();
			System.out.println(s);
			System.out.println(m);
			System.out.println(sm);
	}

}
