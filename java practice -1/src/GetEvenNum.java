/**
 * 
 */

/**
 * @author Administrator
 *
 */
	public class GetEvenNum {

	/** 定义产生偶数的方法
	 * @param num1 起始范围参数
	 * @param num2 结束范围参数
	 * @return 随机的范围内偶数
	 */
	public static int GetEvenNum(double num1,double num2) {
		int s=(int)num1+(int)(Math.random()*(num2-num1));
		
		if(s%2==0){   // 判断是否为偶数
			return s;
				}
		else 
			return s+1;
	}
	
	public static void main(String[] args) {
		
		System.out.println("输出6个2-32之间的随机偶数");
		
	   for(int i=0;i<6;i++){
			System.out.print(GetEvenNum(2, 32));
			System.out.print(" ");
			
	   }
	}

}
