package sample01;

public class StringSwap {
	public static void main(String... args) {
		String str1 = "aaa";
		String str2 = "bbb";
		
		/*
		// 確認出力
		System.out.println(str1);
		System.out.println(str2);
		*/
		
		// 内容入れ替え
		String save = str1;				// 保存用
		str1 = str2;
		str2 = save;
		
		// 確認出力
		System.out.println(str1);
		System.out.println(str2);

	}

}
