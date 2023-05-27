// Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

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
        StringBuilder builder = new StringBuilder();
        boolean isFirstParameter = true;

        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (!value.equals("null")) {
                if (!isFirstParameter) {
                    builder.append(" and ");
                }

                builder.append(key).append(" = '").append(value).append("'");
                isFirstParameter = false;
            }
        }

        return builder.toString();
    }
}
