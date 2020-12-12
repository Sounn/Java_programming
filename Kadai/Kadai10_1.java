// 学籍番号:19H081，氏名:久井颯生，課題番号:課題1
//課題１．（１０点）
//課題１のサンプルプログラム
class Figure
{
	private int width;			//横
	private int height;			//縦
	private int depth;			//深さ


	private Figure(){
		width = 0;
		height = 0;
		depth = 0;
	}

	public Figure(int w,int h){
		this(w);
		if(h >= 0){
			height = h;
			System.out.printf("   *** 縦 の長さは適切でフィールド   height = %3d に設定した。   ***\n", height);
		}else{
			System.out.printf("   *** 縦 の長さは不適切でフィールドheight = %3d に初期化しました。   ***\n", height);
		}
	}

	public Figure(int w,int h,int d){
		this(w,h);
		if(d >= 0){
			depth = d;
			System.out.printf("   *** 奥行 の長さは適切でフィールド  depth = %3d に設定した。   ***\n", depth);
		}else{
			System.out.printf("   *** 奥行 の長さは不適切でフィールドdepth = %3d に初期化しました。   ***\n", depth);
		}
	}
	
	public Figure(int w) {
		this();
		if( w >= 0 ){
			width = w;
			System.out.printf("   *** 横 の長さは適切でフィールド   width = %3d に設定した。   ***\n", width);
		}
		else{
			System.out.printf("   *** 横 の長さは不適切でフィールド  width = %3d に初期化した。 ***\n", width);
		}
	}
	
}

class Kadai10_1
{
	public static void main(String[] args)
	{
		int i=0;
		int w[] = { -10,  10,  -10,  10};
		int h[] = {  20, -20,  20,  20};
		int d[] = {  30,  30, -30,  30};
		
		System.out.printf("\n %2dつ目の図形の長さをチェックします。\n", i+1);
		Figure fig_1 = new Figure(w[i]);
		
		i++;
		System.out.printf("\n %2dつ目の図形の長さをチェックします。\n", i+1);
		Figure fig_2 = new Figure(w[i], h[i]);
		
		i++;
		System.out.printf("\n %2dつ目の図形の長さをチェックします。\n", i+1);
		Figure fig_3 = new Figure(w[i], h[i], d[i]);
		
		i++;
		System.out.printf("\n %2dつ目の図形の長さをチェックします。\n", i+1);
		Figure fig_4 = new Figure(w[i], h[i], d[i]);
	}
}

