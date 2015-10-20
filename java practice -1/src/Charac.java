
public class Charac {
    public static void main(String[] args) {
		String str=Integer.toString(456);
		String str2=Integer.toBinaryString(456);
		String str3=Integer.toHexString(456);
		String str4=Integer.toOctalString(456);
		System.out.println("十进制表示："+str);
		System.out.println("二进制表示："+str2);
		System.out.println("十六进制表示："+str3);
		System.out.println("八进制表示："+str4);
	}
}
