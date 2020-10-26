package XML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;

public class OperatorAttrAndText {
    static Document doc;
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\hongk\\Desktop\\JavaSE\\practise\\src\\b.html");
        if (!f.exists()) {
            return;
        }
        doc = Jsoup.parse(f,"utf-8");
        System.out.println(doc);

        Element e = doc.select("p").first();
        e.attr("class","class1");



        e.appendText(" Hello JSoup");
        System.out.println("==============改完后============");
        System.out.println(doc);


    }
}
