// 学籍番号:19H081，氏名:久井颯生，Sample番号:5
class Car
{
   int num;
   double gas;

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

class Sample08_05
{
   public static void main(String[] args)
   {
      Car car1 = new Car();

      int number = 1234;
      double gasoline = 20.5;

      car1.setNumGas(number, gasoline);
   }
}
