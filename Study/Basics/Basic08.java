// JavaBasic(08)


// 例外処理（１）
// 例外処理の最上位クラスはThorowableでExceptionはそのサブクラス
// Exceptionではプログラムが回復を期待できるような例外を補足する。

import java.util.Scanner;
// 下記プログラムではわざと例外を発生されるメソッドを書いている
public class Basic08 {
  // thorows節
  // 検査例外を送出する可能性があるメソッドは、その全ての例外をthrows節で列挙しないといけない。
  // 列挙を省略するとコンパイル時エラー
  // 非検査例外にあたる内容は列挙せずともエラーにはならない
  static void check(int sw) throws Exception {
    // throw文
    // throw 式; で例外を送出する。
    // swの値に応じてExceptionあるいはRuntimeExceptionの例外を送出
    switch (sw) {
      case 1: throw new Exception("検査例外発生!!");
      case 2: throw new RuntimeException("非検査例外発生!!");
    }
  }

  // testメソッドはcheckメソッドを呼び出すためだけのメソッドだが、
  // checkの実行時にExceptionが送出される可能性があるのでthrows節の指定は必須。
  static void test(int sw) throws Exception {
    check(sw);
  }


  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("sw:");
    int sw = inp.nextInt();

    try {
      test(sw);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
