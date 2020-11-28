// 学籍番号:19H081，氏名:久井颯生，Sample番号:4
class Car
{
   int num;
   double gas;

   void setNum(int n)
   {
      num = n;
      System.out.println("ナンバーを" + num + "にしました。");
   }

   void setGas(double g)
   {
      gas = g;
      System.out.println("ガソリン量を" + gas + "にしました。");
   }

   void show()
   {
      System.out.println("車のナンバーは" + num + "です。");
      System.out.println("ガソリン量は" + gas + "です。");
   }
}

class Sample08_04
{
   public static void main(String[] args)
   {
      Car car1 = new Car();

      car1.setNum(1234);
      car1.setGas(20.5);
   }
}
