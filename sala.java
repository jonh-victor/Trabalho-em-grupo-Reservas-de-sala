public class sala {

    private String codigo;
    private int capacidade;
    private String responsavel;
    private boolean disponivel;

    public sala(String responsavel, boolean disponivel){
        this.responsavel = responsavel;
        this.disponivel = true;
        this.disponivel = disponivel;
        this.responsavel = responsavel;
    }

    public void liberar(){
        if (disponivel==false){
            System.out.println("Sala esta indisponivel");
        }
        else {
            System.out.println("sala agendada");
            disponivel=false;
        }
    }
    


}
