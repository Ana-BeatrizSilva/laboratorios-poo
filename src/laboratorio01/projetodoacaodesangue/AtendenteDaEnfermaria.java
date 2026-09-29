package laboratorio01.projetodoacaodesangue;

public class AtendenteDaEnfermaria {

    public boolean avaliarDoador(Pessoa objPessoa, boolean tatuagem, boolean alcool){

       if (objPessoa.getIdade() >= 19 && objPessoa.getIdade() <= 69 && objPessoa.getPeso() >= 50){
           if(!tatuagem && !alcool){
               return true;
           }
           return false;
       }
       return false;
    }
}
