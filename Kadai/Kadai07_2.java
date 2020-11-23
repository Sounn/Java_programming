// 学籍番号:19H081，氏名:久井颯生，課題番号:課題2
class Goods
{
  int price; //価格
  int number; //個数
  int total; //税抜き総計
  int tax; //消費税
  int payment; //税込み支払額

  public void getTotal(){
    total = price * number;
  }

  public void getTax(){
    tax = total/10;
  }

  public void getPayment(){
    payment = total + tax;
  }

  public void show(){
    getTotal();
    getTax();
    getPayment();
    System.out.printf("価格 %d 円、", price );
    System.out.printf("個数 %d 個\n", number );
    System.out.printf("総額(税抜き) %d 円、", total );
    System.out.printf("消費税 %d 円、", tax );
    System.out.printf("支払額 %d 円\n", payment );
    System.out.println();
  }
}

class Kadai07_2
{
  public static void main(String[] args)
  {
  Goods pencil, eraser, notebook;
  pencil = new Goods();
  eraser = new Goods();
  notebook = new Goods();

  pencil.price = 44;
  pencil.number = 55;

  eraser.price = 66;
  eraser.number = 77;

  notebook.price = 88;
  notebook.number = 99;


  System.out.println("購入明細:鉛筆");
  pencil.show();
  System.out.println("購入明細:消しゴム");
  eraser.show();
  System.out.println("購入明細:ノート");
  notebook.show();
  }
}