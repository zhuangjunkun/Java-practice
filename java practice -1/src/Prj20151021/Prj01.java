package Prj20151021;

public class Prj01 {

	/**   创建一个父类，在父类中创建两个方法，在子类中覆盖第二个方法，为子类创造一个对象
	 * 将它向上转型到基类并调用这个方法
	 * @param args
	 */
	public void doSomething(){
		System.out.println("父类.doSomething()");
	}
	public void doAnything(){
		System.out.println("父类.doAnything()");
	}
	public static void main(String args[]){
		Prj01 u=new sub();
		u.doSomething();
		u.doAnything();
	}
}
class sub extends Prj01{
	public void doAnything(){
		System.out.println("子类.doAnything()");
	}
	

	

}
