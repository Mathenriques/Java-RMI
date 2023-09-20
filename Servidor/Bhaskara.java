import java.rmi.RemoteException;

public class Bhaskara implements IBhaskara {

  protected Bhaskara() throws RemoteException {
    super();
  }

  public String calcBhaskara(double a, double b, double c) throws RemoteException {

    double raizDelta = calcRaizDelta(a, b, c);

    if (Double.isNaN(raizDelta)) {
      return "Delta negativo, informe outros números";
    }

    double valor1 = ((-(b) + raizDelta)/(2*a));
    double valor2 = ((-(b) - raizDelta)/(2*a));

    return "Os valores de bhaskara sao: valor1 = " + valor1 + ", valor2 = " + valor2 + " .";
  }

  private Double calcRaizDelta(double a, double b, double c) {
    Double delta = (b*b) + (-4*(a*c));

    Double raizDelta = Math.sqrt(delta);

    return raizDelta;
  }
}
