import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        int page = 1, totalPages = 1, totalTeams = 0;
        double totalEarnings = 0;
        String league = "English Premier League (EPL)";

        HttpClient client = HttpClient.newHttpClient();

        while (page <= totalPages) {
            String url = "https://jsonmock.hackerrank.com/api/football_teams?league="
                    + league.replace(" ",
                    "%20") + "&page=" + page;

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonArray data = json.getAsJsonArray("data");

            for (JsonElement element : data) {
                JsonObject club = element.getAsJsonObject();

                int capacity = club.get("stadium_capacity").getAsInt();
                int silverware = club.get("total_silverware_count").getAsInt();

                double price = silverware > 40 ? 1.5 :
                        silverware > 25 ? 1.25 :
                        silverware > 10 ? 1.0 : 0.5;

                totalEarnings += capacity * price;
                totalTeams++;
            }

            page++;
        }

        int matches = totalTeams * (totalTeams - 1);
        int total = (int) Math.floor(totalEarnings);
        int average = matches > 0 ? total / matches : 0;

        System.out.println("Total earnings: " + total);
        System.out.println("Average earnings: " + average);
        // Arrays.asList(total, average);
    }
}
