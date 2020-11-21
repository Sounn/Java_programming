// 学籍番号:19H081，氏名:久井颯生，課題番号:課題2
import java.io.*;
class Kadai04_2
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("整数を入力してください");
    String str = br.readLine();
    int num = Integer.parseInt(str);
    String ans = (num%2==0) ? "偶数" : "奇数";
    System.out.println("入力した値は"+ ans + "です");
  }
}