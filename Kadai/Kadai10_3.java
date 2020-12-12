// 学籍番号:19H081，氏名:久井颯生，課題番号:課題3
//課題３のサンプルプログラム

class Kakeibo
{
	private int year;		//年
	private int month;		//月
	private int day;		//日
	private int income;		//収入
	private int expenses;	//支出
	
	public Kakeibo()		//クラスの外からアクセスできないようにしなさい。
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
}

class Kadai10_3
{
	public static void main(String args[])
	{
		System.out.printf("\n");
		Kakeibo kakeibo1 = new Kakeibo();		//この行をコメントにしなさい
		kakeibo1.showData();					//この行をコメントにしなさい
		
/*			//この行を削除して以下のコードを動作するようにしなさい。
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
*/			//この行を削除しなさい。
		System.out.printf("\n");
	}
}

