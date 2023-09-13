package Servidor;


public class ImpInterface implements Interface {

  @Override
  public String printMsg(String nome) {
    String texto = ("Olá " + nome + ", aqui é do servidor, implementamos RMI!");
    System.out.println(texto);
    return texto;
  }

}
