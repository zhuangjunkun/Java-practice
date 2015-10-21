package Prj20151021;


/**创建一个父类，分别创建构造方法，然后向父类和子类添加成员变量和方法
 * 并总结构建子类对象是的顺序
 * 
 * 
 *
 */
public abstract class Prj02 {

	abstract void testAbstract();
	Prj02(){//（1）首先执行父类构造方法
		System.out.println("before testAbstract()");
		testAbstract();//如果调用了抽象方法，调用子类覆盖的方法。这里调用Test类的testAbstract（）方法
		System.out.println("after testAbstarcat()");
	}
	public static void main(String args[]){
		new Atest();
	}
}
class Atest extends Prj02{
	private int i=1;//（2）使成员变量进行初始化
	void testAbstract(){
		System.out.println("testAbstract()"+i);
	}
	public Atest(){//（3）调用子类构造方法
		System.out.println(i);
	}
}
