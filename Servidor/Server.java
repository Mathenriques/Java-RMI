import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
  public static void main(String[] args) {
    try {
      System.setProperty("java.rmi.server.hostname","127.0.0.1");

      Bhaskara bhask = new Bhaskara();
      
      IBhaskara stub = (IBhaskara) UnicastRemoteObject.exportObject(bhask, 0);
      
      Registry registry = LocateRegistry.createRegistry(10833);

      registry.rebind("Bhaskara", stub);

      System.out.println("Servidor Online!");
      
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
