package com.i2i.evrencell;
import com.i2i.evrencell.oracle.dbHelper;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        dbHelper db = new dbHelper();

        db.connect();
    }
}