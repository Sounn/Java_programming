// 学籍番号:19H7081，氏名:久井颯生，課題番号:課題3
class Student
{
  protected String number;
  protected String name;

  public Student(String num,String na){
    number = num;
    name = na;
  }

  public String toString(){
    String str ="学籍番号：" + number + ", 名前:" + name;
    return str;
  }
}

class Score extends Student
{
  private int math;
  private int english;

  public Score(String num,String na, int ma, int en){
    super(num,na);
    math = ma;
    english = en;
  }

  public String toString()
  {
    String str ="学籍番号：" +super.number+ ", 名前:" +super.name+ ", 数学:" +math+ ", 英語：" +english;
    return str;
  }
}

class Kadai13_3{
  public static void main(String[] args){
    Student[] members = new Student[3];
    members[0] = new Score("19H911","taro",70,80);
    members[1] = new Student("19H932","ichiro");
    members[2] = new Score("19H953","hanako",90,50);

    for(int i = 0; i < members.length; i++)
      System.out.println(members[i]);
  }
}