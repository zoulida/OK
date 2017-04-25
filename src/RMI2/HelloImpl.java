package RMI2;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
public class HelloImpl extends UnicastRemoteObject implements IHello {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4717963026829046614L;
	// 这个实现必须有一个显式的构造函数，并且要抛出一个RemoteException异常  
    protected HelloImpl() throws RemoteException {
        super();
    }
    /**
     * 说明清楚此属性的业务含义
     */
    //private static final long serialVersionUID = 4077329331699640331L;
    public String sayHello(String name) throws RemoteException {
        return "Hello " + name + " ^_^ ";
    }
    public static void main(String[] args) {
        try {
            IHello hello = new HelloImpl();
            //java.rmi.Naming.rebind("rmi://localhost:1099/hello", hello);
            LocateRegistry.createRegistry(1099); //加上此程序，就可以不要在控制台上开启RMI的注册程序，1099是RMI服务监视的默认端口
            java.rmi.Naming.rebind("rmi://localhost:1099/hello", hello);
            System.out.print("Ready");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
