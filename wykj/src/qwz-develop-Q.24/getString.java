package javaex;
import java.util.Scanner;
/**
 * 
* @ClassName: getString.java
* @Description: 截取字符串
*
* @version: v1.0.0
* @author: qwz
* @date: 2018年8月10日 上午10:52:21 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年8月10日     Vega           v1.0.0               修改原因
 */
public class getString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入字符串");
			String str = sc.next();
			System.out.println("请输入要截取的字节数");
			int num = sc.nextInt();

			byte[] buf = str.getBytes();
			if (num <= buf.length) {
				System.out.println("输入正确，即将截取字符串");
				int times = 0;
				for (int i = 0; i < num; i++) {
					if (buf[i] < 0) {
						times++;
					}
				}
				if (times % 2 == 1) {
					num--;
				}
				String out = new String(buf, 0, num);
				System.out.println("截取成功，截取后的字符串是：" + out);
				System.out.println();
			} else {
				try {
					throw new MyException("输入错误，所需截取字节数大于字符串长度");
				} catch (MyException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}