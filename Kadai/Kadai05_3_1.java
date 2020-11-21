import java.io.*;

class Kadai05_3_1
{
  public static void main(String[] args) throws IOException 
  {
    System.out.println("ファイル名を入力してください");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    String file_name = br.readLine();


    try{
    BufferedReader br_f = new BufferedReader(new FileReader(file_name)); 
    String str;
    while((str=br_f.readLine())!=null){
      System.out.println(str); 
    }
    br_f.close(); 
  }
    catch(IOException e){
      System.out.println("入力エラーです");
    } 
  }
}