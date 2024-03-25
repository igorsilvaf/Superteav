package com.projetoav.domains;

import java.util.UUID;

public class Estoque {

    private UUID id;
    private String nome;
    private int quantidade;
    private String codigoBarras;
    public Estoque(UUID id, String nome, int quantidade, String codigoBarras) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.codigoBarras = codigoBarras;
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
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getCodigoBarras() {
        return codigoBarras;
    }
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
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
        Estoque other = (Estoque) obj;
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
