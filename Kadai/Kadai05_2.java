// 学籍番号:19H081，氏名:久井颯生，課題番号:課題2
import java.io.*;
class Kadai05_2
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("数字を当ててください(0から99まで)");
    String str = br.readLine();
    int m = Integer.parseInt(str);
    int a = (int)(Math.random()*100);

    int sum = 0;
    while( a != m ){
      sum++;
      if(a > m){
        System.out.println(m + "より大きいです");
      }else if(m > a){
        System.out.println(m + "より小さいです");
      }
      str = br.readLine();
      m = Integer.parseInt(str);
    }
    sum++;
    System.out.println(sum + "回目で正解しました！");
  }
}