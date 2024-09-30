import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Banco {
    Map<Conta, Cliente> mapContasClientes;
    private Banco() {
        this.mapContasClientes = new HashMap<>();
    }
    private void adicionarContaCliente(Conta conta, Cliente cliente) {
        mapContasClientes.put(conta, cliente);
    }
    private void exibirContasClientes() {
        System.out.println(mapContasClientes);
    }
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(121, LocalDate.of(2000, 2, 26), "Cliente 1");
        Cliente cliente2 = new Cliente(122, LocalDate.of(2010, 9, 26), "Cliente 2");
        Cliente cliente3 = new Cliente(123, LocalDate.of(1980, 5, 26), "Cliente 3");
        Cliente cliente4 = new Cliente(124, LocalDate.of(1990, 12, 26), "Cliente 4");
        Conta contaCliente1 = new Corrente(cliente1);
        Conta contaCliente2 = new Poupanca(cliente2);
        Conta contaCliente3 = new Corrente(cliente3);
        Conta contaCliente4 = new Poupanca(cliente4);
        Banco BANCODIGITAL = new Banco();
        BANCODIGITAL.adicionarContaCliente(contaCliente4, cliente4);
        BANCODIGITAL.adicionarContaCliente(contaCliente1, cliente1);
        BANCODIGITAL.adicionarContaCliente(contaCliente3, cliente3);
        BANCODIGITAL.adicionarContaCliente(contaCliente2, cliente2);
        contaCliente1.depositar(200);
        contaCliente2.depositar(150);
        contaCliente3.depositar(300);
        contaCliente1.sacar(50);
        contaCliente2.transferir(contaCliente4, 100);
        contaCliente3.transferir(contaCliente4, 15);
        contaCliente1.extrato();
        contaCliente2.extrato();
        contaCliente3.extrato();
        contaCliente4.extrato();
        BANCODIGITAL.exibirContasClientes();
    }
}
