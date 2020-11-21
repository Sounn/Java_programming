class Test05_1
{
 public static void main(String[] args)
 {
 for(int i=0; i<10; i++){
 System.out.println("A");
 }
 for(int i=1; i<10; i++){
 System.out.println("B");
 }
 int j=10;
 while(j>=0){
 System.out.println("C");
 j--;
 }
 do{
 System.out.println("D");
 j++;
 }while(j<=0);
 for(int k=10; k>0; k--){
 if(k%3==0){
 System.out.println("E");
 }
 }
 for(int k=0; k<30; k++){
 if(k == 5) break;
 System.out.println("F");
 }
 for(int k=0; k<30; k++){
 if(k%3==0) continue;
 System.out.println("G");
 }
 int sum=1;
 while(true){
 System.out.println("H");
 sum += sum;
 if(sum>=50)break;
 }
 }
} 