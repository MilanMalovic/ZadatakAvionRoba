package Zadaci;

import Model.Avion;
import Model.Roba;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.util.List;


public class Zadatak2DodavanjeVrednosti {

    static Dao <Avion, Integer> avionIntegerDao ;
    static Dao <Roba, Integer> robaIntegerDao;

    public static void main(String[] args) {


        ConnectionSource connectionSource = null;
        try {
            // create our data-source for the database
            connectionSource = new JdbcConnectionSource(Konekcija.DATABASE_URL);

            avionIntegerDao = DaoManager.createDao(connectionSource, Avion.class);
            robaIntegerDao = DaoManager.createDao(connectionSource, Roba.class);

            TableUtils.clearTable(connectionSource, Avion.class);
            TableUtils.clearTable(connectionSource, Roba.class);

            Avion a1 = new Avion("Avion1", 34);
            avionIntegerDao.create(a1);
            Avion a2 = new Avion("Avion2", 21);
            avionIntegerDao.create(a2);


            Roba r1 = new Roba("patike", "duboke patike", 1);
            r1.setAvion(a1);
            robaIntegerDao.create(r1);

            Roba r2 = new Roba ("kosulja", "na duge rukave", 0.4);
            r2.setAvion(a1);
            robaIntegerDao.create(r2);

            Roba r3 = new Roba ("Voda", "Voda za pice", 1.4);
            r3.setAvion(a1);
            robaIntegerDao.create(r3);

            Roba r4 = new Roba ("Ploce", "Drvene ploce", 3.4);
            r4.setAvion(a2);
            robaIntegerDao.create(r4);

            Roba r5 = new Roba ("Stolica", "Plasticna stolica", 2.4);
            r5.setAvion(a2);
            robaIntegerDao.create(r5);

            List<Avion> avionList = avionIntegerDao.queryForAll();
                for(Avion a: avionList){
                    System.out.println("Avion = " + a);
                }

            List<Roba> robaList = robaIntegerDao.queryForAll();
                for(Roba r: robaList){
                    System.out.println("Roba = " + r);
                }













        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}
