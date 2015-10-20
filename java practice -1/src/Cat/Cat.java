package Cat;



public class Cat {
	 String furclour;
     double  weight ;
    
//	行为方法
//	自我介绍
	void sayhello(){
   System.out.println("小"+furclour+"猫：大家好，我是小"+furclour+"猫，我的体重"+weight+"公斤。");		
	}
// 爬树
	void limbtree(){
		if (weight<=5)
			System.out.println("小"+furclour+"猫：嘿嘿，体重是"+weight+"公斤，我爬上树了");
		else
			System.out.println("小"+furclour+"猫：哎呀，体重是"+weight+"公斤，上不去");
			
	}
//	健身
	void keepfit(){
		weight=weight-0.5;
	      System.out.println("小"+furclour+"猫：哈哈，体重减少了现在体重"+weight+"公斤");
	}
	void eat(){
		weight=weight+0.7;
		System.out.println("小"+furclour+"猫：哎呀，吃太多体重增加了，现在体重"+weight+"公斤");
	}
	
}
