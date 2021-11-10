// JavaBasic(07)

import java.util.Scanner;
import java.util.InputMismatchException;


// try文
// プログラムの処理を実行中にエラーが発生した場合にプログラムの流れを止めることなくエラー発生時の処理を指定できる。
public class Basic07 {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("xとyを加減乗除をします。");
    
    while (true) {
      // tryブロック
      // ブロック内の処理を実行中に例外が送出されるとcacth節にプログラムの流れが移動する
      try {
        System.out.print("xの値："); int x = inp.nextInt();
        System.out.print("yの値："); int y = inp.nextInt();

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

      // cacth節（例外ハンドラ）
      // cacthに続くカッコ内に補足する例外の型とその仮引数名の宣言。
      // 複数の例外を一個の引数に受け取るには例外の方を｜で結んで列挙
      } catch (InputMismatchException e) {
        System.out.println("入力エラー発生。" + e);
        String s = inp.next();
        System.out.println(s + "は無視しました。");

      } catch (ArithmeticException e) {
        System.out.println("算術エラー発生。" + e);
        System.out.println("エラーが出ないような数値を入力してください。");
        
      // finally節
      // tryブロックの例外の有無に関わらずtryブロックの処理終了後に必ず実行される処理
      } finally {
        System.out.println("-------------------");
        System.out.print("もう一度？（ 1:yes/0:no) :");
        int retry = inp.nextInt();
        if (retry == 0) break;
        System.out.println("-------------------");
      }
    }
  }
}
