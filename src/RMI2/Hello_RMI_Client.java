package RMI2;

import java.rmi.Naming;
public class Hello_RMI_Client {
    public static void main(String[] args) {
        try {
            IHello hello = (IHello) Naming.lookup("rmi://localhost:1099/hello");
            
            //long startTime = System.currentTimeMillis();//获取当前时间
            
            System.out.println(hello.sayHello("SHANDONG JINAN"));
            
            //long endTime = System.currentTimeMillis();
            //System.out.println("程序运行时间："+(endTime-startTime)+"ms");    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}