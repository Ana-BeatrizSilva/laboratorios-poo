package laboratorio01.projetoporteiroautomatico;

public class Porteiro{

    public String boasVindas(Pessoa objPessoa){
        String sexo = objPessoa.getSexo();
        String saudacao = "";

        if (objPessoa.getIdade() < 10){
            saudacao = "Olá, Jovem" + objPessoa.getNome();
        }else{
            if (sexo == null){
                sexo = "";
            }

            switch (sexo){

                case "Homem":
                    saudacao = "Bem-vindo, Senhor " + objPessoa.getNome();
                    break;

                case "Mulher":
                    saudacao = "Bem-vinda, Senhorita " + objPessoa.getNome();
                    break;

                default:
                    saudacao = "Olá " + objPessoa.getNome() + ", tenha um ótimo dia.";
                    break;
            }
        }

        return saudacao;
    }
}
