class Score
{
  private int s1;
  private int s2;
  private int s3;
  private int total;
  private double average;

  public void setScore(int s1, int s2){
    if( checkScore(s1)==0 && checkScore(s2)==0 ){
      this.s1 = s1;
      this.s2 = s2;
      System.out.printf(" 科目１：%6d 点\t 科目２：%6d 点\n", s1, s2);
    }else{
      this.s1 = 0 ;
      this.s2 = 0 ;
      System.out.printf(" ***** エラー：点数は不適切なので初期化しました。 *****\n");
    }
  }

  public void setScore(int s1, int s2, int s3){
    if( checkScore(s1)==0 && checkScore(s2)==0 && checkScore(s3)==0 ){
      this.s1 = s1;
      this.s2 = s2;
      this.s3 = s3;
      System.out.printf(" 科目１：%6d 点\t 科目２：%6d 点\t 科目３：%6d 点\n", s1, s2, s3);
    }else{
      this.s1 = 0 ;
      this.s2 = 0 ;
      System.out.printf(" ***** エラー：点数は不適切なので初期化しました。 *****\n");
    }
  }

  private int checkScore(int sn){
    if( sn>=0 && sn<100 ) return 0 ;
    else return 1 ;
  } 

  public int getTotal(int s){
    switch (s) {
      case 2:total = s1 + s2;break;
      case 3:total = s1 + s2 +s3;break;
    }
    return total;
  }

  public double getAverage(int s){
    switch (s) {
      case 2:average = (double)total / 2;break;
      case 3:average = (double)total / 3;break;
    }
    return average;
  }
}

class Kadai09_1
{
  public static void main(String[] args){
    Score subject = new Score(); int n;
    System.out.printf("\n");
    subject.setScore( 75, 82); n=2;
    System.out.printf(" 合計点:%6d 点\t", subject.getTotal(n)); System.out.printf(" 平均点:%6.2f 点\n", subject.getAverage(n));
    System.out.printf("\n");
    subject.setScore( -75, 182); n=2;
    System.out.printf(" 合計点:%6d 点\t", subject.getTotal(n)); System.out.printf(" 平均点:%6.2f 点\n", subject.getAverage(n));
    System.out.printf("\n");
    subject.setScore( -75, 82, 87); n=3;
    System.out.printf(" 合計点:%6d 点\t", subject.getTotal(n)); System.out.printf(" 平均点:%6.2f 点\n", subject.getAverage(n));
    System.out.printf("\n");
    subject.setScore( 75, 82, 87); n=3;
    System.out.printf(" 合計点:%6d 点\t", subject.getTotal(n)); System.out.printf(" 平均点:%6.2f 点\n", subject.getAverage(n));
  }
} 