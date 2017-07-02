package builder;

import java.sql.Date;

import negocio.Cliente;
import negocio.Produto;
import negocio.Venda;

public class builderVenda {

    protected Cliente nomeCliente;
    protected Date dataVenda;
    protected Produto idProduto;
    protected int quantidade;
    protected double valorTotal;
    protected int idVenda;

    public builderVenda() {

    }

    public Cliente getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(Cliente nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Produto getidProduto() {
        return idProduto;
    }

    public void setidProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Venda construir() {
        return new Venda(nomeCliente, dataVenda, idProduto, quantidade, valorTotal, idVenda);
    }

}
