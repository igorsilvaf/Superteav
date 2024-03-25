package com.projetoav.domains;

import java.time.LocalDate;
import java.util.UUID;


public class Faturas {

    private UUID id;
    private Double valorFatura;
   private LocalDate starDate = LocalDate.now();
    private LocalDate endDate;
    public Faturas(UUID id, Double valorFatura) {
        this.id = id;
        this.valorFatura = valorFatura;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Double getValorFatura() {
        return valorFatura;
    }
    public void setValorFatura(Double valorFatura) {
        this.valorFatura = valorFatura;
    }
    public LocalDate getStarDate() {
        return starDate;
    }
    public void setStarDate(LocalDate starDate) {
        this.starDate = starDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
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
        Faturas other = (Faturas) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }


    
}
