class Score
{
  private int s1;
  private int s2;
  private int total;
  private double average;

  public void setScore(int s1, int s2)
  {
  if( checkScore(s1)==0 && checkScore(s2)==0 ){
  this.s1 = s1;
  this.s2 = s2;
  System.out.printf(" 科目１：%6d 点\t 科目２：%6d 点\n", s1, s2);
  }
  else{
  this.s1 = 0 ;
  this.s2 = 0 ;
  System.out.printf(" ***** エラー：点数は不適切なので初期化しました。 *****\n");
  }
  }
  private int checkScore(int sn)
  {
  if( sn>=0 && sn<100 ) return 0 ;
  else return 1 ;
  } 
  public int getTotal()
  {
  total = s1 + s2;
  return total;
  }
  public double getAverage()
  {
  average = (double)total / 2;
  return average;
  }
}

class Kadai09_0
{
  public static void main(String[] args)
  {
    Score subject = new Score();

    // subject.s1 = 75; //フィールドにアクセスできないのでコメントにする
    // subject.s2 = 82; //フィールドにアクセスできないのでコメントにする

    System.out.printf("\n");
    subject.setScore( 75, 82);
    System.out.printf(" 合計点：%6d 点\t", subject.getTotal());
    System.out.printf(" 平均点：%6.2f 点\n", subject.getAverage());

    System.out.printf("\n");
    subject.setScore( -75, 182);
    System.out.printf(" 合計点：%6d 点\t", subject.getTotal());
    System.out.printf(" 平均点：%6.2f 点\n", subject.getAverage());

    System.out.printf("\n");
    subject.setScore( -75, 82);
    System.out.printf(" 合計点：%6d 点\t", subject.getTotal());
    System.out.printf(" 平均点：%6.2f 点\n", subject.getAverage());

    System.out.printf("\n");
    subject.setScore( 75, 182);
    System.out.printf(" 合計点：%6d 点\t", subject.getTotal());
    System.out.printf(" 平均点：%6.2f 点\n", subject.getAverage());

  }
} 