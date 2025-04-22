package sample01;
//import java.util.Arrays;
// import java.util.Collections.*;

public class ArrayReversal {
	public static void main(String... args) {
		// 配列arr1, arr2を作成
		Integer[] arr1 = new Integer[10];
		Integer[] arr2 = new Integer[10];
		
		// arr1に 1から9 の要素を代入する
		for(int i = 0; i < 10; i++)
		{
			arr1[i] = i;
		}
		
		for(int i = 0; i < arr1.length; i++)
		{
			arr2[i] = arr1[arr1.length - 1 - i];
		}
		
		/*
		別方法   要求と違う
		問題発生 参照型ので全配列が並び替える
		解決　　 廃棄コピー配列を使用
		
		// arr2に arr1 を代入する
		arr2 = arr1;
		
		// arr2 を降順で並び替える
		Arrays.sort(arr2, java.util.Collections.reverseOrder());
		*/
	
		/*
		// 出力確認
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		*/
	}
}
