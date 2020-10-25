package XML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;


public class GetElement {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\hongk\\Desktop\\JavaSE\\practise\\src\\a.html");
        if (!f.exists()) {
            return;
        }
        Document doc1 = Jsoup.parse(f,"utf-8");

        //通过id获取
        Element e1 = doc1.getElementById("productName");
        System.out.println(e1);

        //通过类名称获取
        Elements es;
        es = doc1.getElementsByTag("a");
        show(es);

        //通过类名称获取
        es = doc1.getElementsByClass("RightBox");
        show(es);

        //通过属性获取
        es = doc1.getElementsByAttribute("name");
        show(es);
    }

    private static void show(Elements es) {
        for (Element e:es) {
            System.out.println("获取"+e);
        }
    }
}
