import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // initializing the HTML Document page variable
        Document doc;

        try {
            // fetching the target website
            doc = Jsoup.connect("https://www.pracuj.pl/praca").get();
            // Select all elements with class "type--recommendation"
            Elements elements = doc.select("[data-test=offer-title]");

            // Iterate through each element and extract the desired information
            for (Element element : elements) {
                // Extract offer ID
                System.out.println(element);
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
