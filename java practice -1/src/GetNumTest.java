import java.util.Random;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
	public class GetNumTest {

	/** 获取2-32之间的六个偶数，并取得6个偶数的和。
	 * @param args
	 */
	//生成一个随机偶数
	
	public static double GetEvenNum(int num1,int num2){
	  
		double s=0;
		int[]j=new int[6];
		for(int i=0,w=0;i<20;i++){
			
			//给数组随机赋值一个随机数
			
		j[w]=(int)num1+(int)(Math.random()*(num2-num1));
		
			//判断是偶数，输出这个数，相加
		
		if (j[w]!=0&&j[w]%2==0){
		System.out.println("生成2到32的偶数"+j[w]);
		s=s+j[w];
		w++;
			
}
		if(w==6)
		break;
}
		return s;

}
	public static void main(String[] args) {
	
	   System.out.println("随机数之和="+GetEvenNum(2,32));

}

}
