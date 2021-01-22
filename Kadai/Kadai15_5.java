// 学籍番号:19H081，氏名:久井颯生，課題番号:課題5
//課題３のサンプルプログラム

class Kakeibo
{
  //クラス変数
  private static int savings = 0;

	private int income;		//収入
	private int expenses;	//支出
	
	private Kakeibo()		//クラスの外からアクセスできないようにしなさい。
	{
		income = 0;
		expenses = 0;
  }
  
  public Kakeibo(int inco,int expe){
		this();
		if(inco < 0 || expe < 0){
			System.out.println("***** エラー:入力した金額は無効です。");
		}else{
			income = inco;
			expenses = expe;
			savings += income - expenses;
		}
	}

	public void showData()
	{
		System.out.printf("収入 %7d 円  支出 %7d 円\n",income, expenses);
	}

  //クラスメソッド
	public static void showSavings(){
		System.out.printf("貯金: %7d円\n",savings);
	}
}

class Kadai15_5
{
	public static void main(String args[])
	{
    Kakeibo.showSavings();
		System.out.printf("\n");
						
		Kakeibo kakeibo1 = new Kakeibo(5000, 1500);
		kakeibo1.showData();
		
		Kakeibo kakeibo2 = new Kakeibo(0, -2000);
		kakeibo2.showData();
		
		Kakeibo kakeibo3 = new Kakeibo(0, 2000);
		kakeibo3.showData();
		
		Kakeibo kakeibo5 = new Kakeibo(-3000, 500);
		kakeibo5.showData();
		
		Kakeibo kakeibo6 = new Kakeibo(3000, 500);
		kakeibo6.showData();
		
		System.out.printf("\n");
		Kakeibo.showSavings();
	}
}

