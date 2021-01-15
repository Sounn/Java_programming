abstract class Person
{
  protected String name;
  protected double height, weight;

  abstract void showData();
}

class Student extends Person
{
  private String number;

  public Student (String num, String nam, double ht, double wt)
  {
    number =num;
    name = nam;
    height = ht;
    weight = wt;
  }

  public void showData()
  {
    System.out.println("学籍番号:" + number + ", 名前" + name + ", 身長" + height + "cm  体重:" + weight + "kg");
  }
}

class Teacher extends Person
{
  private String affiliation;
  private String[] subjects = new String[3];

  public Teacher(String aff, String na, double ht, double wt, String[] subs)
  {
    affiliation = aff;
    name = na;
    height =ht;
    weight = wt;
    subjects = subs;
  }

  public void showData()
  {
    System.out.println("所属：" + affiliation + ", 名前" + name + ", 身長" + height + "cm  体重:" + weight + "kg");
    System.out.println("担当科目：" + subjects[0] + ", " +subjects[1] + ", " + subjects[2]);
  }
}

class Toi14_5
{
  public static void main(String args[])
  {
    Person[] members = new Person[2];

    members[0] = new Student("19H999", "taro", 185.7,82.6);
    String[] strs = {"数学","物理","英語"};
    members[1]  = new Teacher("産大", "Ichiro", 180.0, 75.0, strs);

    for(int i = 0; i<members.length;i++){
      members[i].showData();
      if(members[i] instanceof Student){
        System.out.println("Studentクラスです");
      }else{
        System.out.println("Studentクラスではありません");
      }
    }
  }
}