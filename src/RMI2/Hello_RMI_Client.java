package RMI2;

import java.rmi.Naming;
public class Hello_RMI_Client {
    public static void main(String[] args) {
        try {
            IHello hello = (IHello) Naming.lookup("rmi://localhost:1099/hello");
            
            //long startTime = System.currentTimeMillis();//��ȡ��ǰʱ��
            
            System.out.println(hello.sayHello("SHANDONG JINAN"));
            
            //long endTime = System.currentTimeMillis();
            //System.out.println("��������ʱ�䣺"+(endTime-startTime)+"ms");    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}