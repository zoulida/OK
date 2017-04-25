package RMI;

import javax.naming.Context; 
import javax.naming.InitialContext; 

public class Client { 
  public static void main(String[] args) { 
    String url = "rmi://localhost/"; 
    try { 
      Context namingContext = new InitialContext(); 
      // ����ָ���Ķ��� ���ҵ������������Ӧ�ķ�������� 
      IService service02 = (IService) namingContext.lookup(url 
          + "service02"); 
      Class stubClass = service02.getClass(); 
      System.out.println(service02 + " �� " + stubClass.getName() 
          + " ��ʵ����"); 
      // ��ñ��״����ʵ�ֵĽӿ����� 
      Class[] interfaces = stubClass.getInterfaces(); 
      for (Class c : interfaces) { 
        System.out.println("�����ʵ���� " + c.getName() + " �ӿڣ�"); 
      } 
      System.out.println(service02.service("��ã�")); 
    } catch (Exception e) { 
      e.printStackTrace(); 
    } 
  } 
}