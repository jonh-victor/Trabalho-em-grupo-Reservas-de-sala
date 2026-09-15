public class Sala {

    private String codigo;
    private int capacidade;
    private String responsavel;
    private boolean disponivel;

    public Sala(String responsavel){
        this.responsavel = responsavel;
        this.disponivel = true;
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
