// 学籍番号:19H081，氏名:久井颯生，Sample番号:3
class Sample07_03
{
   public static void main(String[] args)
   {
      int[] test = new int[5];
      
      test[0] = 80;
      test[1] = 60;
      test[2] = 22;
      test[3] = 50;
      test[4] = 75;

      for(int i=0; i<5; i++){
         System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
     }
   }
}
