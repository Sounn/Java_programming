//課題２．（１０点）
//課題２のサンプルプログラム

class Measurement_4
{
//	String		name;					//名前
//	int			age;						//年齢
//	double		height;					//身長
//	double		weight;					//体重
//	double		waist;					//腹囲
//	double		standardWeight;			//標準体重

	double calculate(double height)			//この行をコメントにしなさい
//	private  double calculate()						//この行のコメントを外しなさい
	{
		double sW = 22.0 * (height / 100.0) * (height / 100.0);
		return sW;
	}
	void show(String name, int age, double height, double weight, double waist)		//この行をコメントにしなさい
//	public void show(String na, int ag, double ht, double wt, double wa)			//この行のコメントを外しなさい
	{
		double	standardWeight =  this.calculate(height); 				// "this."が無くても可

		System.out.printf("名前： %s\t", name);
		System.out.printf("年齢： %d 歳\t", age);
		System.out.printf("身長： %.2f cm\t", height);
		System.out.printf("体重： %.2f kg\t", weight);
		System.out.printf("腹囲： %.2f cm\n", waist);
		System.out.printf("標準体重は %8.3f kgです。\n", standardWeight);
		System.out.printf("(体重―標準体重)は%8.3f kgです。\n", (weight-standardWeight));
		
		this.judge(height, weight, waist);
	}
	void judge(double height, double weight, double waist)		//この行をコメントにしなさい
//	private void judge()										//この行のコメントを外しなさい
	{
		double bmi = weight / ((height / 100.0) * (height / 100.0));
		if(bmi>=25.0 || waist>=85)
			System.out.printf("ＢＭＩ=%.1f  腹囲= %.2f ＊＊＊肥満注意＊＊＊\n", bmi, waist);
		else
			System.out.printf("ＢＭＩ=%.1f  腹囲= %.2f ＊＊＊  正常  ＊＊＊\n", bmi, waist);
	}
}
class Kadai09_2_sample
{
	public static void main(String[] args)
	{
		int    i;
		Measurement_4 student = new Measurement_4 ();
		
		String name[]   = {"Suga", "Kato", "Kouno", "Aso"};
		int    age[]    = {22, 19, 20, 21};
		double height[] = {-180.0, 170.0, 360.0, 177.7};
		double weight[] = {88.8, 333.3, 66.6, 77.7};
		double waist[]  = {88.8, 99.9, -50.0, 77.7};

		for ( i = 0 ; i <name.length ; i++ ) {
			System.out.printf("\n学生:student%1d\n", i+1);
			student.show(name[i], age[i], height[i], weight[i], waist[i]);
		}
	}
}

