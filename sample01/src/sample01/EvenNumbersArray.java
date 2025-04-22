package sample01;

public class EvenNumbersArray {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 保存用配列 numList を作成
		int[] numList = new int[100];
		
		// numList に 1-100 を代入する
		for(int i = 1; i < 101; i++)
		{
			numList[i - 1] = i;
		}
		
		System.out.println("100以内の偶数は以下：");
		for(int i = 0; i < numList.length; i++)
		{			
			// 偶数のみ
			if(numList[i] % 2 == 0)
			{
				System.out.println(numList[i]);					// 要素を出力
			}
		}
		
		/*
		// 確認出力
		System.out.println(Arrays.toString(numList));
		*/
	}

}
