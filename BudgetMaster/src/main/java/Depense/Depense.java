package Depense;

import java.time.LocalDate;

public enum Depense {
    ;
    private String description;
  private double montant;
  private String categorie;
  private LocalDate date;
  private Depense(String description, double montant, String categorie, LocalDate date) {
      this.description = description;
      this.montant = montant;
      this.categorie = categorie;
      this.date = date;
  }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

