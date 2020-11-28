// 学籍番号:19H081，氏名:久井颯生，課題番号:課題3
class Figure
{
  double width; //横 変更しない 
  double height; //縦 変更しない 
  double square; //面積 変更しない

  double getArea() //戻り値の型変更、戻り値を追記 
  {
    square = width * height; //変更しない 
    return square;
  }
  void setLength(double w,double h) //引数の追記 
  {
    //仮引数をフィールドへ代入 
    this.width = w;
    this.height = h;
    System.out.println("横:" + width + " 縦:"+ height );
    // getArea(); //このメソッドはコメントにする 
  }
}
class Kadai08_3
{
  public static void main(String[] args)
  {
    Figure fig1 = new Figure();
    Figure fig2 = new Figure();
    //変更しない
    //実引数として使用する2つの変数 width, height を宣言追加
    double width = 10.0, height = 40.0;
    System.out.println("\n1 つ目の図形の面積を求めます。");
    fig1.setLength(width,height); //変数である実引数を付加する。 
    System.out.println("面積は " + fig1.getArea() + " です。"); //ここは戻り値で値を表示する

    width = 22.2;
    height = 88.8;
    System.out.println("\n2 つ目の図形の面積を求めます。");
    fig2.setLength(width,height); //変数である実引数を付加する 
    System.out.println("面積は " + fig2.getArea() + " です。"); //ここは戻り値で値を表示する
  } 
}