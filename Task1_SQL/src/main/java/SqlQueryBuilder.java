import java.util.Map;

public class SqlQueryBuilder {
    public static void main(String[] args) {
        String baseQuery = "select * from students where ";
        Map<String, String> parameters = Map.of(
                "name", "Ivanov",
                "country", "Russia",
                "city", "Moscow",
                "age", "null"
        );

        String whereClause = buildWhereClause(parameters);
        String sqlQuery = baseQuery + whereClause;
        System.out.println(sqlQuery);
    }

    public static String buildWhereClause(Map<String, String> parameters) {
        StringBuilder whereClause = new StringBuilder();
        boolean isFirstParameter = true;

        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (!value.equals("null")) {
                if (!isFirstParameter) {
                    whereClause.append(" and ");
                }

                whereClause.append(key).append(" = '").append(value).append("'");
                isFirstParameter = false;
            }
        }

        return whereClause.toString();
    }
}
