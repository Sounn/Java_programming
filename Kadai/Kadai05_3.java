// 学籍番号:19H081，氏名:久井颯生，課題番号:課題3
import java.io.*;
class Kadai05_3
{
  public static void main(String[] args) throws IOException {
    System.out.println("ファイル名を入力してください");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String file_name = br.readLine();
    int sum = 0;
    int sum_big = 0;
    int sum_small = 0;
    int sum_other = 0;
    int i=0;
    try{
      BufferedReader br_f = new BufferedReader(new FileReader(file_name)); 
      String str;
      while((str=br_f.readLine())!=null){
        sum ++;
        for(i=0; i<str.length(); i++){
          if (Character.isUpperCase(str.charAt(i))){
            sum_big++;
          }else if(Character.isLowerCase(str.charAt(i))){
            sum_small++;
          }else{
            sum_other++;
          }
        } 
      }
        br_f.close(); 
    }
    catch(IOException e){ System.out.println("入力エラーです");
    } 
    System.out.println(sum + "行ありました");
    System.out.println("小文字の数は" + sum_small);
    System.out.println("大文字の数は" + sum_big);
    System.out.println("その他の数は" + sum_other);
  }
}