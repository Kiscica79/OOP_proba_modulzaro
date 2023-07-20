package animal;

public class Main {

    public static void main(String[] args) {

        Elephant dumbo = new Elephant("Dumbo");
        dumbo.addNickname("Big Ears");
        dumbo.addNickname("Jumbo");
        dumbo.makeSound();

        Lion simba = new Lion("Simba");
        simba.addNickname("King");
        simba.makeSound();

        Seacalf sealsy = new Seacalf("Sealsy");
        sealsy.addNickname("Fishy");
        sealsy.makeSound();

    }
}
