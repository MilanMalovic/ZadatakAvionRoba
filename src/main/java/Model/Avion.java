package Model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import javax.annotation.Generated;

@DatabaseTable(tableName = "avion")

public class Avion {

public static final String POLJE_OZNAKA = "oznaka";
public static final String POLJE_RASPONKRILA = "rasponKrila";



   @DatabaseField(generatedId = true)
    private int id;


@DatabaseField(columnName = POLJE_OZNAKA)
    private String oznaka;


@DatabaseField(columnName = POLJE_RASPONKRILA)
    private int rasponKrila;


    @ForeignCollectionField(foreignFieldName = "avion", eager = false, maxEagerLevel = 1)
    private ForeignCollection<Roba> roba;



    public Avion() {
    }

    public Avion(String oznaka, int rasponKrila) {
        this.id = id;
        this.oznaka = oznaka;
        this.rasponKrila = rasponKrila;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public int getRasponKrila() {
        return rasponKrila;
    }

    public void setRasponKrila(int rasponKrila) {
        this.rasponKrila = rasponKrila;
    }
}
