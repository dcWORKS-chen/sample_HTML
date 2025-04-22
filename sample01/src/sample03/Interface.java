package sample03;
import java.util.Scanner;

public class Interface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape shape = null;
		
		// 計算したい形状を入力する
		System.out.println("この形状は？(1:長方形 2:円形 3:正三角形)");
		int type = sc.nextInt();
		
		switch(type)
		{
		case 1:
			// 長方形の場合
			System.out.print("長方形の長さを入力して下さい：");
			int w = sc.nextInt();
			System.out.print("長方形の高さを入力して下さい：");
			int h = sc.nextInt();
			shape = new Rectangle(w, h);				// 長方形クラス生成

			
			break;
			
		case 2:
			// 円形の場合
			System.out.print("半径を入力して下さい：");
			int r = sc.nextInt();
			shape = new Circle(r);						// 円形クラス生成

			
			break;
			
		case 3:
			// 正三角形の場合
			System.out.print("正三角形の片方の辺の長さを入力して下さい：");
			int s = sc.nextInt();
			shape = new Triangle(s);				// 正三角形クラス生成

			
			break;
			
		default:
			System.out.print("指示の半角数字を入力して下さい！");
			
			break;
		}
		
		// 結果の出力
		System.out.println("面積は " + shape.area() + " です");
		System.out.println("周囲長は " + shape.perimeter() + " です");
		
		sc.close();

	}

}
