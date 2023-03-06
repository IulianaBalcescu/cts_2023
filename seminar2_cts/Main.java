package ro.ase.cts.s02;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CalculatorRefactored calculator = new CalculatorRefactored();
        double result = calculator.calculatePowXPlusPowY();
        System.out.println("Rezultatul este: " + result);



        MatrixDataHandler mH = new MatrixDataHandler(5, 7, "matrix.txt");
        mH.modifyValueAndUpdateFile(3, 3, 4);
    }


}
