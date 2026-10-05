package laboratorio02.projetopontos;

public class Ponto {

    // atributos

    private int eixoX;
    private int eixoY;

    // gets e sets

    public int getEixoX(){
        return eixoX;
    }

    public void setEixoX(int eixoX){
        this.eixoX = eixoX;
    }

    public int getEixoY(){
        return eixoY;
    }

    public void setEixoY(int eixoY){
        this.eixoY = eixoY;
    }

    // métodos

    public String quadrante(){

        if (getEixoX() > 0 && getEixoY() > 0)
            return "1° Quadrante";

        if (getEixoX() < 0 && getEixoY() > 0)
            return "2° Quadrante";

        if (getEixoX() < 0 && getEixoY() < 0)
            return "3° Quadrante";

        if (getEixoX() > 0 && getEixoY() <0)
            return "4° Quadrante";


        if (getEixoX() == 0 && getEixoY() == 0)
            return "Origem";

        if (getEixoY() == 0)
            return "Eixo horizontal";

        return "Eixo vertical";
    }

    public boolean eIgual(Ponto objPonto){

        if (objPonto.getEixoX() == this.getEixoX() && objPonto.getEixoY() == this.getEixoY()){
            return true;
        }

        return false;
    }
}
