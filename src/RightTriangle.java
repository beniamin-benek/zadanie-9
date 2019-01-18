import static java.lang.Math.*;

class RightTriangle {

    boolean isRightTriangle(Triangle triangle) {
        double c = pow(triangle.getCathetus1(),2) + pow(triangle.getCathetus2(),2); //c^2 = a^2 + b^2
        return c == pow(triangle.getHypotenuse(),2);
    }

}