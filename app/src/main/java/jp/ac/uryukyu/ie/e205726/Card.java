package jp.ac.uryukyu.ie.e205726;
import java.util.Collections;

import javax.management.AttributeChangeNotificationFilter;

import java.util.ArrayList;
/**
 * トランプの山札を用意し、配布する。
 * トランプの配列を用意し、山札をシャッフル状態にした。
 */


public class Card {
    /**
    * markでトランプのマークを配列宣言
    * numberはトランプの番号(1~13まで)
    * 多重配列である、Deck(山札)、Player1(プレイヤー)、Player2(プレイヤー2)を宣言(とりあえず二人でプレイ出来るようにする。)
    */
    private String[] mark = {"Sp", "He", "Cl", "Di","baba"};   
    private String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};  
    ArrayList<ArrayList<String>> Deck = new ArrayList<ArrayList<String>>();  
    ArrayList<ArrayList<String>> Player1 = new ArrayList<ArrayList<String>>(); 
    ArrayList<ArrayList<String>> Player2 = new ArrayList<ArrayList<String>>(); 

    public void Cards(){
        /**
 　　　　* 山札の用意
 　　　　* マークの回数分と番号の回数分forで回す。
 　　　　*/
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
        /*
         * 用意した山札をシャッフル
         */
        Collections.shuffle(Deck);
        System.out.println(Deck);

        
    }
}
