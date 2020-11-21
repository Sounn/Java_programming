import java.io.*;
class Test05_3
{
 public static void main(String[] args) throws IOException
 {
 System.out.println("いくつまで？ ");
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 String str = br.readLine();
 int num = Integer.parseInt(str);
 int count=0;

 for(int i = 2; i <= num ; i++){
  for(int j = 2; j <= i ; j++){
    if(i == j){ //素数の場合
      System.out.print( i + ", ");
      count++;
    }
    else if (i%j == 0) break; //素数でない場合
  }
 }
 System.out.println("\n 素数は"+ count +"個です");
 }
} 