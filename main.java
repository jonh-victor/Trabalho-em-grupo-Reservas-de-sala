public class main {
    public static void main(String[] args) throws Exception {
        Sala sala1 = new Sala("A101", 30);
        Sala sala2 = new Sala("B202", 50);

        sala1.reservar("andre");
        sala1.exibirDados();
        sala2.exibirDados();
        sala1.liberar("andre");
        sala1.exibirDados();
        sala2.reservar("maria");
        sala2.reservar("carlos");
        sala2.exibirDados();
    }
}
