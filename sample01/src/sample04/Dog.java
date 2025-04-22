package sample04;

public class Dog extends Animal {
	/**
	 * Dogクラスのインスタンスを初期化するコンストラクタ
	 * 
	 * @author 銭
	 * superでAnimalクラスのコンストラクタをする
	 * 動物の種類、鳴き声
	 */
	public Dog() {
		super("犬", "わーん");
	}
}
