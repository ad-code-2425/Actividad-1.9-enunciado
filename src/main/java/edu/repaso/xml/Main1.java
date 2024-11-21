package edu.repaso.xml;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import edu.repaso.xml.dom.DomHelper;
import edu.repaso.xml.modelo.Hotel;
import edu.repaso.xml.sax.SAXHelper;

public class Main1 {

    public static void main(String[] args) {
        String pathOrigen = Paths.get("src", "main", "resources", "hoteles.xml").toString();
        String pathDestino = Paths.get("src", "main", "resources", "hotelesDOMResult.xml").toString();

        ArrayList<Hotel> hoteles = new ArrayList<>();

        
            hoteles = SAXHelper.leerHotelesSAX(pathOrigen);

            for (Hotel hotel : hoteles) {
                System.out.println(hotel);
            }

            Document document = DomHelper.generarDOM(hoteles);
            DomHelper.escribirDOM(document, pathDestino);

    }
}