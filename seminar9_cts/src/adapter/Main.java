package adapter;

import adapter.JsonParser;
import adapter.XmlToJsonAdapter;

public class Main {
    public static void main(String[] args) {
        XmlParser xmlParser=new XmlParser();
        JsonParser jsonParser=new XmlToJsonAdapter(xmlParser);
        jsonParser.parserJson("{ \name\" : \"Jhon\", \"age\": 30 }");
    }
}//transformare in adapter de clase