package kln.se.ass2.mysqlrepostery;

import java.sql.Connection;
import java.sql.SQLException;

public interface Connect {
     static Connection getConnection() throws SQLException
     {
         return null;
     }
}
