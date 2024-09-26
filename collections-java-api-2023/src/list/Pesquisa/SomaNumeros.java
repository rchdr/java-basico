package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> intList;
    public SomaNumeros() {
        this.intList = new ArrayList<>();
    }
    public void adicionarNumero(int numero) {
        intList.add(numero);
    }
    public Integer calcularSoma() {
        Integer soma = 0;
        if (!intList.isEmpty()) {
            for (Integer i : intList) {
                soma += i;
            }
            return soma;
        } else {
            throw new RuntimeException("Lista vazia!");
        }        
    }
    public Integer encontrarMaiorNumero() {
        Integer maior = Integer.MIN_VALUE;
        if (!intList.isEmpty()) {
            for (Integer i : intList) {
                if (i >= maior) {
                    maior = i;
                }
            }
            return maior;
        } else {
            throw new RuntimeException("Lista vazia!");
        }        
    }
    public Integer encontrarMenorNumero() {
        Integer menor = Integer.MAX_VALUE;
        if (!intList.isEmpty()) {
            for (Integer i : intList) {
                if (i <= menor) {
                    menor = i;
                }
            }
            return menor;
        } else {
            throw new RuntimeException("Lista vazia!");
        }        
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SomaNumeros{");
        sb.append("intList=").append(intList);
        sb.append('}');
        return sb.toString();
    }
    
    public List<Integer> exibirNumeros() {
        return intList;
    }
    public static void main(String[] args) {
        SomaNumeros testeSomaList = new SomaNumeros();
        //testeSomaList.calcularSoma();
        //testeSomaList.encontrarMaiorNumero();
        //testeSomaList.encontrarMenorNumero();
        testeSomaList.adicionarNumero(100);
        testeSomaList.adicionarNumero(171);
        testeSomaList.adicionarNumero(55);
        testeSomaList.adicionarNumero(88);
        testeSomaList.adicionarNumero(0);
        testeSomaList.adicionarNumero(57);
        testeSomaList.adicionarNumero(-8);
        System.out.println(testeSomaList.calcularSoma());
        System.out.println(testeSomaList.encontrarMaiorNumero());
        System.out.println(testeSomaList.encontrarMenorNumero());
        System.out.println(testeSomaList.exibirNumeros());        

    }


}
