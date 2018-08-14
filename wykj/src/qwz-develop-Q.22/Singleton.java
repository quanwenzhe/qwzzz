package javaex;
/**
 * 
* @ClassName: Singleton.java
* @Description: 功能描述
*
* @version: v1.0.0
* @author: qwz
* @date: 2018年8月10日 上午10:20:47 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年8月10日     Vega           v1.0.0               修改原因
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
        if (instance == null) instance ＝ new Singleton();
        return instance;
    }
}*/