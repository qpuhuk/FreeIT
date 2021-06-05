package AlexLink.HomeWork.HomeworkJDBS.DAO;

public class SqlQueryOfChange {

    public static final String DELETE_MOVIES_BY_YEARS =
    "DELETE FROM movies where (year(now()) - year(premiere)) > ?";
    public static final String UPDATE_PREMIERE_BY_TITLE = "UPDATE movies SET premiere = ? WHERE title = ?";
}
