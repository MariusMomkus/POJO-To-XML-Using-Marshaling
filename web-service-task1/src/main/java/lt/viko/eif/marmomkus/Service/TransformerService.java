package lt.viko.eif.marmomkus.Service;

import lt.viko.eif.marmomkus.Model.Cars;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class TransformerService { // transformation functionality

    private static JAXBContext jaxbContext;

    static {

        try {
            jaxbContext = JAXBContext.newInstance(Cars.class);
        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
    }

    public Cars transformToPojo(String fileName) {  // from XML to objects
        Cars cars = null;


        try {

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            Path filePath = Path.of(fileName);
            String actual = Files.readString(filePath); // reading xml string from file
            System.out.print(actual);
            StringReader reader = new StringReader(actual);
            cars = (Cars) unmarshaller.unmarshal(reader);
        } catch (JAXBException | IOException e) {
            System.out.println(e.getMessage());
        }

        return cars;
    }

    public String transformToXML(Cars cars) { // from objects to XML

        StringWriter xmlWriter = new StringWriter();

        try {
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(cars, xmlWriter);

            System.out.println(xmlWriter);

        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
        return xmlWriter.toString();
    }
}

