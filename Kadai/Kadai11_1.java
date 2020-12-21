// 学籍番号:19H081，氏名:久井颯生，課題番号:課題1
import java.io.*;

class Kadai11_1
{
  public static void main(String[] args) throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("文字列を入力");
    StringBuffer str = new StringBuffer(br.readLine());
    int s=0 ,l=str.length();

    for(int i = 0; i< l; i++){
      for(int j = 0; j < 26; j++){
        if(new String(str).indexOf((char)(97 + j)) != -1){
          s++;
          str.deleteCharAt(new String(str).indexOf((char)(97 + j)));
        }
      }
    }

    System.out.println("小文字のアルファベット数: " + s);
  }
}

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// System.out.println("文字列を入力");
// String str = br.readLine();
// int s = 0;
// for(int i = 0; i< str.length(); i++){
//   if(Character.isLowerCase(str.charAt(i))){
//     s++;
//   }
// }
// System.out.println("小文字のアルファベット数: " + s);