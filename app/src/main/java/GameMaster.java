import jp.ac.uryukyu.ie.e205726.*;

public class GameMaster {
    Screen screen = new Screen();
    Card card = new Card();

    void GameMaster(){
        screen.Start();
        card.Cards();
    }
}
