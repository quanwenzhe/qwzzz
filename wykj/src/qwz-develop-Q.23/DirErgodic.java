package javaex;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 * 
* @ClassName: DirErgodic.java
* @Description: 遍历某文件夹下的所有文件目录及文件 (文件夹从命令行输入)
*
* @version: v1.0.0
* @author: qwz
* @date: 2018年8月10日 上午10:21:34 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年8月10日     Vega           v1.0.0               修改原因
 */
public class DirErgodic {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		System.out.print( "请输入文件夹路径: " ); 
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
	
