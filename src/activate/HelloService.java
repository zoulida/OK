package activate;
import java.util.Date;
import java.rmi.*;
public interface HelloService extends Remote{
  public String echo(String msg) throws RemoteException;
  public Date getTime() throws RemoteException;
} 


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java�����̾���>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
