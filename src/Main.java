public class Main {

    public static void main(String[] args) {

        RightTriangle rightTriangle = new RightTriangle();

        Triangle triangle1 = new Triangle(8,10,12); //nieprostokątny
        Triangle triangle2 = new Triangle(3,4,5); //prostokątny

        System.out.printf("Czy trójkąt o bokach %f, %f i %f jest prostokątny? %s\n", triangle1.getCathetus1(), triangle1.getCathetus2(), triangle1.getHypotenuse(), rightTriangle.isRightTriangle(triangle1));
        System.out.printf("Czy trójkąt o bokach %f, %f i %f jest prostokątny? %s\n", triangle2.getCathetus1(), triangle2.getCathetus2(), triangle2.getHypotenuse(), rightTriangle.isRightTriangle(triangle2));

    }

}