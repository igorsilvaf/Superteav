package com.projetoav.domains;

import java.time.LocalDate;
import java.util.UUID;

import com.projetoav.domains.enums.Situacao;

public class Cliente {


    protected UUID id;
    protected String nome;
    protected String cpf;
    protected LocalDate createAT = LocalDate.now();
    protected Situacao situacao;
    public Cliente(UUID id, String nome, String cpf, LocalDate createAT, Situacao situacao) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.createAT = createAT;
        this.situacao = situacao;
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
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getCreateAT() {
        return createAT;
    }
    public void setCreateAT(LocalDate createAT) {
        this.createAT = createAT;
    }
    public Situacao getSituacao() {
        return situacao;
    }
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
        Cliente other = (Cliente) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }

    
    

}
