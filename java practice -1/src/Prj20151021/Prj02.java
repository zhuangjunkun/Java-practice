package Prj20151021;


/**����һ�����࣬�ֱ𴴽����췽����Ȼ�������������ӳ�Ա�����ͷ���
 * ���ܽṹ����������ǵ�˳��
 * 
 * 
 *
 */
public abstract class Prj02 {

	abstract void testAbstract();
	Prj02(){//��1������ִ�и��๹�췽��
		System.out.println("before testAbstract()");
		testAbstract();//��������˳��󷽷����������า�ǵķ������������Test���testAbstract��������
		System.out.println("after testAbstarcat()");
	}
	public static void main(String args[]){
		new Atest();
	}
}
class Atest extends Prj02{
	private int i=1;//��2��ʹ��Ա�������г�ʼ��
	void testAbstract(){
		System.out.println("testAbstract()"+i);
	}
	public Atest(){//��3���������๹�췽��
		System.out.println(i);
	}
}
