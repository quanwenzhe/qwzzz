package javaex;
/**
 * 
* @ClassName: Singleton.java
* @Description: ��������
*
* @version: v1.0.0
* @author: qwz
* @date: 2018��8��10�� ����10:20:47 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018��8��10��     Vega           v1.0.0               �޸�ԭ��
 */
public class Singleton {

	private static Singleton sgt;

	private Singleton() {}

	public static Singleton getSigleton() {
		if (sgt == null)
			sgt = new Singleton();
		return sgt;
	}
}













/*public class Singleton {
    private static Singleton instance = null;
    private Singleton() {}
    public static synchronized Singleton getInstance(){
        if (instance == null) instance �� new Singleton();
        return instance;
    }
}*/