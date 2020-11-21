// 学籍番号:19H081，氏名:久井颯生，課題番号:課題3
import java.io.*;
class Kadai03_3
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("金額は？");
    String str = br.readLine();
    // int num1 = Integer.parseInt(str);
    double num1 = Double.parseDouble(str);
    System.out.print("人数は？");
    str = br.readLine();
    // int num2 = Integer.parseInt(str);
    double num2 = Double.parseDouble(str);
    System.out.println("一人当たり " + (Math.ceil(num1/num2)) + " 円です");
    System.out.println("幹事に " + (Math.ceil(num1/num2)*num2 - num1) + " 円のお釣り");
  }
}

// // 学籍番号:19H081，氏名:久井颯生，課題番号:課題3
// import java.io.*;
// import java.math.BigDecimal;
// class Kadai03_3
// {
//   public static void main(String[] args)throws IOException
//   {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     System.out.print("金額は？");
//     String str = br.readLine();
//     double num1 = Double.parseDouble(str);
//     System.out.print("人数は？");
//     str = br.readLine();
//     double num2 = Double.parseDouble(str);
//     BigDecimal bd = new BigDecimal(num1/num2);
//     bd = bd.setScale(0, BigDecimal.ROUND_HALF_UP);
//     System.out.println("一人当たり " + bd + " 円です");
//     System.out.println("幹事に " + (num1%num2) + " 円のお釣り");
//   }
// }