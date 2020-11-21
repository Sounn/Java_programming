import java.io.*;
class Test06_3
{
  public static void main(String[] args) throws IOException
  {
    System.out.print("何人分の身長を入力しますか？");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str=br.readLine();
    int num = Integer.parseInt(str) ;
    double[] height = new double[num] ;
    for(int i=0; i<height.length; i++){
      System.out.print((i+1) + "番目は？");
      str =br.readLine();
      height[i] = Double.parseDouble(str) ;
    }
    System.out.println("大きい順に並べると");
    for(int i=0; i<height.length-1; i++){
      for(int j=i+1; j<height.length; j++){
        if(height[j] > height[i]){
          double tmp = height[j];
          height[j]=height[i];
          height[i] = tmp;
        }
      }
    }
    //拡張 for 文で記述
    for( double h : height ){
      System.out.println( h +"cm");
    }
  }
} 