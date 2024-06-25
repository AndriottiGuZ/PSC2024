package Lista7.Quadrados;

public class Quadrado {

    private double ladoDoQuadrado;

    public double getLadoDoQuadrado() {
        return ladoDoQuadrado;
    }

    public void setLadoDoQuadrado(double num) {
        ladoDoQuadrado = num;
    }

    public double getAreaQuadrado(){
    return getLadoDoQuadrado() * getLadoDoQuadrado();
    }

    public double getPerimetroQuadrado(){
       return getLadoDoQuadrado() * 4;

    }

    public double getdiagonalQuadrado(){
        return getLadoDoQuadrado() * 1.41;

    }
}
