package Mysocket;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
/**
 * 
* @ClassName: SocketServers.java
* @Description: �����
*
* @version: v1.0.0
* @author: qwz
* @date: 2018��8��10�� ����3:59:44 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018��8��13��     Vega           v1.0.0               �޸�ԭ��
 */
public class SocketServers {
    @SuppressWarnings("resource")
	public static void main(String [] args) throws IOException{
        ServerSocket ss=new ServerSocket(12345);
        System.out.println("��������ַ��"+ss.getInetAddress());
        
        Scanner sc=null;
        PrintWriter pw=null;
        
        while(true){
            Socket s=ss.accept();
            System.out.println("��һ���˿����ӳɹ�"+s.getInetAddress());
            
            sc=new Scanner(s.getInputStream());
            pw=new PrintWriter(s.getOutputStream());
        
            do{
            	pw.println();
                pw.flush();
                if(sc.hasNextLine()){
                    System.out.println("�ͻ��˷�����Ϣ:"+sc.nextLine());
                }
                
            }while(true);
        }
    
    }
}