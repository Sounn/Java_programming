// 学籍番号:19H7081，氏名:久井颯生，課題番号:課題2
class Student
{
  protected String number;
  protected String name;

  public Student(String num,String na){
    number = num;
    name = na;
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

class Kadai13_2{
  public static void main(String[] args){
    Score member = new Score("19H911","taro",70,80);
    System.out.println(member.toString());
  }
}