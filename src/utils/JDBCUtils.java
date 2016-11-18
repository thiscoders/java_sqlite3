package utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by ye on 11/18/16.
 */
public class JDBCUtils {
    private static ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

    public static Connection getConnection() throws SQLException {
        return comboPooledDataSource.getConnection();
    }

    public static ComboPooledDataSource getDatabase() {
        return comboPooledDataSource;
    }

}
