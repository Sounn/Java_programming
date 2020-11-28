// 学籍番号:19H081，氏名:久井颯生，課題番号:課題0
class Measurement_2
{
  String name; //名前
  int age; //年齢
  double height; //身長
  double waist; //腹囲
  double standardWeight; //標準体重
  double weight; //体重

  double calculate(double h){
    double sW = 22.0 * (h / 100.0) * (h / 100.0);
    return sW;
  }

  void show(String name, int age, double height, double weight, double waist)
  {
    double standardWeight = this.calculate(height);

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

class Kadai08_0
{
  public static void main(String[] args)
  {
  Measurement_2 student1, student2, student3;
  student1 = new Measurement_2();
  student2 = new Measurement_2();
  student3 = new Measurement_2();

  String name;
  int age;
  double height;
  double weight;
  double waist;

  System.out.println("\n 学生:student1");
  name = "Suga"; age = 22;
  height = 180.0; weight = 82.2; waist = 82.2;
  student1.show(name,age,height,weight,waist);

  System.out.println("\n 学生:student2");
  name = "Kato"; age = 19;
  height = 173.3; weight = 73.3; waist = 93.3;
  student2.show(name,age,height,weight,waist);

  System.out.println("\n 学生:student3");
  name = "Kouno"; age = 20;
  height = 161.1; weight = 61.1; waist = 51.1;
  student3.show(name,age,height,weight,waist); 

  }
}