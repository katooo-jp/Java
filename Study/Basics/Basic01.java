// JavaBasic(01)

import java.util.Scanner;
import java.util.Random;

class Basic01 {
  public static void main(String[] args) {
    // 表示
    System.out.println("はじめてのJavaプログラム。");
    System.out.print("画面に出力しています。"); // lnなしだと行末に改行をしない
    System.out.println("この文章は改行されない");

    System.out.println();
    System.out.println("こんにちは" + "元気ですか？");
    System.out.println("こんにちは\n元気ですか？"); // \nで改行される

    // 演算
    System.out.println();
    System.out.println("100 + 60 = " + (100 + 60));

    // 変数
    System.out.println();
    int x;
    int y;

    x = 10;
    y = 20;

    System.out.println(x * y);
    System.out.println();

    int a, b = 10;
    int c = 11, d = 12;
    a = 1;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);

    // キーボードから入力した値を変数に
    // Scannerはimportは行頭にが必要
    System.out.println();
    Scanner stdIn = new Scanner(System.in);
    System.out.print("xの値：");
    int aa = stdIn.nextInt();

    System.out.print("yの値：");
    int bb = stdIn.nextInt();

    System.out.println(aa + bb);

    System.out.println("名前を入力してください:");
    String name = stdIn.next();
    System.out.println(name + "さん");

    System.out.print("plase name:");
    name = stdIn.next();
    System.out.println("名前が変わって" + name + "さんになりました。");
    stdIn.close();

    // final変数とconstant変数
    // finalは書き換えできない。書き換えようとするとエラーに。変数名を大文字のみにして分別
    // constantは基本型とString型のfinal変数に限り、constant変数と呼ばれる

    System.out.println();
    final double PI = 3.1416;
    System.out.println("円周率は" + PI + "です。");

    // 乱数の生成
    // Randomも行頭でjava.utilからimportが必要
    Random rand = new Random();

    int num = rand.nextInt(10); // 0から9までの整数生成
    System.out.println("0から9までの整数は:" + num);
    // int a = 1 + rand.nextInt(9); // 1〜9の乱数
    // int b = -1 + rand.nextInt(9); // -1〜-9の乱数
  }
}