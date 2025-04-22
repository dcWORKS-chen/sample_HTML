package sample02;
import java.util.Scanner;

public class SumFunctionExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		// 入力の数字を保存する
		System.out.println("数字を２つ入力して下さい：");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// sumメソッドの結果を出力する
		System.out.println("答えは" + sum(num1, num2) + "です");
		
		// 手動入力止め
		sc.close();
	}
	
	/**
	 * sumメソッド
	 * ２つの引数を足し算した結果を返す
	 * 
	 * @author 銭
	 * @param num1 整数値
	 * @param num2 整数値
	 * @return 足し算の結果
	 */
	private static int sum(int num1, int num2)
	{
		return num1 + num2;
	}

}
