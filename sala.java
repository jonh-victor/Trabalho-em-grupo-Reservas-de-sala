public class Sala {


    private String codigo;
    private int capacidade;
    private String responsavel;
    private boolean disponivel;
    private String status;


    //O professor nos pediu explicitamente que o responsável fosse nenhum no exercício. 
    //Modifiquei o contrututor para inicializar apenas o código da sala e sua capacidade.
    public Sala(String codigo, int capacidade){ 
        this.capacidade=capacidade;
        this.codigo=codigo;
        this.responsavel = "Nenhum";
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
    //Deixa a sala sem um responsável
    public void liberar(String responsavel){
        if(disponivel == false){
            this.responsavel="Nenhum";
            disponivel = true;
        }
    }

    //getters
    public int getCapacidade(){
        return this.capacidade;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public String getResponsavel(){
        return this.responsavel;
    }
    public String getDisponibilidade(){

        if(disponivel == true){
  
            status = "Disponivel";
        }else{
            status = "Indisponivel";
        }
        return status;
    }
    //exibe getters essenciais para teste
    public void exibirDados(){
        System.out.println(getCodigo());
        System.out.println(getDisponibilidade());

    }


}
