package sample04;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// クラスのインスタンス生成
		Dog dog = new Dog();
		Cat cat = new Cat();
		Lion lion = new Lion();
		
		// 動物を選択
		System.out.println("どの子を撫でますか？(1:犬 2:猫 3:獅子)");
		int a = sc.nextInt();
		
		switch(a)
		{
		case 1:
			// 犬の場合
			dog.sound();
			
			break;
			
		case 2:
			// 猫の場合
			cat.sound();
			
			break;
			
		case 3:
			// 獅子の場合
			lion.sound();
			
			break;
			
		default:
			System.out.println("半角数字を入力して下さい！");
			
			break;
		}

		// 手動で閉じる
		sc.close();
	
	}

}
