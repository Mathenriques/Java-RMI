import java.rmi.RemoteException;

public class Bhaskara implements IBhaskara {

  protected Bhaskara() throws RemoteException {
    super();
  }

  public String calcBhaskara(int a, int b, int c) throws RemoteException {

    double raizDelta = calcRaizDelta(a, b, c);

    double valor1 = (-b + raizDelta)/(2*a);
    double valor2 = (-b - raizDelta)/(2*a);

    return "Os valores de bhaskara sao: valor1 = " + valor1 + ", valor2 = " + valor2 + " .";
  }

  private Double calcRaizDelta(int a, int b, int c) {
    Double raizDelta = Math.sqrt((b*b) - 4*a*c);

    return raizDelta;
  }
}
