/**
 * 
 */

/**
 * @author Administrator
 *
 */
	public class GetEvenNum {

	/** �������ż���ķ���
	 * @param num1 ��ʼ��Χ����
	 * @param num2 ������Χ����
	 * @return ����ķ�Χ��ż��
	 */
	public static int GetEvenNum(double num1,double num2) {
		int s=(int)num1+(int)(Math.random()*(num2-num1));
		
		if(s%2==0){   // �ж��Ƿ�Ϊż��
			return s;
				}
		else 
			return s+1;
	}
	
	public static void main(String[] args) {
		
		System.out.println("���6��2-32֮������ż��");
		
	   for(int i=0;i<6;i++){
			System.out.print(GetEvenNum(2, 32));
			System.out.print(" ");
			
	   }
	}

}
