// 学籍番号:19H081，氏名:久井颯生，課題番号:課題3
//課題３のサンプルプログラム

class Kakeibo
{
	private int year;		//年
	private int month;		//月
	private int day;		//日
	private int income;		//収入
	private int expenses;	//支出
	private static int savings = 0;
	
	private Kakeibo()		//クラスの外からアクセスできないようにしなさい。
	{
		year = 0;
		month = 0;
		day = 0;
		income = 0;
		expenses = 0;
	}

	public void showData()
	{
		System.out.printf("  %4d 年  %2d 月  %2d 日  :  収入 %7d 円  支出 %7d 円\n", year, month, day, income, expenses);
	}

	public Kakeibo(int y,int m,int d,int inco,int expe){
		this();
		if(inco < 0 || expe < 0){
			System.out.println("***** エラー:入力した金額は無効です。");
		}else{
			year = y;
			month = m;
			day = d;
			income = inco;
			expenses = expe;
			savings += (income - expenses);
		}
	}

	 public static void showSavings(){
		System.out.printf("貯金: %8d円",savings);
	}
}

class Kadai10_3
{
	public static void main(String args[])
	{
		System.out.printf("\n");
		// Kakeibo kakeibo1 = new Kakeibo();		//この行をコメントにしなさい
		// kakeibo1.showData();					//この行をコメントにしなさい
		
		Kakeibo.showSavings();
		System.out.printf("\n");
						
		Kakeibo kakeibo2 = new Kakeibo(2020, 11, 27, 5000, 1500);
		kakeibo2.showData();
		
		Kakeibo kakeibo3 = new Kakeibo(2020, 12, 4, 0, -2000);
		kakeibo3.showData();
		
		Kakeibo kakeibo4 = new Kakeibo(2020, 12, 4, 0, 2000);
		kakeibo4.showData();
		
		Kakeibo kakeibo5 = new Kakeibo(2020, 12, 11, -3000, 500);
		kakeibo5.showData();
		
		Kakeibo kakeibo6 = new Kakeibo(2020, 12, 11, 3000, 500);
		kakeibo6.showData();
		
		System.out.printf("\n");
		Kakeibo.showSavings();

		System.out.printf("\n");
	}
}

