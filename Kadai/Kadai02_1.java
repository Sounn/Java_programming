// 学籍番号:19H081，氏名:久井颯生，課題番号:課題1
class Kadai02_1
{
  public static void main(String[] args)
  {
    System.out.println("        2020 年 10 月");
    System.out.println("日  月  火  水  木  金  土");
    
    int i = 1;

    System.out.print("                ");
    while (i <= 31){
      if(i < 10){
        System.out.print(" ");
      }

      System.out.print(i);
      
      if(i % 7 == 3){
        System.out.print("\n");
      } else{
        System.out.print("  ");
      }
      i++;
    }
  }
}