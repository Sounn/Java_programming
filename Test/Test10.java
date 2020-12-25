class Person{
  public String name;
  public int year, month, date;

  public Person()
  {
    name = "No name";
    year = 0;
    month = 0;
    date = 0;
  } 

  public Person(String str, int y,int m,int d)
  {
    name = str;
    year = y;
    month = m;
    date = d;
  }

  public void inputData(String str, int y,int m,int d)
  {
    name = str;
    year = y;
    month = m;
    date = d;
  }

  public void showData()
  {
    System.out.println("名前:" + name + " 生年月日:西暦" + year + "年" + month + "月" + date +"日");
  }

  public void copyData(Person a)
  {
    name = a.name;
    year = a.year;
    month = a.month;
    date = a.date;
  }
}

class Test10
{
  public static void main(String args[])
  {
    Person person1 = new Person();
    person1.inputData("Ichiro",2000,12,25);
    person1.showData();

    Person person2 = new Person();
    person2.copyData(person1);
    person2.showData();

    Person person3;
    person3 = person1;
    person3.showData();

    person1.inputData("Jiro", 2001, 1, 8);

    System.out.println();
    person1.showData();
    person2.showData();
    person3.showData();

    Person member[] = new Person[3];

    member[0] = person1;
    member[1] = person2;
    member[2] = new Person("Tom",2000,2,3);

    System.out.println();

    for(int i= 0; i < member.length; i++){
      System.out.print((i+1)+"人目:");
      member[i].showData();
    }

  }
}