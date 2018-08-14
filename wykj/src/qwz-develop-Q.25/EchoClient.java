package Mysocket;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
* @ClassName: EchoClient.java
* @Description: �ͻ���
*
* @version: v1.0.0
* @author: qwz
* @date: 2018��8��10�� ����4:00:14 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018��8��13��     vega           v1.0.0               �޸�ԭ��
 */
public class EchoClient {

 
    public static void main(String[] args) throws  IOException {
        Socket client=new Socket("localhost",12345);
        System.out.println("�ͻ������ӳɹ�");
        
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(client.getInputStream());
        PrintWriter pw=new PrintWriter(client.getOutputStream());
        
        while( sc.hasNextLine()){
        	
            String response=talk( client.getInetAddress().toString());
            pw.println(response);
            pw.flush();
            if( "exit".equals(response)){
                System.out.println("�ͻ��������Ͽ��������������");
                client.close();
                break;
            }
        }
        
        
    }
    
    public static String talk(String client){
        @SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
        System.out.println("����������:");
        String line=sc.nextLine();
        return line;
    }

}