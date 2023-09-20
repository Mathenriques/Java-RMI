import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IBhaskara extends Remote{
  String calcBhaskara(double a, double b, double c) throws RemoteException;
}
