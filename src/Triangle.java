class Triangle {

    private double cathetus1;
    private double cathetus2;
    private double hypotenuse;

    Triangle(double cathetus1, double cathetus2, double hypotenuse) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
        this.hypotenuse = hypotenuse;
    }

    public double getCathetus1() {
        return cathetus1;
    }

    public void setCathetus1(double cathetus1) {
        this.cathetus1 = cathetus1;
    }

    public double getCathetus2() {
        return cathetus2;
    }

    public void setCathetus2(double cathetus2) {
        this.cathetus2 = cathetus2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

}