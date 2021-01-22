// 学籍番号:19H081，氏名:久井颯生，課題番号:課題6
import java.io.*;
class Kadai15_6
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("文字列を入力");
    String str1 = br.readLine();

    System.out.println("文字列を入力");
    String str2 = br.readLine();

    int pos = str1.lastIndexOf(str2);//str2と同じ部分の開始位置

    StringBuffer sb 
              = new StringBuffer(str1.substring(0,pos).toLowerCase());

    sb.append(str2.toUpperCase());

    System.out.println("\n"+sb);
  }
}