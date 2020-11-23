class Measurement
{
  String name; //名前
  int age; //年齢
  double height; //身長
  double waist; //腹囲
  double standardWeight; //標準体重
}

class Kadai07_0
{
  public static void main(String[] args)
  {
  Measurement student1;
  student1 = new Measurement();

  student1.name = "Suga";
  student1.age = 22;
  student1.height = 182.2;
  student1.waist = 82.2;
  student1.standardWeight = 22.0 * Math.pow( student1.height / 100.0, 2);

  System.out.printf("\n");
  System.out.printf("名前： %s\t", student1.name );
  System.out.printf("年齢： %d 歳\t", student1.age );
  System.out.printf("身長： %.2f cm\t", student1.height );
  System.out.printf("腹囲： %.2f cm\n", student1.waist );
  System.out.printf("標準体重は %8.3f kg です。\n", student1.standardWeight );
  System.out.printf("\n");
  }
}