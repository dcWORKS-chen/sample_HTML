package sample03;

/**
 * 形状の共通操作のインターフェース
 * area は面積の計算
 * perimeter は周囲長の計算
 *
 * @author 銭
 */
public interface Shape {
	/**
	 * areaメソッド
	 * 形状の面積を計算した結果を返す
	 * 
	 * @author 銭
	 * @re 円形の面積
	 */
	double area();
	
	/**
	 * perimeterメソッド
	 * 形状の周囲長を計算した結果を返す
	 * 
	 * @author 銭
	 * @re 円形の周囲長
	 */
	double perimeter();

}
