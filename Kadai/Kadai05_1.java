// 学籍番号:19H081，氏名:久井颯生，課題番号:課題1
import java.io.*;
class Kadai05_1
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("整数を2つ入力してください");
    String str = br.readLine();
    int m = Integer.parseInt(str);
    str = br.readLine();
    int n = Integer.parseInt(str);

    int sum = 0;
    int i = 0;
    if( m > n ){
      for(i = n; i < m ; i++){
        System.out.print( i + " + ");
        sum += i;
      }
      System.out.print(m);
      sum += m;
      System.out.println(" = " + sum);
    } else if ( n > m){
      for(i = m; i < n ; i++){
        System.out.print( i + " + ");
        sum += i;
      }
      System.out.print(n);
      sum += n;
      System.out.println(" = " + sum);
    }else{
      System.out.println(m + " = " + n);
    }
  }
}