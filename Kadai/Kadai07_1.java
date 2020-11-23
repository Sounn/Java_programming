// 学籍番号:19H081，氏名:久井颯生，課題番号:課題1
class Measurement_1
{
  String name; //名前
  int age; //年齢
  double height; //身長
  double waist; //腹囲
  double standardWeight; //標準体重
  double weight; //体重

  public void calculate(){
    standardWeight = 22.0 * Math.pow( height / 100.0, 2);
    System.out.printf("名前： %s\t", name );
    System.out.printf("年齢： %d 歳\t", age );
    System.out.printf("身長： %.2f cm\t", height );
    System.out.printf("体重： %.2f kg\t", weight );
    System.out.printf("腹囲： %.2f cm\n", waist );
    System.out.printf("標準体重は %8.3f kg です。\n", standardWeight );
    System.out.printf("(体重―標準体重)は %8.3f kgです\n", weight-standardWeight );
    System.out.printf("\n");
  }
}

class Kadai07_1
{
  public static void main(String[] args)
  {
  Measurement_1 student1, student2, student3;
  student1 = new Measurement_1();
  student2 = new Measurement_1();
  student3 = new Measurement_1();

  student1.name = "Suga";
  student1.age = 22;
  student1.height = 182.2;
  student1.waist = 82.2;
  student1.weight = 82.2;

  student2.name = "Kato";
  student2.age = 19;
  student2.height = 173.3;
  student2.waist = 93.3;
  student2.weight = 73.3;

  student3.name = "Kouno";
  student3.age = 20;
  student3.height = 161.1;
  student3.waist = 51.1;
  student3.weight = 61.1;

  System.out.println("学生:student1");
  student1.calculate();
  System.out.println("学生:student2");
  student2.calculate();
  System.out.println("学生:student3");
  student3.calculate();
  }
}