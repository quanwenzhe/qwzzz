package javaex;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 * 
* @ClassName: DirErgodic.java
* @Description: ����ĳ�ļ����µ������ļ�Ŀ¼���ļ� (�ļ��д�����������)
*
* @version: v1.0.0
* @author: qwz
* @date: 2018��8��10�� ����10:21:34 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018��8��10��     Vega           v1.0.0               �޸�ԭ��
 */
public class DirErgodic {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		System.out.print( "�������ļ���·��: " ); 
		String road=sc.next();
        showDirectory(new File(road));
    }

    public static void showDirectory(File f) {
        _walkDirectory(f, 0);
    }

    private static void _walkDirectory(File f, int level) {
        if(f.isDirectory()) {
            for(File temp : f.listFiles()) {
                _walkDirectory(temp, level + 1);
            }
        }
        else {
            for(int i = 0; i < level - 1; i++) {
                System.out.print("\t");
            }
            System.out.println(f.getName());
        }
    }
	}
	
