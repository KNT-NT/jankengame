package jankenGame;

import java.util.HashMap;
import java.util.Map;

//勝敗を判定するクラス
public class Judge {

	Map<Integer, Integer> winPattern = new HashMap<>();
	{
		winPattern.put(0, 1); //グー(0)の時はチョキ(1)に勝つ
		winPattern.put(1, 2); //チョキ(1)のときはパー(2)に勝つ
		winPattern.put(2, 0); //パー(2)の時はグー(0)に勝つ
	}

	public int hantei(Hand player, Hand enemy) {
		if (player.state == enemy.state) {
			return 0;
		} else if (winPattern.get(player.state) == enemy.state) { //辞書のキーから取り出した値と相手の手の値が同じなら勝ち
			return 1;
		} else {
			return 2; //それ以外は負け
		}
	}
}
