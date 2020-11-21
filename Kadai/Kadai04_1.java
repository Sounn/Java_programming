// 学籍番号:19H081，氏名:久井颯生，課題番号:課題1
import java.io.*;
class Kadai04_1
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("整数を2つ入力してください");
    String str = br.readLine();
    int num1 = Integer.parseInt(str);
    str = br.readLine();
    int num2 = Integer.parseInt(str);
    int abs = Math.abs(num1)+Math.abs(num2);
    if(num1 > num2){
      System.out.println(num1 + " > " + num2 + " 差は " + abs);
    }else if(num1 < num2){
      System.out.println(num1 + " < " + num2 + " 差は " + abs);
    }else{
      System.out.println(num1 + " = " + num2 + " 差はありません");
    }
  }
}