// 学籍番号:19H081，氏名:久井颯生，課題番号:課題3
class Kadai04_3
{
  public static void main(String[] args)
  {
    int x = (int)(Math.random() * 5);
    String str = "";
    switch (x)
    {
      case 0: str = "大吉";
        break;
      case 1: str = "中吉";
        break;
      case 2: str = "小吉";
        break;
      case 3: str = "末吉";
        break;
      case 4: str = "凶";
        break;
    }
    System.out.println("今日のあなたの運勢は"+ str);
  }
}