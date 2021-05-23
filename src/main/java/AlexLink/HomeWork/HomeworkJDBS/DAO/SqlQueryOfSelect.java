package AlexLink.HomeWork.HomeworkJDBS.DAO;

public class SqlQueryOfSelect {

    public static final String SELECT_TITLE_OF_MOVIES_BY_CURRENT_YEAR =
            "SELECT title FROM movies " +
            "WHERE EXTRACT(YEAR FROM premiere) = 2020 OR EXTRACT(YEAR FROM premiere) = 2021";

    public static final String SELECT_INFO_ABOUT_ACTORS_IN_CURRENT_MOVIE =
            "SELECT name_actors, birthday FROM actors " +
            "WHERE name_actors IN (SELECT name_actor FROM listactors " +
            "WHERE ID_movies = (SELECT id FROM movies " +
            "WHERE title = ?))";

    public static final String SELECT_ACTORS_BY_COUNT_MOVIES =
            "SELECT name_actor, count(*) AS count FROM listactors " +
            "GROUP BY name_actor HAVING count(*) >= ?";

    public static final String SELECT_ACTORS_WHO_WAS_A_PRODUCER =
            "SELECT name_actors FROM actors JOIN movies WHERE name_actors = producer";
}
