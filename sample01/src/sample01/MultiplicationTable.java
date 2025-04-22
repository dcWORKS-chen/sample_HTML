package sample01;

public class MultiplicationTable {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1; i < 10; i++)
		{	// 改行用
			for(int j = 1; j < 10; j++)
			{	// 毎行の表示内容
				System.out.print(i * j + " ");				// i * j の結果出力
			}
			System.out.println();
		}

	}
}
