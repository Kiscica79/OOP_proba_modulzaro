package animal;



import java.util.List;

public class Elephant extends Animals {

    private final String elephantName;



    public Elephant(List<String> nicknames, String sound, String elephantName) {
        super(nicknames, sound);
        this.elephantName = elephantName;
    }

    public String getElephantName() {
        return elephantName;
    }


    @Override
    public String makeSound() {
        return ("bbúúúúú").concat(super.makeSound());


    }

    @Override
    public boolean nicknames(String nickname) {
        return super.getNicknames().add(nickname);
    }
}
