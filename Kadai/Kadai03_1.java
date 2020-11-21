// 学籍番号:19H081，氏名:久井颯生，課題番号:課題1
import java.io.*;
class Kadai03_1
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("１辺の長さは?");
    String str = br.readLine();
    int num = Integer.parseInt(str);
    System.out.println("表面積 " + (2*Math.sqrt(3)*num*num) + " 体積 " + (Math.sqrt(2)*num*num*num/3));
  }
}