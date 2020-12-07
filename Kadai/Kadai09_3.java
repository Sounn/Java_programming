// 学籍番号:19H081，氏名:久井颯生，課題番号:課題3
//課題３．（１０点）
//課題３のサンプルプログラム

class Figure
{
	private double width;			//横
	private double height;			//縦
	private double depth;	//奥行
	private double volume;	//体積
			//不足箇所を追加しなさい
	private double square;			//面積
			//不足箇所を追加しなさい

	public int setLength(int w)
	{
		if( w >= 0 ){
			width = (double)w;
			return 0;
		}
		else{
			System.out.printf("*** 横 " +w+ " が不適切なので設定できませんでした。 ***");
			return 1;
		}
	}
	public int setLength(int w, int h)
	{
		if( this.setLength(w) == 0  && h >= 0 ){
			height = (double)h;
			return 0;
		}
		else{
			if( h < 0) System.out.printf("*** 縦 " +h+ " が不適切なので設定できませんでした。 ***");
			return 1;
		}
	}
	public int setLength(int w, int h, int d)
	{
		if( this.setLength(w,h) == 0  && d >= 0 ){
			depth = (double)d;
			return 0;
		}
		else{
			if( d < 0) System.out.printf("*** 奥行 " +d+ " が不適切なので設定できませんでした。 ***");
			return 1;
		}
	}

	public double getVolume(){	//体積の計算
		volume = getArea() * depth;
		return volume;
	}

	public double getArea() {			//面積を計算
		square = width * height;
		return square;
	}
}

class Kadai09_3
{
	public static void main(String[] args)
	{
		Figure fig = new Figure();
		int i;
		int w[] = { -10,  10,  10,  10};
		int h[] = {  20, -20,  20,  20};
		int d[] = { 30, 30, -30, 30};

		for ( i = 0 ; i <w.length ; i++ ) {
			System.out.printf("\n %2dつ目の図形の面積を求めます。\n", i+1);
			if(fig.setLength(w[i], h[i]) == 0)
				System.out.printf("面積は%.2fです。",fig.getArea());

			System.out.printf("\n %2dつ目の図形の体積を求めます。\n", i+1);
			if(fig.setLength(w[i], h[i], d[i]) == 0)
				System.out.printf("体積は%.2fです。",fig.getVolume());
			System.out.printf("\n");
		}
	}
}

