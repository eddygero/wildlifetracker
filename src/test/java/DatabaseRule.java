import org.sql2o.Sql2o;

public class DatabaseRule {

    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/gettywildlife_test", "getrude", "getty@2003");
}
