package pack01;

import org.junit.Test;

import java.sql.*;

/**
 * Created by ye on 11/18/16.
 */
public class Demo01 {
    //创建数据表
    @Test
    public void test01() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:databases/mdata.db");
        Statement statement = connection.createStatement();
        statement.executeUpdate("drop table if exists book");
        statement.executeUpdate("create table book(bno int,bname varchar(20),woner int)");
        statement.executeUpdate("insert into book values(1,'鸣人的书',1)");
        statement.executeUpdate("insert into book values(2,'佐助的书',2)");
        statement.executeUpdate("insert into book values(3,'卡卡西的书',3)");


        ResultSet rs = statement.executeQuery("select * from book");
        while (rs.next()) {
            System.out.println("bno:" + rs.getInt("bno") + "\tbname:" + rs.getString("bname") + "\twoner:" + rs.getInt("woner"));
        }
    }

    //读取数据
    @Test
    public void test02() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:databases/mdata.db");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from person");
        while (rs.next()) {
            System.out.println("pno:" + rs.getInt("pno") + "\t\t" + "pname:" + rs.getString("pname"));
        }
    }

    @Test
    public void test03() {

    }

}
