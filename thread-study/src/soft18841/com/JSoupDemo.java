package soft18841.com;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupDemo {
    public static void main(String[] args)throws Exception {
        String url = "https://www.qidian.com/rank/hotsales?style=1";
        Connection connection = Jsoup.connect(url);
        Document document = connection.get();
        Elements elements = document.getElementsByClass("book-mid-info");
        System.out.println(elements.size());
        for (Element element:elements) {
            Element link = element.child(0).child(0);
            String titleString = link.text();
            System.out.println(titleString);
        }
    }
}
