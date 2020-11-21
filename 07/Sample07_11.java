// 学籍番号:19H081，氏名:久井颯生，Sample番号:11
class Sample07_11
{
   public static void main(String args[])
   {
      int[][] test = {
         {80,60,22,50},{90,55,68,72},{33,75,63}
      };

      for(int i=0; i<test.length; i++){
         System.out.println((i+1) + "番目の配列要素の長さは" + test[i].length + "です。");
      }
   }
}
