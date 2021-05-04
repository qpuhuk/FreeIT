package AlexLink.HomeWork.XML;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        boolean answer = validateXMLSchema("src\\main\\java\\AlexLink\\HomeWork\\XML\\device.xml",
                "src\\main\\java\\AlexLink\\HomeWork\\XML\\device1.xsd");
        System.out.println(answer);

    }

    public static boolean validateXMLSchema(String xml, String xsd) {
        try {
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(new File(xsd));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xml)));
        } catch (SAXException | IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
