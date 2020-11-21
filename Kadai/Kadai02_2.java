// 学籍番号:19H081，氏名:久井颯生，課題番号:課題2
import java.io.*;
class Kadai02_2
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("お名前は?");
    String name = br.readLine();
    System.out.print(name + "さんの身長は何cm?");
    String str = br.readLine();
    double hei = Double.parseDouble(str);
    System.out.println(hei/100 + "mですね");
    System.out.print(name + "さんの体重は何kg?");
    str = br.readLine();
    double wei = Double.parseDouble(str);
    System.out.println(name + "さんのBMIは" + wei/hei*100/hei*100 + "です");
  }
}