package animal;

import java.util.List;

public class Lion extends Animals {

    private final String lionName;

    public Lion(List<String> nicknames, String sound, String lionName) {
        super(nicknames, sound);
        this.lionName = lionName;

    }

    public String getLionName() {
        return lionName;
    }


    @Override
    public String makeSound() {
        return ("vaaaaaaooooooo").concat(super.makeSound());

    }

    @Override
    public boolean nicknames(String nickname) {
        return super.getNicknames().add(nickname);
    }
}
