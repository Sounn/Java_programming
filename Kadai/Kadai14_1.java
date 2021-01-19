// 学籍番号:19H081，氏名:久井颯生，課題番号:課題1
interface iPerson
{
  void setPerData(int type,double value);
  void showPerData();
}

class Student implements iPerson
{
  private String name;
  private double height, weight;

  public Student(String na,double ht, double wt)
  {
    name = na;
    height = ht;
    weight = wt;
  }

  public void setPerData(int type,double value){
    switch (type) {
      case 0:
      height = value;
        break;
      case 1:
      weight = value;
        break;
      default:
        break;
    }
  }

  public void showPerData(){
    System.out.println("名前:" +name+ ", 身長:" +height+ "cm, 体重:"+weight+"kg");
  }
}

class Kadai14_1
{
  public static void main(String[] args)
  {
    Student student = new Student("taro",185.7,82.6);

    student.showPerData();
    student.setPerData(0,162.3);
    student.setPerData(1,55.6);
    student.showPerData();
  }
}