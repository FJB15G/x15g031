package jp.ac.chibafjb.x15g031.kd141;

import java.util.Scanner;

public class kd141 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
				Scanner sin = new Scanner(System.in); //sinでなくてもいい
				System.out.print("整数を１つ入力してください。  -->");
				int num = sin.nextInt();//numでなくてもよい 
				sin.close();
				System.out.println("あなたの入力した数は"+num+"です");
	}

}
