package Prj20151021;

public class Prj01 {

	/**   ����һ�����࣬�ڸ����д��������������������и��ǵڶ���������Ϊ���ഴ��һ������
	 * ��������ת�͵����ಢ�����������
	 * @param args
	 */
	public void doSomething(){
		System.out.println("����.doSomething()");
	}
	public void doAnything(){
		System.out.println("����.doAnything()");
	}
	public static void main(String args[]){
		Prj01 u=new sub();
		u.doSomething();
		u.doAnything();
	}
}
class sub extends Prj01{
	public void doAnything(){
		System.out.println("����.doAnything()");
	}
	

	

}