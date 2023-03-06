package ro.ase.cts.s02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MatrixDataHandler {
    private int[][] matrix;
    private int height;
    private int width;
    private String filename;

    /**
     *Coonstructorul care initializeaza matricea pe baza vlorilor primite pentru dimensiuni.
     * Apoi,matricea initializata este scrisa in fisierul filename
     * @param height
     * @param width
     * @param filename
     */
    public MatrixDataHandler(int height, int width, String filename) {
        this.height = height;
        this.width = width;
        this.filename = filename;
        matrix = new int[height][];
        for (int i = 0; i < height; i++) {
            matrix[i] = new int[width];
        }
        if(!this.writeMatrixTofile())
        {
            System.out.println("Ceva nu a fost ok la scrierea fisierului!");
        }

    }

    /**
     * Matricea scrie matricea in fisierul denumit <this.fileName>
     *
     * @return true daca scrierea s-a facut cu succes; false in caz contrar
     */
    public boolean writeMatrixTofile(){
        try {
            //scriem matricea in fisier
            FileWriter fw = new FileWriter(this.filename);
            fw.write(height + " " + width + "\n");
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    fw.write(matrix[i][j] + " ");
                }
                fw.write("\n");
            }
            fw.close();
            return true;
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    /**
     * Inainte de a returna se va actualiza matricea cu datele din firsier
     *Inainte de a returna, se va actualiza matricea cu datele din fisier
     *
     * @param posHeight Linia de pe care se citeste
     * @param posWidth Coloana de pe care se citeste
     * @return Valoarea de pe pozitia transmisa
     */
    public int getValueFromPosition( int posHeight, int posWidth) {
        if(!this.readMatrixFromFile());
            System.out.println("Citirea din fisier a esuat,datele returnatee sunt cele existente in <matrix>local");
        return this.matrix[posHeight][posHeight];
    }

    /**
     * citeste din fisier datele dintr-o matrice conform clasei curente
     * Returneaza true daca ->este cu succes
     * false->esueaza
     * @return
     */
    public boolean readMatrixFromFile(){
        try {
            // !!!
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            height = Integer.parseInt(line.split(" ")[0]);
            width = Integer.parseInt(line.split(" ")[1]);

            for (int i = 0; i < height; i++) {
                line = br.readLine();
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                }
            }
            br.close();
            return true;
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    /**
     * Se citesc valorile din fisier,se modifica valorile dorite si apoi se rescriu datele in fisier.
     * @param posHeight->linia pe care se scrie
     * @param posWidth->coloana pe care se scrie
     * @param val->noua valoare

     */
    public void modifyValueAndUpdateFile(int posHeight, int posWidth, int val) {
        this.readMatrixFromFile();
        this.matrix[posHeight][posWidth]=val;
        this.writeMatrixTofile();
    }
    //trebuie sa documentam variabilele
}
