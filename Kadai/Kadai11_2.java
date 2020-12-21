// 学籍番号:19H081，氏名:久井颯生，課題番号:課題2
import java.io.*;
class Kadai11_2
{
  public static void main(String[] args)throws IOException
  {
    double length = (Math.random()*5)+1;//1~5の乱数 
    int deg = (int)(Math.random()*90);
    double s = Math.pow(length,2) * Math.sin(Math.toRadians(deg));

    System.out.println("ひし形の辺の長さ: " + length);
    System.out.println("内角の１つ: " + deg + "度");
    System.out.println("面積: " + s);
  }
}