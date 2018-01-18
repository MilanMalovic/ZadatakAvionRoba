package Zadaci;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

public class Zadatak4BrisanjeVrednosti {

    public static void main(String[] args) {


        ConnectionSource connectionSource = null;
        try {
            // create our data-source for the database
            connectionSource = new JdbcConnectionSource(Konekcija.DATABASE_URL);
        }catch(Exception e) {
            e.printStackTrace();
        }


    }
}
