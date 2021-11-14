import java.util.Scanner;

// JavaBasic(10)


// -----------------例外クラスの作成-----------------　//
// RuntimeExceptionで非検査例外を補足するクラスの作成
// RangeErrorクラスを元に　”範囲外の入力時”　と　”範囲外の計算結果時”　のエラーを補足するためのクラスを作成
class RangeError extends RuntimeException {
  RangeError(int n) { super("範囲外の値：" + n); }
}

class ParameterRangeError extends RangeError {
  ParameterRangeError(int n) { super(n); }
}

class ResultRangeError extends RangeError {
  ResultRangeError(int n) { super(n); }
}
// ------------------------------------------------ //


public class Basic10 {
  static boolean isValid(int n) {
    return n >= 0 && n <= 9;
  }

  // throws節は非検査例外のため省略
  static int add(int a, int b) {
    // それぞれの入力と計算結果が0〜９の値ではなければ上記で作成したエラーを投げる
    if (!isValid(a)) throw new ParameterRangeError(a);
    if (!isValid(b)) throw new ParameterRangeError(a);
    int result = a + b;
    if (!isValid(result)) throw new ResultRangeError(result);
    return result;
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    System.out.print("整数a:"); int a = inp.nextInt();
    System.out.print("整数b:"); int b = inp.nextInt();

    // 入力された値でaddメソッドを実行してエラーを補足したら
    // 最上位クラスのThrowableクラスのgetMessageメソッドとtoStringメソッドでエラー内容を表示している。
    try {
      System.out.println("それらの和は" + add(a,b) + "です。");
    } catch(ParameterRangeError e) {
      System.out.println("加える数が範囲外です。" + e.getMessage());
    } catch(ResultRangeError e) {
      // toStringは省略可能
      System.out.println("計算結果が範囲外です。" + e.toString());
    }
  }
}
