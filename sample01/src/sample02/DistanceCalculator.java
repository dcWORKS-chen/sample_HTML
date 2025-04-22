package sample02;
import java.util.Scanner;

public class DistanceCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;			// 座標の仮保存先
		
		// 入力の数字を座標としてPointを生成する
		System.out.print("座標Aのx座標を入力して下さい：");
		x = sc.nextInt();
		System.out.print("座標Aのy座標を入力して下さい：");
		y = sc.nextInt();
		Point pointA = new Point(x, y);
		System.out.print("座標Bのx座標を入力して下さい：");
		x = sc.nextInt();
		System.out.print("座標Bのy座標を入力して下さい：");
		y = sc.nextInt();
		Point pointB = new Point(x, y);
		
		// GetDistanceメソッドを使用して距離を計算する、結果をdistanceで保存
		double distance = Point.GetDistance(pointA, pointB);
		
		// 結果distanceを出力する
		System.out.print("２つのポイントの距離は ");
		System.out.println(distance);
		
		// 手動入力止め
		sc.close();

	}
	
}
	
class Point {
	int x, y;
	
	/**
	 * Pointクラスのインスタンスを初期化するコンストラクタ
	 * 
	 * @author 銭
	 * @param x ポイントのx座標
	 * @param y ポイントのy座標
	 */
	public Point(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	/**
	 * GetDistanceメソッド
	 * ２つのポイントの距離を計算した結果を返す
	 * 
	 * @author 銭
	 * @param a Point(x, y) ポイントの座標
	 * @param b Point(x, y) ポイントの座標
	 * @re ２つのポイントの距離
	 */
	public static double GetDistance(Point a, Point b){
		return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
	}
}

