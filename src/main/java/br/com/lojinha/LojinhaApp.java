package br.com.lojinha;
import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;
import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("F1 2023", Tamanho.TRICAMPEAO);

        meuProduto.setNome ("Mundial de F1");
        meuProduto.setValor (10);
        // meuProduto.setMarca("Fórmula");

        List<String> itensInclusos = new ArrayList<>();
        itensInclusos.add("Brasileiro");
        itensInclusos.add("O Maior do Mundo");
        itensInclusos.add("Morto por Acidente em 1994");
        meuProduto.setItensInclusos(itensInclusos);
    {

        }

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getItensInclusos());
        System.out.println(meuProduto.getItensInclusos().size());

    }
}

