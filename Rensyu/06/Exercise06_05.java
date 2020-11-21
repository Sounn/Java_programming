// 学籍番号:19H081，氏名:久井颯生，Exercise番号:練習5
import java.io.*;

class Exercise06_05
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("2以上の整数を入力してください。");

      BufferedReader br =
       new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int num = Integer.parseInt(str);

       for(int i=2; i<=num; i++){
          if(i == num){
             System.out.println(num + "は素数です。");
           }
           else if(num % i == 0){
             System.out.println(num + "は素数ではありません。");
             break;
           }
       }
   }
}