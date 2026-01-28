package jankenGame;

public class Main {
	public static void main(String[] args) {
		int result = 0;
		Hand player = new Hand(); //自分の手を生成
		Hand enemy = new Hand(); //相手の手を生成
		Judge judge = new Judge(); //hanteiメソッドを使うために生成
		//Random rand = new Random();
		//int enemyhand;//敵の手を生成

		System.out.println("じゃんけんをします");
		System.out.println("じゃんけん..");

		do {
			System.out.println("0:グー、1:チョキ、2:パー"); //グーは0、チョキは1、パーは2として処理する
			player.setState(new java.util.Scanner(System.in).nextInt()) ;// = new java.util.Scanner(System.in).nextInt(); //出す手を数字で入力
			System.out.println("自分：" + player.printer()); //自分の出した手を表示する

			enemy.randomChoose(); //相手の手を決める
			System.out.println("相手:" + enemy.printer()); //敵の出した手を表示する。

			//Judgeクラスのhanteiメソッドからの返り値で勝敗を表示する
			result = judge.hantei(player, enemy);

			if (result == 0) {
				System.out.println("あいこ！");
				System.out.println("あいこで...");
			} else if (result == 1) {
				System.out.println("あなたの勝ちです");
			} else {
				System.out.println("あなたの負けです");
			}
		} while (result == 0); //あいこ(result=0)の間、じゃんけんを繰り返す。
		System.out.println("ゲーム終了です");

	}
}