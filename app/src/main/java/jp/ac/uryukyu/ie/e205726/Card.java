package jp.ac.uryukyu.ie.e205726;
import java.util.Collection;

import javax.management.AttributeChangeNotificationFilter;

import java.util.ArrayList;

public class Card {
    private String[] mark = {"Sp", "He", "Cl", "Di","baba"};
    private String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
    ArrayList<ArrayList<String>> Deck = new ArrayList<ArrayList<String>>();

    public void Cards(){
        for (int i = 0; i<5; i++){
            for (int j = 0; j<13; j++){
                ArrayList card = new ArrayList<>();
                if (mark[i]== "baba"){
                    card.add(mark[i]);
                    card.add("baba");
                    Deck.add(card);
                    break;
                }
                card.add(mark[i]);
                card.add(number[j]);
                Deck.add(card);
            }
        }
        System.out.println(Deck);

    }
}
