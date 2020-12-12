// 学籍番号:19H081，氏名:久井颯生，課題番号:課題2
class Measurement_5
{
	private String		name;					//名前
	private int			age;						//年齢
	private double		height;				//身長
	private double		weight;				//体重
	private double		waist;					//腹囲
	private double		standardWeight;			//標準体重
	private static int n = 0, total_ht = 0, total_wt = 0, total_wa = 0,total_bmi = 0;

	public static void average(){
		System.out.printf("%d人の身長の平均は %8.2f cmです\n",n,(double)total_ht/n);
		System.out.printf("%d人の体重の平均は %8.2f cmです\n",n,(double)total_wt/n);
		System.out.printf("%d人の胸囲の平均は %8.2f cmです\n",n,(double)total_wa/n);
		System.out.printf("%d人のBMIの平均は %8.2f cmです\n",n,(double)total_bmi/n);
	}

	public void show(String na, int ag, double ht, double wt, double wa){
		if(check(ht)==0 && check(wt)==0 && check(wa)==0){
			name =na;  age=ag;  height=ht;  weight=wt;  waist=wa;
			double	standardWeight =  this.calculate();

			System.out.printf("  名前：%s  年齢：%d 歳  身長：%.2f cm  体重：%.2f kg  腹囲：%.2f cm\n"
			                   , name, age, height, weight, waist);
			System.out.printf("  標準体重は %8.3f kgです。\n", standardWeight);
			System.out.printf("  (体重―標準体重)は%8.3f kgです。\n", (weight-standardWeight));

			n += 1;
			total_ht += height;
			total_wt += weight;
			total_wa += waist;
			total_bmi += (weight / ((height / 100.0) * (height / 100.0)));

			this.judge();
		}
		else{
			if(check(ht)==1) System.out.printf("  エラー：身長の値が設定不可なので判定不可\n");
			if(check(wt)==1) System.out.printf("  エラー：体重の値が設定不可なので判定不可\n");
			if(check(wa)==1) System.out.printf("  エラー：腹囲の値が設定不可なので判定不可\n");
		}
	}
	
	private void judge(){
		double bmi = weight / ((height / 100.0) * (height / 100.0));
		if(bmi>=25.0 || waist>=85)
			System.out.printf("  ＢＭＩ=%.1f  腹囲= %.2f   ＊＊＊肥満注意＊＊＊\n", bmi, waist);
		else
			System.out.printf("  ＢＭＩ=%.1f  腹囲= %.2f   ＊＊＊  正常  ＊＊＊\n", bmi, waist);
	}
	
	private int check(double tmp){
		if( tmp > 0.0 && tmp <= 300.0) return 0;
		else return 1;
	}
	
	private double calculate(){
		double sW = 22.0 * (height / 100.0) * (height / 100.0);
		return sW;
	}
}

class Kadai10_2
{
	public static void main(String[] args)
	{
		int    i;
		Measurement_5 student = new Measurement_5 ();
		
		String name[]   = {"Suga", "Kato", "Kouno", "Aso"};
		int    age[]    = {22, 19, 20, 21};
		double height[] = {180.0, 170.0, 160.0, 170.0};
		double weight[] = {80.0, 333.3, 66.6, 70.0};
		double waist[]  = {88.0, 99.9, -50.0, 66.0};
		for ( i = 0 ; i <name.length ; i++ ) {
			System.out.printf("\n学生:student%1d\n", i+1);
			student.show(name[i], age[i], height[i], weight[i], waist[i]);
		}
		System.out.printf("\n");
		student.average();
	}
}
