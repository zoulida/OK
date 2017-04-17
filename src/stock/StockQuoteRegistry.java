package stock;

import java.rmi.*;
public interface StockQuoteRegistry extends Remote{
  public void registerClient(StockQuote client)throws RemoteException;
  public void unregisterClient(StockQuote client)throws RemoteException;
}



