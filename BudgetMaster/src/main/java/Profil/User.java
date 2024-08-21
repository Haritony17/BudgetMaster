package Profil;

import Depense.Depense;

import java.util.ArrayList;

public class User {
    private int id;
    private String Username;
    private double budgetMensuel;
    private ArrayList<Depense> depense;
    public User(String username, double budgetMensuel, ArrayList<Depense> depense) {
        this.Username = username;
        this.budgetMensuel = budgetMensuel;
        this.depense = depense;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public double getBudgetMensuel() {
        return budgetMensuel;
    }

    public void setBudgetMensuel(double budgetMensuel) {
        this.budgetMensuel = budgetMensuel;
    }

    public ArrayList<Depense> getDepense() {
        return depense;
    }

    public void setDepense(ArrayList<Depense> depense) {
        this.depense = depense;
    }
    public void addDepense(Depense depense) {
        this.depense.add(depense);
        System.out.println(depense+"est ajouter dans la liste");

    }
    public void voirDepense(Depense depense) {

    }
}
