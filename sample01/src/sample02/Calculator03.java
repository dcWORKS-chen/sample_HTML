package sample02;

import java.util.Scanner;

public class Calculator03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		// 使用したい計算方を入力する
		System.out.println("計算方法を選択して下さい(1:足し算 2:引き算 3:掛け算 4:割り算)：");
		int operation = sc.nextInt();
		
		// 入力の数字を保存する
		System.out.println("数字を２つ入力して下さい：");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// 計算結果を保存する変数
		int ans = 0;
		
		// operationで計算方法を決める
		switch(operation)
		{
		case 1:
			Addition addition = new Addition(num1, num2);
			// ansに addメソッドの結果を保存する			
			ans = addition.add();
			
			break;
			
		case 2:
			Subtraction subtraction = new Subtraction(num1, num2);
			// ansに subメソッドの結果を保存する			
			ans = subtraction.sub();
			
			break;
			
		case 3:
			Multiplication multiplication = new Multiplication(num1, num2);
			// ansに mulメソッドの結果を保存する			
			ans = multiplication.mul();
			
			break;
			
		case 4:
			Division division = new Division(num1, num2);
			// ansに addメソッドの結果を保存する			
			ans = division.div();
			
			break;
			
		default:
			System.out.println("半角数字を入力して下さい");
				
			break;
				
			
		}	
		
		// 計算結果を出力する
		System.out.println("答えは" + ans + "です");
		
		// 手動入力止め
		sc.close();
	}

	/**
	 * 足し算クラスです。
	 * @param num1 整数値
	 * @param num2 整数値
	 */
	private static class Addition{
		int num1, num2;
		
		/**
		 * Additionクラスのコンストラクタ
		 * @param a 整数値
		 * @param b 整数値
		 */
		Addition(int a, int b)
		{
			num1 = a;
			num2 = b;
		}
		/**
		 * addメソッド
		 * 足し算した結果を返す
		 * 
		 * @author 銭
		 * @return 足し算の結果
		 */
		private int add()
		{
			return num1 + num2;
		}
	}
	
	/**
	 * 引き算クラスです。
	 * @param num1 整数値
	 * @param num2 整数値
	 */
	private static class Subtraction{
		int num1, num2;
		
		/**
		 * Subtractionクラスのコンストラクタ
		 * @param a 整数値
		 * @param b 整数値
		 */
		Subtraction(int a, int b)
		{
			num1 = a;
			num2 = b;
		}
		
		/**
		 * subメソッド
		 * 引き算した結果を返す
		 * 
		 * @author 銭
		 * @return 引き算の結果
		 */
		private int sub()
		{
			return num1 - num2;
		}
	}
	
	/**
	 * 掛け算クラスです。
	 * @param num1 整数値
	 * @param num2 整数値
	 */
	private static class Multiplication{
		int num1, num2;
		
		/**
		 * Multiplicationクラスのコンストラクタ
		 * @param a 整数値
		 * @param b 整数値
		 */
		Multiplication(int a, int b)
		{
			num1 = a;
			num2 = b;
		}
		
		/**
		 * mulメソッド
		 * 掛け算した結果を返す
		 * 
		 * @author 銭
		 * @return 掛け算の結果
		 */
		private int mul()
		{
			return num1 * num2;
		}
	}
	
	/**
	 * 割り算クラスです。
	 * @param num1 整数値
	 * @param num2 整数値
	 */
	private static class Division{
		int num1, num2;
		
		/**
		 * Divisionクラスのコンストラクタ
		 * @param a 整数値
		 * @param b 整数値
		 */
		Division(int a, int b)
		{
			num1 = a;
			num2 = b;
		}
		
		/**
		 * divメソッド
		 * 割り算した結果を返す
		 * 
		 * @author 銭
		 * @return 割り算の結果
		 * @throws ArithmeticException 0の除算は不可
		 */
		private int div()
		{
			{
			    if (num2 == 0) {
			        throw new ArithmeticException("割り算不可な数字");
			    }
				return num1 / num2;
			}
		}
	}
}


