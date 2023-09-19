import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {
  private Client() {}

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Digite o primeiro valor: ");
    int a = keyboard.nextInt();
    System.out.println("Digite o segundo valor: ");
    int b = keyboard.nextInt();
    System.out.println("Digite o terceiro valor: ");
    int c = keyboard.nextInt();

    try {
      IBhaskara stub = (IBhaskara) Naming.lookup("rmi://localhost:1079/Bhaskara");
      String result = stub.calcBhaskara(a, b, c);
      System.out.println(result);
      
    } catch (NotBoundException | MalformedURLException | RemoteException e) {
      e.printStackTrace();
    }

  }
}