// Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParsing {
    public static void main(String[] args) {
        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        JSONParser parser = new JSONParser();
        try {
            JSONArray jsonArray = (JSONArray) parser.parse(jsonString);
            StringBuilder stringBuilder = new StringBuilder();

            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                String family = (String) jsonObject.get("фамилия");
                String score = (String) jsonObject.get("оценка");
                String subject = (String) jsonObject.get("предмет");

                stringBuilder.append("Студент ")
                        .append(family)
                        .append(" получил ")
                        .append(score)
                        .append(" по предмету ")
                        .append(subject)
                        .append(".")
                        .append(System.lineSeparator());
            }

            System.out.println(stringBuilder);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

