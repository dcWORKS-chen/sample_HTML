package sample04;

public class Cat extends Animal{
	/**
	 * Catクラスのインスタンスを初期化するコンストラクタ
	 * 
	 * @author 銭
	 * superでAnimalクラスのコンストラクタをする
	 * 動物の種類、鳴き声
	 */
	public Cat() {
		super("猫", "にゃーん");
	}
}
