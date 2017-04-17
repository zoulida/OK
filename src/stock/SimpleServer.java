package stock;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

import javax.naming.*;

public class SimpleServer{
  public static void main( String args[] ){
    try{
       StockQuoteRegistryImpl registry=new StockQuoteRegistryImpl();
 
       LocateRegistry.createRegistry(1099);
       
       Context namingContext=new InitialContext();
       namingContext.rebind( "rmi:StockQuoteRegistry", registry);
       System.out.println( "服务器注册了一个StockQuoteRegistry对象" );

       new Thread(registry).start();
    }catch(Exception e){
       e.printStackTrace();
    } 
  }
}






