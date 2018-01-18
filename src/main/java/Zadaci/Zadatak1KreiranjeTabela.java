package Zadaci;

import Model.Avion;
import Model.Roba;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class Zadatak1KreiranjeTabela {

    public static void main(String[] args) {

        ConnectionSource connectionSource = null;
        try {
            // create our data-source for the database
            connectionSource = new JdbcConnectionSource(Konekcija.DATABASE_URL);

            TableUtils.dropTable(connectionSource, Avion.class, true);
            TableUtils.dropTable(connectionSource, Roba.class, true);


            TableUtils.createTable(connectionSource,Avion.class);
            TableUtils.createTable(connectionSource,Roba.class);

            
    }catch(Exception e) {
            e.printStackTrace();
        }





}

    }
