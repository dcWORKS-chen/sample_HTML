package sample03;


public class Triangle implements Shape{
	private int side;
	private double height;
	
	/**
	 * Triangleクラスのインスタンスを初期化するコンストラクタ
	 * 
	 * @author 銭
	 * @param s 正三角形の長さ
	 */
	public Triangle(int s)
	{
		this.side = s;
		this.height = Math.sqrt(3) / 2 * s;
	}
	
	/**
	 * areaメソッド
	 * 正三角形の面積を計算した結果を返す
	 * 
	 * @author 銭
	 * @re 正三角形の面積
	 */
	@Override
	public double area()
	{
		return (side * height) / 2;
	}
	
	/**
	 * perimeterメソッド
	 * 正三角形の周囲長を計算した結果を返す
	 * 
	 * @author 銭
	 * @re 正三角形の周囲長
	 */
	@Override
	public double perimeter()
	{
		return side * 3;
	}

}
