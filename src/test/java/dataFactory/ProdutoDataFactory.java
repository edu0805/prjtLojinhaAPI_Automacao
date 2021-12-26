package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {

    public static ProdutoPojo criarProdutoComumComOValorIgualA(double valor){
        ProdutoPojo addProduto = new ProdutoPojo();
        addProduto.setProdutoNome("Play Station 5");
        addProduto.setProdutoValor(valor);

        List<String> cores = new ArrayList<>();
        cores.add("Preto");
        cores.add("Branco");
        addProduto.setProdutoCores(cores);

        addProduto.setProdutoUlrMock("");

        List<ComponentePojo> componente = new ArrayList<>();
        ComponentePojo  addComponente1 = new ComponentePojo();
        addComponente1.setComponenteNome("Controle");
        addComponente1.setComponenteQuantidade(1);
        componente.add(addComponente1);

        ComponentePojo addComponente2 = new ComponentePojo();
        addComponente2.setComponenteNome("Fonte de energia");
        addComponente2.setComponenteQuantidade(1);
        componente.add(addComponente2);

        addProduto.setComponentes(componente);
        return addProduto;
    }



}
