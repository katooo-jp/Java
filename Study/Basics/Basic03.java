// JavaBasic(03)


class Basic03 {
  public static void main (String[] args) {
    // continue文
    int sum = 0;
    for (int i = 0; i <= 100; i++) {
      if (i % 2 == 0) {
        continue;     // 偶数の時はsum += i;を飛ばしてループの最初に戻る。
      }
      sum += i;
    }
    System.out.println(sum);


    // ラベル付きbreak文とcontinue文
    Outer:
      for (int i = 1; i <= 10; i++) {
        inner:
          for (int k = 1; k <= 10; k++) {
            if (i * k == 12) {
              break Outer;          // iとkの積が12の時にOuterの下にあるループを終わらせる
            } else if (i == 1) {
              break inner;          // i が1の時はinnerの下にあるループを終わらせる
            }
            System.out.println(i * k);
          }
      }
    
    
    // printfメソッド
    // 第一引数の”%3d”は%は書式開始で、3は桁数、dは10進数を表す
    for (int i = 1; i <= 9; i++) {
      for (int k = 1; k <= 9; k++)
        System.out.printf("%3d", i * k);
      System.out.println();
    }
    
    for (int i = 1; i <= 9; i++) {
      for (int k = 1; k <= 9; k++) {
        System.out.print(k + "×" + i + "=");
        System.out.printf("%3d", i * k);
        System.out.print(" ");
      }
      System.out.println();
    }


    // キャスト演算子
    // (型)式　の形で式の値を型に変換させる
    int a;
    // a = 2.0;   このままでは代入できない。
    a = (int) 2.0;


    // varでの型指定
    // 変数は型と名前を与えて宣言するのが原則だが、初期化子から明確になる文脈に限っては型の代わりにvarを使える
    var b = 1;        // bはint型
    var c = 2.0;      // cはdouble型
    var d = 5 == 5;   // dはboolean型 (値はTrue)
    var e = "12345";  // eはString型


    // 文字列リテラル
    System.out.println("ダブルコーテーションで囲まれた\"ABC\"は文字列です");
    // 表示は　ダブルコーテーションで囲まれた"ABC"は文字列です　になる

  }
}
