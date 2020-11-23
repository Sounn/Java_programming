// 学籍番号:19H081，氏名:久井颯生，Exercise番号:練習5
class MyPoint
{
   int x;
   int y;

   void setX(int px)
   {
      x = px;
   }
   void setY(int py)
   {
      y = py;
   }
   int getX()
   {
      return x;
   }
   int getY()
   {
      return y;
   }
}

class Exercise08_05
{
   public static void main(String[] args)
   {
      MyPoint p1;
      p1 = new MyPoint();
      p1.setX(10);
      p1.setY(5);

      int px = p1.getX();
      int py = p1.getY();
      
      System.out.println("X座標は" + px + "Y座標は" + py + "でした。");
   }
}
