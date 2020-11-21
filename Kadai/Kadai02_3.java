// 学籍番号:19H081，氏名:久井颯生，課題番号:課題3
import java.io.*;
class Kadai02_3
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("半径は?");
    String str = br.readLine();
    double r = Double.parseDouble(str);
    System.out.println("円周は" + 2*Math.PI*r);
    System.out.println("円の面積は" + Math.PI*r*r);
    System.out.println("球の体積は" + 4*Math.PI*r*r*r/3);
  }
}