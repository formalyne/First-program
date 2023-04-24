public class Application {
    public static void main(String[] args) {
        Telefon telefonAna  = new Telefon("Siemens");
        Telefon telefonValera  = new Telefon("iPhone");

        System.out.println("Ana's telefone is by " +telefonAna.getTelefontype());
        System.out.println("Valera's telefone is by " +telefonValera.getTelefontype());

    }
}