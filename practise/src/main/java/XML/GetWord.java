package XML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.net.URL;


public class GetWord {
    public static void main(String[] args) throws IOException {
        String html1 = "<html><body><p>Hello HTML</p></body></html>";
        Document doc1 = Jsoup.parse(html1);
        System.out.println("字符串得到的document："+doc1);
        File f = new File("a.html");
        if(f.exists()) {
            Document doc2 = Jsoup.parse(f,"utf-8");
            System.out.println("基于文件方式得到的 Document:\r\n"+ doc2);
        }
        String url = "http://www.baidu.com";
        Document doc3 = Jsoup.parse(new URL(url),5000); //超过5秒就报错
        System.out.println("基于URL方式得到的 Document:\r\n"+ doc3);
    }
}
