// 学籍番号:19H081，氏名:久井颯生，Sample番号:6
class Car
{
   int num;
   double gas;

   int getNum()
   {
      System.out.println("ナンバーを調べました。");
      return num;
   }

   double getGas()
   {
      System.out.println("ガソリン量を調べました。");
      return gas;
   }

   void setNumGas(int n, double g)
   {
      num = n;
      gas = g;
      System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
   }

   void show()
   {
      System.out.println("車のナンバーは" + num + "です。");
      System.out.println("ガソリン量は" + gas + "です。");
   }
}

class Sample08_06
{
   public static void main(String[] args)
   {
      Car car1 = new Car();

      car1.setNumGas(1234, 20.5);

      int number = car1.getNum();
      double gasoline = car1.getGas();

      System.out.println("サンプルから車を調べたところ");
      System.out.println("ナンバーは"+ number + "ガソリン量は" + gasoline + "でした。");
   }
}
