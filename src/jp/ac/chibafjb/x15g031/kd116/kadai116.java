package jp.ac.chibafjb.x15g031.kd116;

public class kadai116 {

		public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
			int j;//①
			for(j=0;j<2;j=j+1)  
			{
				String[] a = {"あいうえお","かきくけこ","さしすせそ"};//②
				int i;
				for(i=0;i<a.length;i=i+1)//この場合はlengthはaの箱の数
					//0が"あ～お"、1が"か～こ"、2が"さ～そ"で３
				{
					System.out.println(a[i]+"　"+a[i]+"　"+a[i]);//+がないと表示されない
				}
			}
		}

	}
	//for文は基本中から