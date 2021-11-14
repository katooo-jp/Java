// JavaBasic(12)


// 抽象クラス
// 継承時の子クラスのルール定義のようなイメージ
public class Basic12 {
  public static void main(String[] args) {
    Teacher takei = new Teacher("竹井一馬", "教員", "情報処理");
    Cook ohara = new Cook("大原太郎", "シェフ", "オムライス");

    takei.introduce();
    System.out.println();
    ohara.introduce();
  }
}


// 抽象クラスはabstractで定義
// 抽象メソッドの宣言ができることが違うだけで他はクラスと同じ
abstract class Person {
  public String name;
  public String job;

  Person(String name, String job) {
    this.name = name;
    this.job = job;
  }

  // 抽象メソッドは同じくabstractをつけて宣言
  // 抽象メソッドは継承された時、必ずオーバーライドをしないとコンパイル時にエラーになる
  // 今回のintroduceメソッドが子クラスで違う名前のメソッドになると統一性がなくなる
  // なので子クラスのルールを定義するイメージ
  abstract public void introduce();
}


// 抽象クラスも通常のクラス同様継承する
public class Cook extends Person {
  public String specialties;

  Cook(String name, String job, String specialties) {
    super(name, job);
    this.specialties = specialties;
  }

  @Override public void introduce() {
    System.out.println("氏名：" + this.name + "\n職種：" + this.job + "\n得意料理：" + this.specialties);
  }
}


public class Teacher extends Person {
  public String subject;

  Teacher(String name, String job, String subject) {
    super(name, job);
    this.subject = subject;
  }

  @Override public void introduce() {
    System.out.println("氏名：" + this.name + "\n職種：" + this.job + "\n担当科目：" + this.subject);
  }
}