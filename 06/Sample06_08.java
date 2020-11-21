// 学籍番号:19H081，氏名:久井颯生，Sample番号:8
import java.io.*;

class Sample06_08
{
   public static void main(String[] args)
   {
      boolean bl = false;
      for(int i=0; i<5; i++){
         for(int j=0; j<5; j++){
            if(bl == false){
               System.out.print("*");
               bl = true;
            }
            else{
               System.out.print("-");
               bl = false;
            }
         }
         System.out.print("\n");
      }
   }
}
