package Servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import Servidor.Interface;

public class Server extends ImpInterface {
  public Server() {}
  public static void main(String args[]) {
    try {
      System.setProperty("java.rmi.server.hostname", "192.168.4.17");

      // Instanciando classe de implementacao
      ImpInterface obj = new ImpInterface();

      // Exporta método remoto para stub
      Interface stub = (Interface) UnicastRemoteObject.exportObject(obj, 0);

      // Vincula o stub no binding
      Registry registro = LocateRegistry.createRegistry(80809);
      registro.bind("Hello", stub);
      
      System.err.println("Servidor pronto!");
    } catch (Exception e) {
      System.out.println(("ERRO no Servidor (Exception): " + e.toString()));
      e.printStackTrace();
    }
  }
}
