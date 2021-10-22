// JavaBasic(06)


// クラスについて
class Human {
  // フィールド
  private String name;
  private int age;
  private int height;
  private int weight;
  private int myNumber;
  // static付きのフィールドは宣言されたクラスの全インスタンスで共有されるクラス変数となる
  // カウンターなどに使うと便利
  private static int counter = 0;

  // コンストラクタ
  Human(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.myNumber = ++counter;
  }

  // インスタンスメソッド　staticなしでインスタンスに対して起動できるメソッド。
  // static付きであればクラスメソッドとなりインスタンスに関係なく使える
  // アクセッサ　ゲッタとセッタ

  // ゲッタ　フィールドの値を取得するメソッド
  String getName() {
    return this.name;
  }

  int getAge() {
    return this.age;
  }

  int getHeight() {
    return this.height;
  }

  int getWeight() {
    return this.weight;
  }

  int getMyNumber() {
    return this.myNumber;
  }

  // セッタ　フィールドに値をセットするメソッド
  void setAge(int age) {
    this.age = age;
  }

  void setHeight(int height) {
    this.height = height;
  }

  void setWeight(int weight) {
    this.weight = weight;
  }

}


public class Basic06 {
  public static void main (String[] args) {
    // 配列にインスタンスを作っても使える
    Human [] humans = {
      new Human("たかし", 15, 160, 45), // Humanクラスのインスタンス
      new Human("カイカイ", 23, 180, 60) // Humanクラスのインスタンス
    };
    // メソッドの使い方
    System.out.println(humans[0].getName() + "さんの体重は" + humans[0].getWeight() + "kgです。");
    System.out.println(humans[0].getName() + "さんのマイナンバーは" + humans[0].getMyNumber() + "です。");

    System.out.println(humans[1].getName() + "さんの体重は" + humans[1].getWeight() + "kgです。");
    System.out.println(humans[1].getName() + "さんのマイナンバーは" + humans[1].getMyNumber() + "です。");

    humans[1].setWeight(70);
    System.out.println(humans[1].getName() + "さんの体重は変わって" + humans[1].getWeight() + "kgになりました。");
  }
}
