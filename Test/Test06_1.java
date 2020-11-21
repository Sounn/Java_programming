class Test06_1
{
  public static void main(String[] args)
  {
    int[][] num = {
    {1,2,3,4,5},{10,20,30},{6,7,8,9},{55,54,53,52,51}
    };
    for(int k=0; k< num.length ; k++){
    System.out.println((k+1) + "行目は" + num[k].length + "個のデータ");
    }
    for(int[] i : num ){
      for(int j : i ){
      System.out.print( j + " ");
      }
      System.out.println( );
    }
  }
} 