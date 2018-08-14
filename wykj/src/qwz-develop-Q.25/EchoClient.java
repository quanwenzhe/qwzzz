package Mysocket;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
* @ClassName: EchoClient.java
* @Description: 客户端
*
* @version: v1.0.0
* @author: qwz
* @date: 2018年8月10日 下午4:00:14 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年8月13日     vega           v1.0.0               修改原因
 */
public class EchoClient {

 
    public static void main(String[] args) throws  IOException {
        Socket client=new Socket("localhost",12345);
        System.out.println("客户端连接成功");
        
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(client.getInputStream());
        PrintWriter pw=new PrintWriter(client.getOutputStream());
        
        while( sc.hasNextLine()){
        	
            String response=talk( client.getInetAddress().toString());
            pw.println(response);
            pw.flush();
            if( "exit".equals(response)){
                System.out.println("客户端主动断开与服务器的连接");
                client.close();
                break;
            }
        }
        
        
    }
    
    public static String talk(String client){
        @SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
        System.out.println("请输入内容:");
        String line=sc.nextLine();
        return line;
    }

}