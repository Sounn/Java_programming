// 学籍番号:19H081，氏名:久井颯生，課題番号:課題2
interface iPerson
{
  void setPerData(int type,double value);
  void showPerData();
}

interface iSchool
{
  int UNIV=4, HIGH=3, JUNI=3, ELEM=6, ENT=7;

  String getSchool(int i);
  int getScYear(int i);
}

class Student implements iPerson, iSchool
{
  private String name;
  private double height, weight;
  private int byear;

  public Student(String na,double ht, double wt, int br)
  {
    name = na;
    height = ht;
    weight = wt;
    byear = br;
  }

  public void setPerData(int type,double value){
    switch (type) {
      case 0:
      height = value;
        break;
      case 1:
      weight = value;
        break;
      case 2:
      byear = (int)value;
        break;
      default:
        break;
    }
  }

  public void showPerData(){
    System.out.println("名前:" +name+ ", 身長:" +height+ "cm, 体重:"+weight+"kg, 生まれた年:"+ byear+ "年");
  }

  public String getSchool(int ce){
    if(ce-byear < ENT){
      return "未入学";
    }else if(ce-byear < ENT+ELEM){
      return "小学";
    }else if(ce-byear < ENT+ELEM+JUNI){
      return "中学";
    }else if(ce-byear < ENT+ELEM+JUNI+HIGH){
      return "高校";
    }else if(ce-byear < ENT+ELEM+JUNI+HIGH+UNIV){
      return "大学";
    }else{
      return "社会人";
    }
  }

  public int getScYear(int ce){
    if(ce-byear < ENT){
        return -1;
      }else if(ce-byear < ENT+ELEM){
        return ce - byear - ENT+1;
      }else if(ce-byear < ENT+ELEM+JUNI){
        return ce - byear - ENT - ELEM + 1;
      }else if(ce-byear < ENT+ELEM+JUNI+HIGH){
        return ce - byear - ENT - ELEM - JUNI + 1;
      }else if(ce-byear < ENT+ELEM+JUNI+HIGH+UNIV){
        return ce - byear - ENT - ELEM - JUNI - HIGH + 1;
      }else{
        return -1;
    }
  }
}

class Kadai14_2
{
  public static void main(String[] args)
  {
    int year = 2020;
    Student student = new Student("taro",185.7,82.6,2000);

    student.showPerData();
    System.out.println("西暦"+ year +"年の時、" + student.getSchool(year) + student.getScYear(year) + "年生");
    student.setPerData(0,162.3);
    student.setPerData(1,55.6);
    student.setPerData(2,2010);
    student.showPerData();
    System.out.println("西暦"+ year +"年の時、" + student.getSchool(year) +student.getScYear(year) + "年生");

  }
}