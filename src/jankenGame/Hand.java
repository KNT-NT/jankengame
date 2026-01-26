package jankenGame;

import java.util.Random;

//手を表すクラス
public class Hand {
	int state; //手の状態を数字で管理する

	//ランダムな手を設定する
	public void randomChoose() {
		Random rand = new Random();
		this.state = rand.nextInt(3); //0,1,2のランダムな数字をstateに代入する
	}

	//数字と対応する手を表示するメソッド。数字から手を表示する
	public String printer() {
		if (this.state == 0) {
			return "グー";
		} else if (this.state == 1) {
			return "チョキ";
		} else {
			return "パー";
		}
	}
}
