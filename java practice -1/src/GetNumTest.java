import java.util.Random;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
	public class GetNumTest {

	/** ��ȡ2-32֮�������ż������ȡ��6��ż���ĺ͡�
	 * @param args
	 */
	//����һ�����ż��
	
	public static double GetEvenNum(int num1,int num2){
	  
		double s=0;
		int[]j=new int[6];
		for(int i=0,w=0;i<20;i++){
			
			//�����������ֵһ�������
			
		j[w]=(int)num1+(int)(Math.random()*(num2-num1));
		
			//�ж���ż�����������������
		
		if (j[w]!=0&&j[w]%2==0){
		System.out.println("����2��32��ż��"+j[w]);
		s=s+j[w];
		w++;
			
}
		if(w==6)
		break;
}
		return s;

}
	public static void main(String[] args) {
	
	   System.out.println("�����֮��="+GetEvenNum(2,32));

}

}
