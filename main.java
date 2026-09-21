public class main {
    public static void main(String[] args) throws Exception {
        Sala S1 = new Sala("321", 2);
        Sala S2 = new Sala("123", 4);

        S1.reservar("andre");
        S1.exibirDados();
        S2.exibirDados();
        S1.liberar("Andre");
        S1.exibirDados();
        S2.exibirDados();
        S1.reservar("joao");
        S1.reservar("joao");
    }
}
