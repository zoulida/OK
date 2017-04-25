package RMI;

import java.rmi.RemoteException; 
//UnicastRemoteObject���ڵ�����Զ�̶���ͻ�����Զ�̶���ͨ�ŵĴ���� 
import java.rmi.server.UnicastRemoteObject; 

public class ServiceImpl extends UnicastRemoteObject implements IService { 

		private String name; 
		
		public ServiceImpl(String name) throws RemoteException { 
		  this.name = name; 
		} 
		public String service(String content) { 
		  return "server >> " + content; 
		} 
}