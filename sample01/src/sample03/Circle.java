package sample03;


public class Circle implements Shape{
	private int radius;
	
	/**
	 * Circleクラスのインスタンスを初期化するコンストラクタ
	 * 
	 * @author 銭
	 * @param r 円形の長さ
	 */
	public Circle(int r)
	{
		this.radius = r;
	}
	
	/**
	 * areaメソッド
	 * 円形の面積を計算した結果を返す
	 * 
	 * @author 銭
	 * @re 円形の面積
	 */
	@Override
	public double area()
	{
		return radius * radius * Math.PI;
	}
	
	/**
	 * perimeterメソッド
	 * 円形の周囲長を計算した結果を返す
	 * 
	 * @author 銭
	 * @re 円形の周囲長
	 */
	@Override
	public double perimeter()
	{
		return radius * Math.PI * 2;
	}

}
