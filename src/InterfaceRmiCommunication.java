



import java.rmi.*;

public interface InterfaceRmiCommunication extends Remote 
{
    Integer getSuma(int num1, int num2) throws RemoteException; 
    public Integer getResta(int num1, int num2)throws RemoteException;

    public Integer getMultiplicacion(int num1, int num2)throws RemoteException;

    public Integer getDivision(int num1, int num2)throws RemoteException;

    public Integer getPotencia(int num1, int num2)throws RemoteException;
     public Integer getAreaTriangulo(int num1, int num2)throws RemoteException;
}
