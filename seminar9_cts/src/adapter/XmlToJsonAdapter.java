package adapter;

public class XmlToJsonAdapter  implements JsonParser {
    private XmlParser xmlParser;

    public XmlToJsonAdapter(XmlParser xmlParser) {
        this.xmlParser = xmlParser;
    }

    @Override
    public void parserJson(String json) {
        String xml=convertJsonToXSml(json);
        xmlParser.parserXml(xml);
    }

    private String convertJsonToXSml(String json) {
        //code to convert JSON to XML
        return "";
    }
}
