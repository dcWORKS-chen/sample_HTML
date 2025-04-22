package sample01;
import java.util.HashMap;

public class FruitMapExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// HashMap fruit を作成
		HashMap<Integer, String> fruit = new HashMap<>();
		
		// furit にキーと値を代入する
		fruit.put(1, "りんご");
		fruit.put(2, "いちご");		
		fruit.put(3, "みかん");
		fruit.put(4, "バナナ");		
		fruit.put(5, "メロン");
		
		for(int i = 1; i < fruit.size() + 1; i++)
		{
			System.out.println(i + " " + fruit.get(i));		// "キー 値"の形で出力
		}
		
		/*
		// 確認出力
		System.out.println(fruit);
		*/
		
	}

}
