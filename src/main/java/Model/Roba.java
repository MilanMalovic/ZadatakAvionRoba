package Model;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "roba")


public class Roba {

 private int id;
 private String naziv;
 private String opis;
 private double tezina;


 public static final String POLJE_NAZIV = "naziv";
 public static final String POLJE_OPIS = "opis";
 public static final String POLJE_TEZINA = "tezina";




}
