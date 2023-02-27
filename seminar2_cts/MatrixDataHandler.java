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
     *
     * @param height
     * @param width
     * @param filename
     */
    public MatrixDataHandler(int height, int width, String filename) {
        this.height = height;
        this.width = width;
        this.filename = filename;
        matrix = new int[height][width];
        initializeMatrix();
    }

    private void initializeMatrix() {
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(height + " " + width + "\n");
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    fw.write(matrix[i][j] + " ");
                }
                fw.write("\n");
            }
        } catch (IOException exception) {
            System.err.println("Error initializing matrix: " + exception.getMessage());
        }
    }

    public int getValueFromPosition(int row, int col) {
        int value = -1;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            height = Integer.parseInt(line.split(" ")[0]);
            width = Integer.parseInt(line.split(" ")[1]);

            for (int i = 0; i < height; i++) {
                line = br.readLine();
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                }
            }
            value = matrix[row][col];
        } catch (IOException exception) {
            System.err.println("Error getting value from position: " + exception.getMessage());
        }
        return value;
    }

    public void modifyValueAndUpdateFile(String s, int row, int col, int value) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            height = Integer.parseInt(line.split(" ")[0]);
            width = Integer.parseInt(line.split(" ")[1]);

            for (int i = 0; i < height; i++) {
                line = br.readLine();
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                }
            }
            matrix[row][col] = value;
            try (FileWriter fw = new FileWriter(filename)) {
                fw.write(height + " " + width + "\n");
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        fw.write(matrix[i][j] + " ");
                    }
                    fw.write("\n");
                }
            } catch (IOException exception) {
                System.err.println("Error updating file: " + exception.getMessage());
            }
        } catch (IOException exception) {
            System.err.println("Error modifying value: " + exception.getMessage());
        }
    }
}