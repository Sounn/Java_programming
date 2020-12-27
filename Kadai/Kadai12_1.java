// 学籍番号:19H7081，氏名:久井颯生，課題番号:課題1
class Human {
  private String name;
  private double height;// 身長:値は cm で保存
  private double weight;// 体重:値は kg で保存

  private Human() {
    name = "noname";
    height = 0;
    weight = 0;
  }

  Human(String name, double height,double weight) {
    this.name = name;
    this.height = height;
    this.weight = weight;
  }

  public void printInfo()
  {
  System.out.println("名前:"+ name + ", 身長:"+ height
  + "cm, 体重:"+weight+"kg");
  }
}

class Kadai12_1{
  public static void main(String[] args){
    Human member[] = new Human[3];

    member[0] = new Human("Taro",160.5,62.3);
    member[1] = new Human("Jiro",185.3,71.8);
    member[2] = new Human("Hanako",168.3,52.8);

    for(int i = 0; i < member.length; i++){
      member[i].printInfo();
    }
  }
}

