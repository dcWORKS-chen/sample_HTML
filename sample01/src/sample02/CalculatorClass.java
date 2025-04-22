package sample02;

import java.util.Scanner;

public class CalculatorClass {

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
			// ansに addメソッドの結果を保存する			
			ans = Addition.add(num1, num2);
			
			break;
			
		case 2:
			// ansに subメソッドの結果を保存する			
			ans = Subtraction.sub(num1, num2);
			
			break;
			
		case 3:
			// ansに mulメソッドの結果を保存する			
			ans = Multiplication.mul(num1, num2);
			
			break;
			
		case 4:
			// ansに divメソッドの結果を保存する			
			ans = Division.div(num1, num2);
			
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
	 */
	private static class Addition{
		/**
		 * addメソッド
		 * ２つの引数を足し算した結果を返す
		 * 
		 * @author 銭
		 * @param num1 整数値
		 * @param num2 整数値
		 * @return 足し算の結果
		 */
		private static int add(int num1, int num2)
		{
			return num1 + num2;
		}
	}
	
	/**
	 * 引き算クラスです。
	 */
	private class Subtraction{
		/**
		 * subメソッド
		 * ２つの引数を引き算した結果を返す
		 * 
		 * @author 銭
		 * @param num1 整数値
		 * @param num2 整数値
		 * @return 引き算の結果
		 */
		private static int sub(int num1, int num2)
		{
			return num1 - num2;
		}
	}
	
	/**
	 * 掛け算クラスです。
	 */
	private class Multiplication{
		/**
		 * mulメソッド
		 * ２つの引数を掛け算した結果を返す
		 * 
		 * @author 銭
		 * @param num1 整数値
		 * @param num2 整数値
		 * @return 掛け算の結果
		 */
		private static int mul(int num1, int num2)
		{
			return num1 * num2;
		}
	}
	
	/**
	 * 割り算クラスです。
	 */
	private class Division{
		/**
		 * divメソッド
		 * ２つの引数を割り算した結果を返す
		 * 
		 * @author 銭
		 * @param num1 整数値
		 * @param num2 整数値
		 * @return 割り算の結果
		 * @throws ArithmeticException 0の除算は不可
		 */
		private static int div(int num1, int num2)
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


