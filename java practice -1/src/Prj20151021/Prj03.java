/**
 * 
 */
package Prj20151021;

/**
 * 编写匿名内部类
 *
 */
public class Prj03 {

}
class OuterClass4{

	public OutInterface doit(final String s){
		return new OutInterface(){
			private int i=0;
			public int getValue(){
				System.out.println(s);
				return i;
				
			}
			public void f(){
				System.out.println("f()");
			}
		};
	}

}
interface OutInterface { // 定义一个接口
}
