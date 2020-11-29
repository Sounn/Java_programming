// 学籍番号:19H081，氏名:久井颯生，Sample番号:4
class Car
{
   private int num;
   private double gas;

   public Car()
   {
      num = 0;
      gas = 0.0;
      System.out.println("車を作成しました。");
   }
   public void show()
   {
      System.out.println("車のナンバーは" + num + "です。");
      System.out.println("ガソリン量は" + gas + "です。");
   }
}

class Sample09_04
{
   public static void main(String[] args)
   {
      Car car1 = new Car();

      car1.show();
   }
}
