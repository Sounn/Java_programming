// 学籍番号:19H081，氏名:久井颯生，課題番号:課題3
class Figure
{
  int major;//直径
  int minor;//短径
  double area;//面積
  Stirng type;//形

  public void getArea(){
    area = Math.PI * major * minor;
  }
  public void getType(){
    type = major == minor ? "円" : "楕円";
  }
  public void setLength(){
    getArea();
    getType();
    // System.out.printf("直径: %d 短径: %d", major, minor);
  }
}

class Kadai07_3
{
  public static void main(String[] args)
  {
  Figure fig;
  fig = new Figure();
  double f_major[] = { 80, 50, 30}, f_minor[] = { 60, 50, 10};
  // double f_major[] = { 100, 80, 50, 30}, f_minor[] = { 50, 60, 50, 10};
  double f_area[] = new double[f_major.length];
  String f_type[] = new String[f_major.length];

    for(i=0; i<f_major.length; i++){
      System.out.println( (i+1)+"つ目の図形は");
      System.out.println("面積は " + f_area[i] + " で " + f_type[i] + " です。\n");
    }
  }
}