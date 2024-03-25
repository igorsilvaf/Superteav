package com.projetoav.domains;

import java.util.UUID;

public class Relatorios {
private UUID id;
private double vendasAvista;
private double vendasPrazo;
private double vendasTotal;
private String ProdutosVendidos;
private int quantidadeVendida;
public Relatorios(UUID id, double vendasAvista, double vendasPrazo, double vendasTotal, String produtosVendidos,
        int quantidadeVendida) {
    this.id = id;
    this.vendasAvista = vendasAvista;
    this.vendasPrazo = vendasPrazo;
    this.vendasTotal = vendasTotal;
    ProdutosVendidos = produtosVendidos;
    this.quantidadeVendida = quantidadeVendida;
}
public UUID getId() {
    return id;
}
public void setId(UUID id) {
    this.id = id;
}
public double getVendasAvista() {
    return vendasAvista;
}
public void setVendasAvista(double vendasAvista) {
    this.vendasAvista = vendasAvista;
}
public double getVendasPrazo() {
    return vendasPrazo;
}
public void setVendasPrazo(double vendasPrazo) {
    this.vendasPrazo = vendasPrazo;
}
public double getVendasTotal() {
    return vendasTotal;
}
public void setVendasTotal(double vendasTotal) {
    this.vendasTotal = vendasTotal;
}
public String getProdutosVendidos() {
    return ProdutosVendidos;
}
public void setProdutosVendidos(String produtosVendidos) {
    ProdutosVendidos = produtosVendidos;
}
public int getQuantidadeVendida() {
    return quantidadeVendida;
}
public void setQuantidadeVendida(int quantidadeVendida) {
    this.quantidadeVendida = quantidadeVendida;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
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
    Relatorios other = (Relatorios) obj;
    if (id == null) {
        if (other.id != null)
            return false;
    } else if (!id.equals(other.id))
        return false;
    return true;
}



}
