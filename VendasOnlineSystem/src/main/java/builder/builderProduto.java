package builder;

import negocio.Produto;

public class builderProduto {

    private String nomeProduto;
    private int idProduto;
    private double precoProduto;

    public builderProduto() {

    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getidProduto() {
        return idProduto;
    }

    public void setidProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Produto construir() {
        return new Produto(nomeProduto, idProduto, precoProduto);
    }
}
