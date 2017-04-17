package sync;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

import javax.naming.*;

public class SimpleServer{
  public static void main( String args[] ){
    try{
       Stack stack = new StackImpl("a stack");

       LocateRegistry.createRegistry(1099);
       
       Context namingContext=new InitialContext();
       namingContext.rebind( "rmi:MyStack", stack );
        
       System.out.println( "������ע����һ��Stack����" );
    }catch(Exception e){
       e.printStackTrace();
    } 
  }
}






