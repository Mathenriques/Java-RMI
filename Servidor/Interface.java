package Servidor;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {
  public String printMsg(String a) throws RemoteException;
}