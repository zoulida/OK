package hello;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

import javax.naming.*;

public class SimpleServer{
  public static void main( String args[] ){
    try{
       HelloService service1 = new HelloServiceImpl("service1");
       HelloService service2 = new HelloServiceImpl("service2");

       //LocateRegistry.createRegistry(1099);
       
       Context namingContext=new InitialContext();
       namingContext.rebind( "rmi:HelloService1", service1 );
       namingContext.rebind( "rmi:HelloService2", service2 );
/*     
       namingContext.rebind( "rmi://localhost:8000/HelloService1", service1 );
       namingContext.rebind( "rmi://localhost:8000/HelloService1", service2 );
*/   
    
       System.out.println( "服务器注册了两个HelloService对象" );
    }catch(Exception e){
       e.printStackTrace();
    } 
  }
}






