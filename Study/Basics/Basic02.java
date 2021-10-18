// JavaBasic(02)

import java.util.Scanner;

public class Basic02 {
  public static void main(String[] args) {
    // if文
    // <=, >=, ==, !=, <, >, &&, ||
    int a = 100;
    int b = 200;

    if (a == b) {
      System.out.println("aはbと等しい");
    } else if (a < b) {
      System.out.println("aはbより小さい");
    } else {
      ; // ;のみは”空文”　何もしない
    }
    // {}は省略しても動く


    // 条件演算子
    // a ? b : c  aがTrueであればbを評価した値をFalseであればcを評価した値を生成。
    // 差を簡単に求めることができる
    // 下記パターンだとa > bはFalseなのでb - aが評価される。
    System.out.println(a > b ? a - b : b - a);


    // switch文
    switch (a) {
      case 0 : System.out.println("aは0です"); break;
      case 50 : System.out.println("aは50です"); break;
      case 100 : System.out.println("aは100です"); break; //　ここが表示される。
      default : System.out.println("aは0でも50でも100でもありません"); break;
    }

    Scanner inp = new Scanner(System.in);
    System.out.print("季節を求めます。何月にしますか？:");
    int month = inp.nextInt();

    String season = switch (month) {
      case 3,4,5 -> "春";
      case 6,7,8 -> "夏";
      case 9,10,11 -> "秋";
      case 12,1,2 -> "冬";
      default-> "不明";
    };
    System.out.println("季節は" + season + "です");
    inp.close();


    // do文
    // ループを実行した後に条件判定
    int c = 0;
    do {
      c++;
      System.out.println(c);
    } while (c < 10);


    // while文
    // ループを実行する前に条件判定
    c = 0;
    while (c < 10) {
      c++;
      System.out.println(c);
    }


    // 複合代入演算子
    // *=, /=, %=, -=, <<=, >>=, >>>=, &=　など


    // for文
    // 変数iの宣言はfor文のたびに宣言しないといけない。
    for (int i = 0; i < 10; i++)
      System.out.print("*");

    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        if (i * j < 10) {
          System.out.print("  ");
        } else {
          System.out.print(" ");
        }
        System.out.print(i * j);
      }
    System.out.println();
    }

    // 豆知識
    // ===ド・モルガンの法則===
    // 各条件の否定をとって、論理積と論理和を入れ替えた式の否定が、本の条件と同じになること。
    // x && y == !(!x || !y)
    // x || y == !(!x && !y)


  }
}
