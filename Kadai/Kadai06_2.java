// 学籍番号:19H081，氏名:久井颯生，課題番号:課題2
import java.io.*;
import java.util.Arrays;
class Kadai06_2
{
  public static void main(String[] args) throws IOException {
    System.out.println("文字列を入力してください");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
    char[] array = new char[str.length()];

    for(int i=0; i< str.length(); i++){
      array[i] = str.charAt(i);
    }

    Arrays.sort(array);

    for(int i=0; i< str.length(); i++){
      System.out.print(array[i]);
    }
    System.out.println();
  }
}