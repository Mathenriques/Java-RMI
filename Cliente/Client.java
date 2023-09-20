import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
  private Client() {}

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Digite o primeiro valor: ");
    Double a = keyboard.nextDouble();
    System.out.println("Digite o segundo valor: ");
    Double b = keyboard.nextDouble();
    System.out.println("Digite o terceiro valor: ");
    Double c = keyboard.nextDouble();

    try {
      Registry registry = LocateRegistry.getRegistry("127.0.0.1", 10833);
      IBhaskara stub = (IBhaskara) Naming.lookup("rmi://127.0.0.1:10833/Bhaskara");
      String result = stub.calcBhaskara(a, b, c);
      System.out.println(result);
      
    } catch (NotBoundException | MalformedURLException | RemoteException e) {
      e.printStackTrace();
    }

  }
}