package edu.repaso.xml.dom;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import edu.repaso.xml.HotelXMLHelper;
import edu.repaso.xml.modelo.Direccion;
import edu.repaso.xml.modelo.Hotel;

public class DomHelper {

    /**
     * Genera un objeto Document que representa en memoria el documento XML con los datos del parámetro hoteles
     * @param hoteles Lista de hoteles
     * @return objeto Document
     * @throws ParserConfigurationException en caso de error
     */
    public static Document generarDOM(ArrayList<Hotel> hoteles) throws ParserConfigurationException {
       //TODO
    }

    private static void addElementConTexto(Document document, Node padre, String tag, String text) {
        // Creamos un nuevo nodo de tipo elemento desde document
        Node node = document.createElement(tag);
        // Creamos un nuevo nodo de tipo texto también desde document
        Node nodeTexto = document.createTextNode(text);
        // añadimos a un nodo padre el nodo elemento
        padre.appendChild(node);
        // Añadimos al nodo elemento su nodo hijo de tipo texto
        node.appendChild(nodeTexto);
    }

    /**
     * Crea un fichero en la ubicación indicada pro fileDestino a partir de un objeto Document en memoria
     * @param document objeto que se transcibirá al fichero de fileDestino
     * @param fileDestino ruta al fichero de destino
     * @throws TransformerException en caso de que surja durante la operación
     */
    public static void escribirDOM(Document document, String fileDestino) throws TransformerException {
        //TODO
    }

    /**
     * Lee un archivo XML de la ubicacion indicada en filePath
     * @param filePath ubicacion del archivo a leer
     * @return ArrayList<Hotel> con la representación de la información contenida en el fichero
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    public static ArrayList<Hotel> leerXML(String filePath) throws ParserConfigurationException, SAXException, IOException {
        //TODO
    }

}
