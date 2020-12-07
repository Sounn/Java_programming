// 学籍番号:19H081，氏名:久井颯生，Exercise番号:練習4
class A
{
   A()
   {
      System.out.println("引数0のコンストラクタです。");
   }
   A(int a)
   {
      this();
      System.out.println("引数1のコンストラクタです。");
   }
}
class Exercise09_04
{
   public static void main(String[] args)
   {
      A a1 = new A();
      A a2 = new A(10);
   }
}