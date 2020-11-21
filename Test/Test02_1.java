import java.io.*;
class Test02_1
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("文字列を入力してください");
    String str1 = br.readLine();
    System.out.print("整数を入力してください");
    String str2 = br.readLine();
    int num1 = Integer.parseInt(str2);
    System.out.print("実数を入力してください");
    str2 = br.readLine();
    double num2 = Double.parseDouble(str2);

    System.out.print("入力した文字列は"+ str1);
    System.out.print(" 整数は"+ num1);
    System.out.println(" 実数は" + num2); 
  }
}