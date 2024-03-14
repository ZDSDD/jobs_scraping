import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Document doc;

        try {
            doc = Jsoup.connect("https://www.pracuj.pl/praca").get();
            Elements elements = doc.select("[data-test=offer-title]");

            for (Element element : elements) {
                System.out.println(element);
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
