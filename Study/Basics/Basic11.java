// JavaBasic(11)



// クラスの継承
// 今回はBookクラスをPaperBookクラスとEBookクラスに継承してそれぞれのクラスに
// メソッドをオーバーライドして新しいメソッドを作っている

// 継承元になるBookクラスは”親クラス”という。継承先になるPaperBookやEBookは”子クラス”という。
public class Basic11 {
  public static void main(String[] args) {
    PaperBook a = new PaperBook("吾輩は猫である", "夏目漱石", 850, 245);
    PaperBook b = new PaperBook("ノルウェイの森", "夏目漱石", 850, 245);
    EBook c = new EBook("Python入門", "Python.org", 2400, 9824);
    EBook d = new EBook("Web技術の仕組み", "www.org", 4530, 12458);

    a.dispInfo();
    b.dispInfo();
    c.dispInfo();
    d.dispInfo();

    System.out.println("与えた識別番号 = " + Book.getCounter() + "個");
  }
}

class Book{
  static int counter = 0;
  private String title;
  private String auther;
  private int price;
  private int id;

  // インスタンス初期化子とクラス初期化子
  // static{}でクラス初期化し、staticをなしでインスタンス初期化子
  // クラス初期化子はクラスが何らかの形で呼び出された時に
  // インスタンス初期化子はインスタンスが生成される時に処理が先に行われる
  {
    this.id = ++counter;
  }

  Book(String title, String auther, int price) {
    this.title = title;
    this.auther = auther;
    this.price = price;
  }

  public static int getCounter() {
    return counter;
  }

  public void dispInfo() {
    System.out.println("書名：" + this.title);
    System.out.println("著者名：" + this.auther);
    System.out.println("価格：" + this.price + "円");
    System.out.println("識別番号：" + this.id);
  }
}


// Bookクラスを継承してPaperBookクラスとEBookクラスを作成
// クラス名の後にextends 継承したいクラス名　で継承できる
// 継承される内容は
// ・フィールド
// ・メソッド
// ・クラス
// ・インターフェース
// ※上記二つは親クラス内で宣言されたクラスやインターフェースを指す

// 継承されない内容は再定義が必要
class PaperBook extends Book {
  // Bookクラスにないフィールドの定義
  private int page;

  // コンストラクタの再定義
  PaperBook(String title, String auther, int price, int page) {
    // 親クラスのコンストラクタの内容をsuper()で呼び出せる
    super(title, auther, price);
    this.page = page;
  }

  // メソッドのオーバーライド
  // 親クラスのメソッドを宣言せずともそのまま使えるがこの宣言をすると
  // 同じメソッド名でも子クラスに新たなメソッドの内容を定義できる
  @Override public void dispInfo() {
    // super.メソッド名　で親クラスのメソッドの内容を呼び出し可能
    super.dispInfo();

    // 子クラスで再定義されたメソッド処理
    // 上のsuper.dispInfo()がなければ子クラスのインスタンスで実行されたdispInfoメソッドの内容は下記だけになる
    // つまりオーバーライドはメソッドの内容の上書き
    System.out.println("ページ数：" + this.page + "ページ" + "\n");
  }
}



class EBook extends Book {
  private int fileSize;

  EBook(String title, String auther, int price, int fileSize) {
    super(title, auther, price);
    this.fileSize = fileSize;
  }

  @Override public void dispInfo() {
    super.dispInfo();
    System.out.println("ファイルサイズ：" + this.fileSize + "KB" + "\n");
  }
}