package dgc;
import java.rmi.*;
import javax.naming.*;

public class SimpleServer1{
  public static void main( String args[] ){
    try{
       System.setProperty("java.rmi.dgc.leaseValue","3000");
       HelloService service = new HelloServiceImpl();
       Context namingContext=new InitialContext();
       namingContext.rebind( "rmi:HelloService", service );
       System.out.println( "������ע����һ��HelloServiceImpl����" );
       
       //�ȴ��ͻ��˻�ø�Զ�̶��������
       while(!service.isAccessed())Thread.sleep(500);
       
       namingContext.unbind( "rmi:HelloService");
       System.out.println( "������ע����һ��HelloServiceImpl����" );
  
    }catch(Exception e){
       e.printStackTrace();
    } 
  }
}




