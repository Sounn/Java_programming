// 学籍番号:19H7081，氏名:久井颯生，課題番号:課題1
class Student
{
  public String number;
  public String name;
}

class Score extends Student
{
  public int math;
  public int english;
}

class Kadai13_1{
  public static void main(String[] args){
    Score member = new Score();
    member.number = "19H911";
    member.name = "taro";
    member.math = 70;
    member.english = 80;
    System.out.println("学籍番号：" +member.number+ ", 名前:" +member.name+ ", 数学:" +member.math+ ", 英語：" +member.english);
  }
}