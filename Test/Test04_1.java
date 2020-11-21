import java.io.*;
class Test04_1
{
  public static void main(String[] args)throws IOException
  {
    System.out.print("整数を入力 ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    String str = br.readLine();
    int res = Integer.parseInt(str);

    if(res%3 == 0) System.out.print("3 の倍数");
    else if(res%5 == 0) System.out.print("5 の倍数");
    else if(res%2 == 0) System.out.print("2 の倍数");
    else System.out.print("その他"); 
  }
}