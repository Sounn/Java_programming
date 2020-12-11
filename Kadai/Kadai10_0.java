class Score
{
  private int s1;
  private int s2;
  private int total;
  private double average;
  private static int n1=0, n2=0;
  private static double total_s1=0, total_s2=0;

  private Score(){
    s1=0;
    s2=0;
    total=0;
    average=0;
    n1++;
    System.out.printf("%4d つ目の点数を設定します。\n", n1);
  }

  public Score(int s1, int s2){
    this();
    if(checkScore(s1) == 0 && checkScore(s2) == 0){
      this.s1 = s1;
      this.s2 = s2;
      System.out.printf(" 科目１：%6d 点 科目２：%6d 点\n", s1, s2);
      n2++;
      total_s1 = total_s1 + s1 ;
      total_s2 = total_s2 + s2 ;
    }else{
      System.out.printf(" ***** エラー：点数は不適切なので点数を設定できません。 *****\n");
    }
  }

  public static double getAve_sn(int m){
    return ( m==1 ? total_s1/n2 : total_s2/n2 );
  }

  private int checkScore(int sn){
    if( sn >= 0 && sn <= 100) return 0; else return 1;
  }

  public int getTotal(){
    total = s1 + s2; return total;
  }
  public double getAverage(){
    average = (double)total / 2; return average;
  }
} 


class Kadai10_0
{
  public static void main(String[] args)
  {
  // Score subject1 = new Score();

  System.out.printf("\n");
  Score subject1 = new Score( 75, 82);
  System.out.printf(" 合計点：%6d 点\t", subject1.getTotal());
  System.out.printf(" 平均点：%6.2f 点\n", subject1.getAverage());

  System.out.printf("\n");
  Score subject2 = new Score( -75, 182);
  System.out.printf(" 合計点：%6d 点\t", subject2.getTotal());
  System.out.printf(" 平均点：%6.2f 点\n", subject2.getAverage());

  System.out.printf("\n");
  Score subject3 = new Score( 85, 98);
  System.out.printf(" 合計点：%6d 点\t", subject3.getTotal());
  System.out.printf(" 平均点：%6.2f 点\n", subject3.getAverage());

  System.out.printf("\n");
  Score subject4 = new Score( 75, 182);
  System.out.printf(" 合計点：%6d 点\t", subject4.getTotal());
  System.out.printf(" 平均点：%6.2f 点\n", subject4.getAverage());

  System.out.printf("\n");
  System.out.printf(" 科目１の平均点：%6.2f 点\n", Score.getAve_sn(1) );
  System.out.printf(" 科目２の平均点：%6.2f 点\n", Score.getAve_sn(2) );
  }
} 