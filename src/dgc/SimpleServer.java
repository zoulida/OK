package dgc;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

import javax.naming.*;

public class SimpleServer{
  public static void main( String args[] ){
    try{
       System.setProperty("java.rmi.dgc.leaseValue","3000");
       HelloService service = new HelloServiceImpl();
       
       LocateRegistry.createRegistry(1099);
       
       Context namingContext=new InitialContext();
       namingContext.rebind( "rmi:HelloService", service );
       System.out.println( "服务器注册了一个HelloServiceImpl对象" );
      
       Thread.sleep(1000);
       
       namingContext.unbind( "rmi:HelloService");
       System.out.println( "服务器注销了一个HelloServiceImpl对象" );
  
    }catch(Exception e){
       e.printStackTrace();
    } 
  }
}






