package RMI;
import java.rmi.Remote; 
import java.rmi.RemoteException; 
public interface IService extends Remote { 
  //�����������˱����ṩ�ķ��� 
  String service(String content) throws RemoteException; 
}