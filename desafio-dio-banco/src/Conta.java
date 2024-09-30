
import java.time.LocalDate;

public abstract class Conta {
    private final static int AGENCIA = 1;
    private static int SEQUENCIAL = 1;
    private int numero;
    private int agencia;
    private double saldo;
    Cliente titular;
    protected String tipo;

    public Conta(Cliente titular) {
        this.numero = SEQUENCIAL++;
        this.agencia = AGENCIA;
        this.titular = titular;
    }
    public void sacar(double valorSaque) {
        this.saldo -= valorSaque;
        System.out.println(titular.getNome() + ", você sacou: " + valorSaque + "R$");
    }
    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
        System.out.println(titular.getNome() + ", você depositou: " + valorDeposito + "R$");
    }
    public void transferir(Conta contaDestinoTransferencia, double valorTransferencia) {
        this.saldo -= valorTransferencia;
        contaDestinoTransferencia.saldo += valorTransferencia;
        System.out.println(this.titular.getNome() + ", você transferiu " + valorTransferencia + "R$ para " + contaDestinoTransferencia.titular.getNome()+ " " + contaDestinoTransferencia);
    }
    public void extrato() {
        System.out.println("Extrato do dia: " + LocalDate.now());
        System.out.println("Titular: " + titular.getNome());
        System.out.println(this.tipo);
        System.out.println("Conta: " + this.numero + " Agência: " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
    }
    @Override
    public String toString() {
        return "[NÚMERO: " + numero + ", AGÊNCIA: " + agencia + "] ";
    }
    

    
}
