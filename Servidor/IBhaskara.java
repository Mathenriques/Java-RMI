import java.rmi.RemoteException;

public interface IBhaskara {
  String calcBhaskara(int a, int b, int c) throws RemoteException;
}
