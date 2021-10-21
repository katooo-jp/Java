// JavaBasic(05)

import java.util.Random;
import java.util.Scanner;

public class Basic05 {
  // メソッドについて
  // static 返却型 メソッド名(仮引数) {メソッドの処理内容}
  // 下記はmaxListというリストの最大値を返すメソッド
  static int maxList(int [] a) {
    int max = 0;
    for (int i = 0; i < a.length; i++)
      if (a[i] > max) max = a[i];
    return max;
  }

  // voidは返却する値がないメソッドにつける
  // 表示のみのメソッドなど
  static void star (int a) {
    for (int i = 0; i < a; i++)
      System.out.print('*');
    System.out.println();
  }

  static Scanner inp = new Scanner(System.in);
  static boolean retry (int num) {
    String message;
    switch (num) {
      case 0 : message = "ゲームを続けますか？"; break;
      default : message = "もう一度挑戦しますか？"; break;
    }
    System.out.print(message + " Yes(1) No(0):");
    int con = inp.nextInt();
    return con == 1;
  }


    // 可変個仮引数
    static int sum(int... no) {
      int sum = 0;
      for (int i : no)
        sum += i;
      return sum;
    }

  public static void main (String[] args) {
    // maxListメソッド
    int [] lis = {1,2,3,4,5};
    int result = maxList(lis);    //　配列を引数にしてメソッドの利用
    System.out.println(result);

    // starメソッド
    star(5);
    star(10);

    // retryメソッド
    Random rand = new Random();
    System.out.println("暗算ゲームスタート！！！");
    System.out.println("答えを半角数字で入力してね！");

    do {
      int x = rand.nextInt(100);
      int y = rand.nextInt(100);
      int z = rand.nextInt(100);

      while (true) {
        System.out.print(x + " + " + y + " + " + z + " = ");
        int ans = inp.nextInt();
        int a = x + y + z;

        if (ans == a) {
          System.out.println("正解です。おめでとう！");
          break;
        } else {
          System.out.println("不正解。頑張ろう！");
          if (!(retry(1))) {
            break;
          }
        }
      }
    } while (retry(0));

    // sumメソッド
    System.out.println(sum(1,2,3,4,5));
    System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
    
  }
}
