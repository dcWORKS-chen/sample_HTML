package sample03;


public class Rectangle implements Shape{
	private int width;
	private int height;
	
	/**
	 * Rectangleクラスのインスタンスを初期化するコンストラクタ
	 * 
	 * @author 銭
	 * @param w 長方形の長さ
	 * @param h 長方形の高さ
	 */
	public Rectangle(int w, int h)
	{
		this.width = w;
		this.height  = h;
	}
	
	/**
	 * areaメソッド
	 * 長方形の面積を計算した結果を返す
	 * 
	 * @author 銭
	 * @re 長方形の面積
	 */
	@Override
	public double area()
	{
		return width * height;
	}
	
	/**
	 * perimeterメソッド
	 * 長方形の周囲長を計算した結果を返す
	 * 
	 * @author 銭
	 * @re 長方形の周囲長
	 */
	@Override
	public double perimeter()
	{
		return (width + height) * 2;
	}

}
