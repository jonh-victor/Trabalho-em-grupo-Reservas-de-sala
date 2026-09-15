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
    public void reservar(String responsavel){
        if(disponivel == true){
            disponivel = false;
            this.responsavel = responsavel;
            System.out.println("Sala reservada com sucesso!");
        }else{
            System.out.println("Sala indisponível para reserva.");
        }
    }


}
