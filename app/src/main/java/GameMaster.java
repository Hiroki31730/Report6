/*
 * ゲームの進行を担うクラス
 */
import jp.ac.uryukyu.ie.e205726.*;

public class GameMaster {
    /*
     * 別ディレクトリで記述した、screen.javaとCard.javaを実行する。
     */
    Screen screen = new Screen();
    Card card = new Card();

    void GameMaster(){
        screen.Start();
        card.Cards();
    }
}
