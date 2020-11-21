import java.io.*;
class Test03_2
{
  public static void main(String[] args)throws IOException
  {
    System.out.print("整数を入力 ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    String str = br.readLine();
    int num = Integer.parseInt(str);
    
    System.out.println(num + " ÷ 3 = " + (num/3) + " あまり " + (num%3));
    System.out.println(num + " ÷ 3 = " + (num/(double)3));
  }
}