class Human
{
  protected double height, weight;
  protected String name;

  public Human()
  {
    name = "noname";
    height = 0;
    weight = 0;
  }

  public Human(String na,double ht, double wt)
  {
    name = na;
    height  = ht;
    weight = wt;
  }

  public void showData()
  {
    System.out.print("名前:" + name + ", 身長:" + height + "cm  体重:" + weight + "kg");
  }

  public String toString()
  {
    String str = "名前:" + name + ", 身長:" + height + "cm  体重:" + weight + "kg";
    return str;
  }
}


class Student extends Human
{
  private String number;
  private int s_year;

  public Student(String num, String name, double h, double w, int y)
  {
    super(name,h,w);
    number = num;
    s_year = y;
  }

  public void showData()
  {
    System.out.print("学籍番号:" + number + ", 名前" + name + ", 身長" + height + "cm  体重:" + weight + "kg 学年" + s_year + "年生");
  }
}

class Toi13_6
{
  public static void main(String[] args)
  {
    Human[] member = new Human[3];

    member[0] = new Human("Taro", 165.0,55.0);
    member[1] = new Student("19H789", "Jiro", 175.0,75.0,2);
    member[2] = member[0];

    for(int i = 0; i < member.length; i++){
      System.out.print("member[" + i + "]:");
      member[i].showData();
      System.out.println();
      System.out.println("member[" + i + "]:" + member[i].toString());
      System.out.println("member[" + i + "]のクラスは" + member[i].getClass());
      System.out.println();
    }

    System.out.println("member[0]とmember[2]が同じかどうか調べたところ" + member[0].equals(member[2]) +"でした。");
  }
}