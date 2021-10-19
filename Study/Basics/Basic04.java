// JavaBasic(04)

import java.util.Arrays;

class Basic04 {
  public static void main (String[] args) {
    // 配列
    int [] a = new int[5];
    a[0] = 10;

    for (int i = 0; i < a.length; i++) {
      a[i] += i;
    }

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }

    // 配列の初期化と代入
    int [] b = {1,2,3,4,5};
    for (int i = 0; i < b.length; i++)
      System.out.print(b[i]);
      System.out.println();
    
    b = new int [] {10,11,12,13,14,15};      // bの書き換え
    
    // 配列の最大値を求める
    int max = 0;
    for (int i = 0; i < b.length; i++)
      if (b[i] > max) max = b[i];
    System.out.println(max);

    // 拡張for文
    // for (型 i : a)の形でフォー型アイinエーと読む
    // pythonの for i in list:の形と同じ
    // 下記文はbの配列を０から順にiに代入している
    for (int i : b)
      System.out.println(i);
    
    // 配列のコピーについて
    // 下記のようにcをdに上書きしてc[0]を変更してもd[0]も変更される
    // コピーされるのではなく参照先が変更されるだけ
    int [] c = {1,2,3,4,5};
    int [] d = {5,6,7,8,9,10,11};

    d = c;
    c[0] = 100;
    for (int i : c)
      System.out.print(i);
    System.out.println();
    for (int i : d)
      System.out.print(i);
    System.out.println();


    // 多次元配列
    int [][] e = { {1,2,3}, {4,5,6} };
    System.out.println(Arrays.deepToString(e));

    for (int[] i : e)
      for (int k : i)
        System.out.println(k);

  }
}
