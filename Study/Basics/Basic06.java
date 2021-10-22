// JavaBasic(06)


// クラスについて
class Human {
  // フィールド
  private String name;
  private int age;
  private int height;
  private int weight;

  // コンストラクタ
  Human(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  // メソッド
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
    System.out.println(humans[1].getName() + "さんの体重は" + humans[1].getWeight() + "kgです。");
  }
}
