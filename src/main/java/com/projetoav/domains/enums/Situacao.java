package com.projetoav.domains.enums;

public enum Situacao {

    LIBERADO(0,"ROLE_LIBERADO"), BLOQUEADO(1,"ROLE)BLOQUEADO");

    private Integer id ;
    private String situacao;
    private Situacao(Integer id, String situacao) {
        this.id = id;
        this.situacao = situacao;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public static Situacao toEnum(Integer id) {
        if (id == null) {
            return null;
        }
        for(Situacao x : Situacao.values()) {
            if (id.equals(x.getId())) {
                return x;
            }
        }
        throw new IllegalArgumentException("cliente inválido!");
    } 


}
