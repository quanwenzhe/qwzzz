package Mysocket;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
/**
 * 
* @ClassName: SocketServers.java
* @Description: 服务端
*
* @version: v1.0.0
* @author: qwz
* @date: 2018年8月10日 下午3:59:44 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年8月13日     Vega           v1.0.0               修改原因
 */
public class SocketServers {
    @SuppressWarnings("resource")
	public static void main(String [] args) throws IOException{
        ServerSocket ss=new ServerSocket(12345);
        System.out.println("服务器地址："+ss.getInetAddress());
        
        Scanner sc=null;
        PrintWriter pw=null;
        
        while(true){
            Socket s=ss.accept();
            System.out.println("有一个端口连接成功"+s.getInetAddress());
            
            sc=new Scanner(s.getInputStream());
            pw=new PrintWriter(s.getOutputStream());
        
            do{
            	pw.println();
                pw.flush();
                if(sc.hasNextLine()){
                    System.out.println("客户端发送消息:"+sc.nextLine());
                }
                
            }while(true);
        }
    
    }
}