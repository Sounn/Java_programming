// 学籍番号:19H081，氏名:久井颯生，Exercise番号:練習1
class Exercise06_01
{
   public static void main(String[] args)
   {
      System.out.println("1～10までの偶数を出力します。");

      for(int i=1; i<=10; i++){
         if((i % 2) == 0)
            System.out.println(i);
      }
   }
}
