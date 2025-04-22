package sample02;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		// 使用したい計算方法を入力する
		System.out.println("計算方法を選択して下さい(1:足し算 2:引き算 3:掛け算 4:割り算)：");
		int operation = sc.nextInt();
		
		// 入力の数字を保存する
		System.out.println("数字を２つ入力して下さい：");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// operationで計算方法を決める
		switch(operation)
		{
		case 1:
			// sumメソッドの結果を出力する
			System.out.print("答えは" + sum(num1, num2) + "です");
			
			break;
			
		case 2:
			// subtractメソッドの結果を出力する
			System.out.print("答えは" + subtract(num1, num2) + "です");
			
			break;
			
		case 3:
			// multiplyメソッドの結果を出力する
			System.out.print("答えは" + multiply(num1, num2) + "です");
			
			break;
			
		case 4:
			// divideメソッドの結果を出力する
			System.out.print("答えは" + divide(num1, num2) + "です");
			
			break;
			
		default:
			// 例外処理
			System.out.println("半角数字を入力して下さい");
				
			break;
				
			
		}
		
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
	
	/**
	 * subtractメソッド
	 * ２つの引数を引き算した結果を返す
	 * 
	 * @author 銭
	 * @param num1 整数値
	 * @param num2 整数値
	 * @return 引き算の結果
	 */
	private static int subtract(int num1, int num2)
	{
		return num1 - num2;
	}
	
	/**
	 * multiplyメソッド
	 * ２つの引数を掛け算した結果を返す
	 * 
	 * @author 銭
	 * @param num1 整数値
	 * @param num2 整数値
	 * @return 掛け算の結果
	 */
	private static int multiply(int num1, int num2)
	{
		return num1 * num2;
	}
	
	/**
	 * divideメソッド
	 * ２つの引数を割り算した結果を返す
	 * 
	 * @author 銭
	 * @param num1 整数値
	 * @param num2 整数値
	 * @return 割り算の結果
	 */
	private static int divide(int num1, int num2)
	{
	    if (num2 == 0) {
	        throw new ArithmeticException("割り算不可な数字");
	    }
		return num1 / num2;
	}

}
