// 学籍番号:19H081，氏名:久井颯生，課題番号:課題1
import java.io.*;
class Kadai06_1
{
  public static void main(String[] args) throws IOException {
    System.out.print("データはいくつですか？");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
    int num = Integer.parseInt(str);
    int[] num_array = new int[num] ;
    double sum = 0;
    double average = 0;
    for(int i=0; i<num_array.length; i++){
      System.out.print((i+1) + "番目は？");
      str =br.readLine();
      num_array[i] = Integer.parseInt(str);
      sum += num_array[i];
    }
    average = sum/(double)num;
    System.out.println("入力した値の平均値は" + average);

    num = 0;
    System.out.print("平均より大きいのは");
    for( int i : num_array ){
      if( i > average ){
        System.out.print( i +" ");
        num++;
      }
    }
    System.out.println("で" + num + "個でした");
  }
}