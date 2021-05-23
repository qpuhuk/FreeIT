package AlexLink.HomeWork.HomeworkJDBS.DAO;

public class SqlQueryOfChange {

    public static final String DELETE_MOVIES_BY_YEARS =
    "DELETE FROM movies where (year(now()) - year(premiere)) > ?";
}
