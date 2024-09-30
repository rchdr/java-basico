public class Poupanca extends Conta {

    public Poupanca(Cliente titular) {
        super(titular);
        super.tipo = "Conta Poupança";
    }

}
