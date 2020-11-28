// 学籍番号:19H081，氏名:久井颯生，課題番号:課題2
class Score{
  int s1;
  int s2;
  int total;
  double average;

  void setScore(int s1,int s2){
    System.out.printf(" 科目1:%6d 点\t 科目2:%6d 点\n", s1, s2);
    this.s1 = s1;
    this.s2 = s2;
  }

  int getTotal(){
    return total = s1+s2;
  }

  double getAverage(){
    average = (double)total / 2;
    return average;
  }
}

class Kadai08_2 {
  public static void main(String[] args)
  {
    Score subject = new Score(); 
    subject.setScore(75,82);
    subject.getTotal();
    subject.getAverage();
    System.out.printf(" 合計点:%6d 点\t", subject.total);
    System.out.printf("平均点:%6.2f 点\n", subject.average);
  }
}
