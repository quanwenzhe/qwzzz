package javaex;
import java.util.Scanner;
/**
 * 
* @ClassName: getString.java
* @Description: ��ȡ�ַ���
*
* @version: v1.0.0
* @author: qwz
* @date: 2018��8��10�� ����10:52:21 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018��8��10��     Vega           v1.0.0               �޸�ԭ��
 */
public class getString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("�������ַ���");
			String str = sc.next();
			System.out.println("������Ҫ��ȡ���ֽ���");
			int num = sc.nextInt();

			byte[] buf = str.getBytes();
			if (num <= buf.length) {
				System.out.println("������ȷ��������ȡ�ַ���");
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
				System.out.println("��ȡ�ɹ�����ȡ����ַ����ǣ�" + out);
				System.out.println();
			} else {
				try {
					throw new MyException("������������ȡ�ֽ��������ַ�������");
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