package jp.ac.uryukyu.ie.e205726;
import java.util.Collection;
import java.util.ArrayList;

public class Card {
    public String[] mark = {"Sp", "He", "Cl", "Di"};
    public String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
    ArrayList<String> Deck = new ArrayList<>();

    void Cards(){
        for (int i = 0; i<4; i++){
            for (int j = 0; j<13; j++){
                Deck.add(mark[i]+number[j]);
            }
        }
        System.out.println(Deck);
    }
}
