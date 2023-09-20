import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IBhaskara extends Remote{
  String calcBhaskara(int a, int b, int c) throws RemoteException;
}
