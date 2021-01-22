// 学籍番号:19H081，氏名:久井颯生，課題番号:課題3
class Kadai15_3
{
  public static void main(String[] args)
  {
    int num_max = 10;
    int[] count = new int[num_max];

    int c = 0;
    while(c<100){
      int num = (int)(Math.random() * num_max);
      System.out.print(num + " ");
      count[num]++;
      c++;
    }

    System.out.println();

    for(int i=0; i< count.length; i++){
      System.out.print(i + " ");
      for (int j=0; j< count[i]; j++){
        System.out.print("*");
      }
      System.out.println(" " + count[i]);
    }
  }
}