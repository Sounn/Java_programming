import java.io.*;
class Test05_2
{
 public static void main(String[] args) throws IOException
 {
 System.out.println("自然数を 2 つ入力");
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 String str = br.readLine();
 int m = Integer.parseInt(str);
 str = br.readLine();
 int n = Integer.parseInt(str);

 int r = m%n ;

 while(r != 0 ){
 m= n ;
 n= r ;
 r= m%n ;
 }
 System.out.println("最大公約数："+ n );
 }
} 