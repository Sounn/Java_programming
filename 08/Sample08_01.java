// 学籍番号:19H081，氏名:久井颯生，Sample番号:1
class Car
{
   int num;
   double gas;
}

class Sample08_01
{
   public static void main(String[] args)
   {
      Car car1;
      car1 = new Car();

      car1.num = 1234;
      car1.gas = 20.5;

      System.out.println("車のナンバーは" + car1.num + "です。");
      System.out.println("ガソリン量は" + car1.gas + "です。");
   }
}
