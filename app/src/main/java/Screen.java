import jp.ac.uryukyu.ie.e205726.*;
import java.util.Scanner;

public class Screen {

    void Start(){
    Scanner scanner = new Scanner(System.in);
    System.out.println(" ババ抜き\n[Start with Enter!]" );
    String Enter = scanner.nextLine();
    System.out.println("何名で開始しますか？" );
    String input_number = scanner.nextLine();
    System.out.println(input_number + "名で開始します。");

    }
}
