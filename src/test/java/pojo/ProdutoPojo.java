package pojo;

import java.util.List;

public class ProdutoPojo {

    private String produtoNome;
    private List<String> produtoCores;
    private double produtoValor;
    private String produtoUlrMock;
    private List<ComponentePojo> componentes;

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public List<String> getProdutoCores() {
        return produtoCores;
    }

    public void setProdutoCores(List<String> produtoCores) {
        this.produtoCores = produtoCores;
    }

    public double getProdutoValor() {
        return produtoValor;
    }

    public void setProdutoValor(double produtoValor) {
        this.produtoValor = produtoValor;
    }

    public String getProdutoUlrMock() {
        return produtoUlrMock;
    }

    public void setProdutoUlrMock(String produtoUlrMock) {
        this.produtoUlrMock = produtoUlrMock;
    }

    public List<ComponentePojo> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<ComponentePojo> componentes) {
        this.componentes = componentes;
    }
}
