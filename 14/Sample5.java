class CarException extends Exception
{
}
//�ԃN���X
class Car
{
   private int num;
   private double gas;
   
   public Car()
   {
      num = 0;
      gas = 0.0;
      System.out.println("�Ԃ��쐬���܂����B");
   }
   public void setCar (int n, double g) throws CarException
   {
     if(g < 0)
     {
        CarException e = new CarException();
        throw e;
     }
     else{
        num = n;
        gas = g;
        System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
     }
   }
   public void show()
   {
      System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
      System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
   }
}

class Sample5
{
   public static void main(String[] args)
   {
      
      Car car1 = new Car();
      try{
         car1.setCar(1234, -10.0);
      }
      catch(CarException e){
         System.out.println(e + "�����o����܂����B");
      }
      car1.show();
   }
}