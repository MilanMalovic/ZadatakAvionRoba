package Zadaci;

import Model.Avion;
import Model.Roba;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.spring.DaoFactory;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
import com.j256.ormlite.support.ConnectionSource;

import java.util.List;

public class Zadatak3IzmenaVrednosti {

    static Dao<Avion, Integer> avionDao;
    static Dao<Roba, Integer> robaDao;

    public static void main(String[] args) {


        ConnectionSource connectionSource = null;
        try {
            // create our data-source for the database
            connectionSource = new JdbcConnectionSource(Konekcija.DATABASE_URL);

            robaDao = DaoManager.createDao(connectionSource, Roba.class);
            List <Roba> r1 =robaDao.queryForEq(Roba.POLJE_OPIS, "Plasticna stolica");

            if(r1.size()>0) {
                r1.get(0).setOpis("Drvena stolica");

                robaDao.update(r1.get(0));

            }

            List<Roba> robaList = robaDao.queryForAll();
            for(Roba r: robaList){
                System.out.println("Roba = " + r);
            }






        }catch(Exception e) {
            e.printStackTrace();
        }


    }
}
