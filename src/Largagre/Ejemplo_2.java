
package Largagre;


public class Ejemplo_2 {

    public static double interpolate(double[] x, double[] y, double xTarget) {
        double result = 0;

        for (int i = 0; i < x.length; i++) {
            double term = y[i];
            for (int j = 0; j < x.length; j++) {
                if (j != i) {
                    term = term * (xTarget - x[j]) / (x[i] - x[j]);
                }
            }
            result += term;
        }

        return result;
    }

    public static void main(String[] args) {
        double[] x = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] y = {8, 10, 12, 14, 16};

        double xTarget = 22;

        double yTarget = interpolate(x, y, xTarget);

        System.out.println("El valor interpolado de y para x = " + xTarget + " es " + yTarget);

    }
}