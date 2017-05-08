/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8.pkg3;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import nu.xom.Nodes;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

/**
 *
 * @author iqgonzalez
 */
public class Practica83 {

    /**
     * @param args the command line arguments
     */
    public static final String TagBiblioteca = "Biblioteca";
    public static final String Taglibro = "libro";
    public static final String TagTitulo = "Titulo";
    public static final String Tagautor = "autor";

    public static void main(String[] args) throws ValidityException, ParsingException, IOException {
        try {
            Builder parser = new Builder();
            Document doc = parser.build(new File("mensaje.xml"));
            Elements elements = doc.getRootElement().getChildElements();
        for (int i = 0;i <elements.size();i++) {
            Element Libro = elements.get(i);
            System.out.println("\nNombre: "
                    + Libro.getFirstChildElement(TagTitulo).getValue());
            System.out.println("\nDescripcion: "
                    + Libro.getFirstChildElement(Tagautor).getValue()
            );

        }
        } catch (ParsingException ex) {
            System.err.println("ERROR en el formato XML: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("ERROR de lectura del archivo" + ex.getMessage());
        }

        
        
    }
}
