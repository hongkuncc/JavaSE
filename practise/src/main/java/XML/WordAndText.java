package XML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;

public class WordAndText {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\hongk\\Desktop\\JavaSE\\practise\\src\\c.html");
        if (!f.exists()){
            return;
        }
        Document doc = Jsoup.parse(f,"utf-8");
        Element e = doc.getElementById("d1");
        //获取属性
        System.out.println(e.attr("id"));
        //获取所有属性
        System.out.println(e.attributes());
        //获取id
        System.out.println("id:"+e.id());
        //获取类的名称
        System.out.println("类名称："+e.className());
        //获取所有类名称
        System.out.println("所有类名称："+e.classNames());
        //获取htmL
        System.out.println(e.html());
        //获取外html
        System.out.println("外html："+e.outerHtml());
        //获取标签信息
        System.out.println("标签信息: "+e.tagName());

    }

}
