package pack01;

import bean.Person;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import utils.JDBCUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by ye on 11/18/16.
 */
public class Demo02 {
    private QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDatabase());

    @Test
    public void test01() throws SQLException {
        System.out.println(JDBCUtils.getConnection());
    }

    @Test
    public void test02() throws SQLException {
        String sql = "select * from person";
        List<Person> list = queryRunner.query(sql, new BeanListHandler<Person>(Person.class));
        for (Person p : list) {
            System.out.println(p.toString());
        }
    }

}