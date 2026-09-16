public class Sala {

    private String codigo;
    private int capacidade;
    private String responsavel;
    private boolean disponivel;

    //O professor nos pediu explicitamente que o responsável fosse nenhum no exercício. 
    //Modifiquei o contrututor para inicializar apenas o código da sala e sua capacidade.
    public Sala(String codigo, int capacidade){
        this.capacidade = capacidade;
        this.codigo = codigo;
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
    //Deixa a sala sem um responsável e disponivel
    public void liberar(String responsavel){
        if(disponivel == false){
            disponivel = true;
            this.responsavel = "Nenhum";
            System.out.println("Sala liberada com sucesso!");
        }
        else{
            System.out.println("Sala já está disponível.");
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
    public boolean getDisponibilidade(){
        boolean sucesso = disponivel;
        if(sucesso==true){
            System.out.println("Disponível");
        }else{
            System.out.println("Indisponível");
        }
        return disponivel;
    }
    //exibe getters essenciais para teste
        public void exibirDados(){
        System.out.println(getCodigo());
        System.out.println(getDisponibilidade());
        System.out.println(getResponsavel());
        System.out.println(getCapacidade());

    }


}
