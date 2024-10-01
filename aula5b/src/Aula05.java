
public class Aula05 {
    public static void main(String[] args)  {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Rafucks");
        p1.abrirConta("CC");
        p1.depositar(500);
        
        // Exibindo o estado da conta
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("luquinhas");
        p2.abrirConta("CP");
        p2.depositar(88000);
        p2.estadoAtual();


    }
}