import java.io.*;
class Test04_2
{
  public static void main(String[] args)throws IOException
  {
    System.out.print("アルファベットを１つ入力");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    String str = br.readLine();
    char c = str.charAt(0);

    System.out.println(c + "の文字コードは？");
    str = br.readLine();
    int num = Integer.parseInt(str);

    String ans = (c == num) ? "正解です" : "不正解です";
    System.out.println(ans);
    System.out.println(c + "の文字コードは " + (int)c ); 
  }
}