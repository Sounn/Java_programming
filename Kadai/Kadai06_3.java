// 学籍番号:19H081，氏名:久井颯生，課題番号:課題3
class Kadai06_3
{
  public static void main(String[] args)
  {
    int[] array = new int[10];
    int num = 0;

    for(int i=0; i<100; i++){
      num = (int)(Math.random()*10);
      System.out.print(num + " ");
      switch(num){
        case 0: array[0]++;break;
        case 1: array[1]++;break;
        case 2: array[2]++;break;
        case 3: array[3]++;break;
        case 4: array[4]++;break;
        case 5: array[5]++;break;
        case 6: array[6]++;break;
        case 7: array[7]++;break;
        case 8: array[8]++;break;
        case 9: array[9]++;break;
      }
    }
    System.out.println();

    for(int i=0; i< array.length; i++){
      System.out.print(i + " ");
      for (int j=0; j< array[i]; j++){
        System.out.print("*");
      }
      System.out.println(" " + array[i]);
    }
  }
}