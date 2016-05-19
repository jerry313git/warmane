package test;

import java.io.InputStream;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ImportTest {
    public static void main(String[] args) {  
        read1();  
        //read2();  
        //write();  
    }  
    
    public static void read1() {  
        try {  
            SAXReader reader = new SAXReader();  
            InputStream in = ImportTest.class.getClassLoader().getResourceAsStream("pla.xml");  
            Document doc = reader.read(in);  
            Element root = doc.getRootElement();  
            readNode(root, "");  
        } catch (DocumentException e) {  
            e.printStackTrace();  
        }  
    }  
    
    @SuppressWarnings("unchecked")  
    public static void readNode(Element root, String prefix) {  
        if (root == null) return;  
        // 获取属性  
        List<Attribute> attrs = root.attributes();  
        if (attrs != null && attrs.size() > 0) {  
            System.err.print(prefix);  
            for (Attribute attr : attrs) {  
                System.err.print(attr.getValue() + " ");  
            }  
            System.err.println();  
        }  
        // 获取他的子节点  
        List<Element> childNodes = root.elements();  
        prefix += "\t";  
        for (Element e : childNodes) {  
            readNode(e, prefix);  
        }  
    }  
}
