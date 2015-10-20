import java.util.Random;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class RandomDemo {
   
	/**使用Random对象生成各种随机数
	 * @param args
	 */
	public static void main(String[] args) {
		Random r=new Random();
		System.out.println("随机生成一个整数："+r.nextInt());
		System.out.println("随机生成一个大于等于0小10的整数："+r.nextInt(10));
		System.out.println("随机生成一个布尔型的数值："+r.nextBoolean());
		System.out.println("随机生成一个双精度的值："+r.nextDouble());
		System.out.println("随机生成一个浮点型的值："+r.nextFloat());

	}

}
