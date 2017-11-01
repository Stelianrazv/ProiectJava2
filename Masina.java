package com.Inmatriculare.Auto;

import java.sql.SQLException;
import java.sql.Statement;

public class Masina {
    int id;
    String Prenume;
    String Nume;
    String Judet;
    String Marca;
    String Model;
    int An;

    public Masina (int id, String Prenume, String Nume, String Judet, String Marca, String Model, String An) {
        this.id = id;
        this.Prenume = Prenume;
        this.Nume = Nume;
        this.Judet = Judet;
        this.Marca = Marca;
        this.Model = Model;
        this.An = Integer.parseInt(An);
    }

    public void saveMasina(Statement myStmt) {
        String insertDb = "insert into masina"
                + "(id,prenume,nume,judet,marca,model,an)"
                + "values ("
                + this.id + ", '" + this.Prenume + "','" +
                this.Nume + "', '" + this.Judet + "', '" + this.Marca + "', '" + this.Model + "', " + this.An  +")";
        try {
            myStmt.executeUpdate(insertDb);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
