import java.util.Random;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class RandomDemo {
   
	/**ʹ��Random�������ɸ��������
	 * @param args
	 */
	public static void main(String[] args) {
		Random r=new Random();
		System.out.println("�������һ��������"+r.nextInt());
		System.out.println("�������һ�����ڵ���0С10��������"+r.nextInt(10));
		System.out.println("�������һ�������͵���ֵ��"+r.nextBoolean());
		System.out.println("�������һ��˫���ȵ�ֵ��"+r.nextDouble());
		System.out.println("�������һ�������͵�ֵ��"+r.nextFloat());

	}

}
