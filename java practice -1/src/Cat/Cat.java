package Cat;



public class Cat {
	 String furclour;
     double  weight ;
    
//	��Ϊ����
//	���ҽ���
	void sayhello(){
   System.out.println("С"+furclour+"è����Һã�����С"+furclour+"è���ҵ�����"+weight+"���");		
	}
// ����
	void limbtree(){
		if (weight<=5)
			System.out.println("С"+furclour+"è���ٺ٣�������"+weight+"�������������");
		else
			System.out.println("С"+furclour+"è����ѽ��������"+weight+"����ϲ�ȥ");
			
	}
//	����
	void keepfit(){
		weight=weight-0.5;
	      System.out.println("С"+furclour+"è�����������ؼ�������������"+weight+"����");
	}
	void eat(){
		weight=weight+0.7;
		System.out.println("С"+furclour+"è����ѽ����̫�����������ˣ���������"+weight+"����");
	}
	
}
