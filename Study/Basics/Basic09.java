// JavaBasic(09)


import java.io.*;
import java.util.Scanner;

// 例外処理（2）
// プログラム内容は実行時、初回と２回目で表示が異なり２回目以降は前回入力された値を表示する
public class Basic09 {

  // 前回の入力を読み込むメソッド
  // ＝＝＝＝流れ＝＝＝＝
  // １）BufferedReaderクラスのreadLineメソッドを使い前回の入力を読み込む
  // ２）読み込み時に初回のプログラム実行時はファイルが存在しないのでエラーが起きるため、IOExceptionで補足して処理
  // ３）例外発生した場合もファイルcloseの処理は実行しないといけないのでfinally節でクローズ処理
  // クローズ処理時に例外が発生する可能性もあるのでtry文中に例外処理をネストしている
  static void init() {
    BufferedReader br = null;

    try {
      br = new BufferedReader(new FileReader("Study/Basics/LastTime.txt"));
      String kibun = br.readLine();
      System.out.println("前回の気分は" + kibun + "でした。");
    } catch (IOException e) {
      System.out.println("このプログラムを実行するのは初めてですね。");
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          System.out.println(("ファイルクローズ失敗。"));
        }
      }
    }
  }

  // 入力された内容の書き込み
  // 書き込みはFileWriterクラスのwriteメソッドを使用
  static void term(String kibun) {
    FileWriter fw = null;
    try {
      fw = new FileWriter("Study/Basics/LastTime.txt");
      fw.write(kibun);
    } catch (IOException e) {
      System.out.println("エラー発生！！");
    } finally {
      if (fw != null) {
        try {
          fw.close();
        } catch(IOException e) {
          System.out.println("ファイルクローズ失敗。");
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    init();
    
    System.out.print("今の気分は：");
    String kibun = inp.next();

    term(kibun);
  }
}
