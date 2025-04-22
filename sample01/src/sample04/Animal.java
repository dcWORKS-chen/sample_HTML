package sample04;

public class Animal {
	private String type;				// 動物の種類
	private String cry;					// 鳴き声
	
	/**
	 * Animalクラスのインスタンスを初期化するコンストラクタ
	 * 
	 * @author 銭
	 * @param type 動物の種類
	 * @param cry 鳴き声
	 */
	public Animal(String type, String cry) {
		this.type = type;
		this.cry = cry;
	}
	
	/**
	 * soundメソッド
	 * 動物を鳴く文字を出力する
	 * 
	 * @author 銭
	 */
	void sound() {
		System.out.println(type + "が" + cry + "で鳴いています");
	}

}
