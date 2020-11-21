import java.io.*;
class Test06_2
{
  public static void main(String[] args) throws IOException
  {
    System.out.print("データの個数は？");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
    int count = Integer.parseInt(str);
    int[] data = new int[count];
    System.out.println("0 から 99 の乱数を" + count +"個発生させます");
    for(int i=0; i<data.length; i++){
      data[i] = (int)(Math.random()*100);
    }
    //並べ替え (となりあわせの要素を比較していく方法)
    for(int i=0; i<data.length-1; i++){
      for(int j=0; j<data.length-i-1; j++){
        if(data[j] > data[j+1] ){
          int tmp = data[j];
          data[j] = data[j+1];
          data[j+1] = tmp;
        }
      }
    }
    //並べ替えた結果を出力 拡張 for 文を利用
    for(int n : data)
      System.out.print( n + " ");
    System.out.println( );
    //中央値の出力
    if(count%2==0)
      System.out.println("中央値は " + (data[count/2-1]+data[count/2])/ 2.0 );
    else System.out.println("中央値は " + data[count/2] );
  }
} 