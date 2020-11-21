// 学籍番号:19H081，氏名:久井颯生，課題番号:課題2
import java.io.*;
class Kadai03_2
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("整数を１つ入力してください。");
    String str = br.readLine();
    int num = Integer.parseInt(str);
    System.out.print("16倍 " + (num<<4) + " 32倍 " + (num<<5) + "\n8で割ると " + (num >>3) + " あまり " + (num%8) + "\n");
  }
}