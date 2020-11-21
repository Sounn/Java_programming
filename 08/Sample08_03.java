// 学籍番号:19H081，氏名:久井颯生，Sample番号:2
class Car
{
   int num;
   double gas;

   void show()
   {
      System.out.println("車のナンバーは" + num + "です。");
      System.out.println("ガソリン量は" + gas + "です。");
   }

   void showCar()
   {
      System.out.println("これから車の情報を表示します。");
      show();
   }
}

class Sample08_03
{
   public static void main(String[] args)
   {
      Car car1;
      car1 = new Car();

      car1.num = 1234;
      car1.gas = 20.5;

      car1.showCar();
   }
}
