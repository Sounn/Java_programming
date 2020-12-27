// 学籍番号:19H081，氏名:久井颯生，Exercise番号:練習4
class Car
{
   protected int num;
   protected double gas;
   
   public Car()
   {
      num = 0;
      gas = 0.0;
      System.out.println("車を作成しました。");
   }
   public void setCar(int n, double g)
   {
      num = n;
      gas = g;
      System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
   }
   public String toString()
   {
      String str = "ナンバー" + num + "ガソリン量" + gas + "の車";
      return str;
   }
}

class Exercise11_04
{
   public static void main(String[] args)
   {
      Car car1 = new Car();
      car1.setCar(1234, 20.5);

      System.out.println(car1 + "です。"); 
   }
}
