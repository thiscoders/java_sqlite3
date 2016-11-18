package bean;

/**
 * Created by ye on 11/18/16.
 */
public class Person {
    private String pno;
    private String pname;

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pno='" + pno + '\'' +
                ", pname='" + pname + '\'' +
                '}';
    }
}
