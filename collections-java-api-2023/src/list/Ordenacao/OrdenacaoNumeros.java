package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> intList;
    public OrdenacaoNumeros() {
        this.intList = new ArrayList<>();
    }
    public void adicionarNumero(int numero) {
        this.intList.add(numero);
    }
    public List<Integer> ordenarAscendente() {
        List<Integer> ascenList = new ArrayList<>(intList);
        if (!intList.isEmpty()) {
            Collections.sort(ascenList);
            return ascenList;
        } else {
            throw new RuntimeException("Lista vazia!");
    }

    }
    public List<Integer> ordenarDescendente() {
        List<Integer> descList = new ArrayList<>(intList);
        if (!intList.isEmpty()) {
            descList.sort(Collections.reverseOrder());
            return descList;
          } else {
            throw new RuntimeException("Lista vazia!");
          }
    } 
    public List<Integer> exibirLista() {
        if(!intList.isEmpty()) {
            return intList;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }
    public static void main(String[] args) {
        OrdenacaoNumeros testOrdenacaoNumeros = new OrdenacaoNumeros();
        //testOrdenacaoNumeros.ordenarAscendente();
        //testOrdenacaoNumeros.ordenarDescendente();
        //testOrdenacaoNumeros.exibirLista();
        testOrdenacaoNumeros.adicionarNumero(5);
        testOrdenacaoNumeros.adicionarNumero(17);
        testOrdenacaoNumeros.adicionarNumero(32);
        testOrdenacaoNumeros.adicionarNumero(1435);
        testOrdenacaoNumeros.adicionarNumero(34);
        testOrdenacaoNumeros.adicionarNumero(33334);
        testOrdenacaoNumeros.adicionarNumero(33);
        testOrdenacaoNumeros.adicionarNumero(4);
        testOrdenacaoNumeros.adicionarNumero(78);
        testOrdenacaoNumeros.adicionarNumero(67);
        testOrdenacaoNumeros.adicionarNumero(7);
        System.out.println(testOrdenacaoNumeros.ordenarAscendente());
        System.out.println(testOrdenacaoNumeros.ordenarDescendente());
        System.out.println(testOrdenacaoNumeros.exibirLista());
    }
}

