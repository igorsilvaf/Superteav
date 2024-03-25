package com.projetoav.domains;

import java.util.UUID;

public class Produto {

    private UUID id;
    private String nome;
    private String codigoBarras;
    private double valorUnitario;
    private int quantidade;
    public Produto(UUID id, String nome, String codigoBarras, double valorUnitario, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.codigoBarras = codigoBarras;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigoBarras() {
        return codigoBarras;
    }
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    public double getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((codigoBarras == null) ? 0 : codigoBarras.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (codigoBarras == null) {
            if (other.codigoBarras != null)
                return false;
        } else if (!codigoBarras.equals(other.codigoBarras))
            return false;
        return true;
    }

    



}
