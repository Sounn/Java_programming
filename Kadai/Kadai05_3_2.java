import java.io.*;
class Kadai05_3_2
{
public static void main(String[] args) throws IOException {
System.out.println("文字列を入力してください");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
String str = br.readLine();
for(int i=0; i<str.length(); i++){ System.out.println(str.charAt(i));
} }
}