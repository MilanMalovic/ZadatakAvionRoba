package Zadaci;

import Model.Avion;
import Model.Roba;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.PreparedStatement;
import java.util.List;

public class Zadatak4BrisanjeVrednosti {


    static Dao<Avion, Integer> avionDao;
    static Dao<Roba, Integer> robaDao;

    public static void main(String[] args) {


        ConnectionSource connectionSource = null;
        try {
            // create our data-source for the database
            connectionSource = new JdbcConnectionSource(Konekcija.DATABASE_URL);


            robaDao = DaoManager.createDao(connectionSource, Roba.class);


            List<Roba> r1 = robaDao.queryForEq(Roba.POLJE_NAZIV, "Voda");

            robaDao.delete(r1.get(0));

            List<Roba> robaList = robaDao.queryForAll();
            for(Roba r: robaList)
                System.out.println("Roba = " + r);
















        }catch(Exception e) {
            e.printStackTrace();
        }


    }
}
