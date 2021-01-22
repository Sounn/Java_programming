// 学籍番号:19H081，氏名:久井颯生，課題番号:課題1
class Kadai15_1
{
  public static void main(String[] args)
  {
    System.out.println("\t\t 2020 年 1 月");
    System.out.println("日\t月\t火\t水\t木\t金\t土");

    // for(int i = 1; i <= 31;i++){
    //   if(i < 9){
    //     System.out.print(" ");
    //   }

    //   System.out.print(i);

    //   if(i % 7 == 3){
    //     System.out.print("\n");
    //   } else{
    //     System.out.print("  ");
    //   }

    // }

    for(int i = -4; i <= 31;i++){
      int day = i;

      if(i % 7 == 2)System.out.println(day);
      else if(i <= 0)System.out.print("\t");
      else System.out.print(day + "\t");
    }
    System.out.println("\t");
  }
}