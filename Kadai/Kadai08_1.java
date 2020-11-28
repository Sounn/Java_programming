// 学籍番号:19H081，氏名:久井颯生，課題番号:課題1
class Measurement_3
{
  void judge(double height, double weight, double waist){
    
    if(weight / (height / 100.0) / (height / 100.0) >= 25.0  || waist >= 85.0){
      System.out.print("*** 肥満注意 ***");
    }else{
      System.out.print("*** 正常 ***");
    }
  }

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
    System.out.printf("BMI= %.2f 腹囲= %.2f",weight / (height / 100.0) / (height / 100.0),waist);
    this.judge(height,weight,waist);
    System.out.printf("\n");
  }
}

class Kadai08_1
{
  public static void main(String[] args)
  {
  Measurement_3 student = new Measurement_3();

  String name[] = {"Suga","Kato","Kouno"};
  int age[] = {22,19,20};
  double height[] = {180.05,173.3,161.1};
  double weight[] = {82.2,73.3,61.1};
  double waist[]= {82.2,93.3,51.1};

  for(int i=0;i<3;i++){
    System.out.printf("\n学生:student%d\n",i);
    student.show(name[i],age[i],height[i],weight[i],waist[i]); 
  }

  }
}