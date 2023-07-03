package animal;

import java.util.List;

public class Seacalf extends Animals {

    private final String seacalfName;

    public Seacalf(List<String> nicknames, String sound, String seacalfName) {
        super(nicknames, sound);
        this.seacalfName = seacalfName;
    }

    public String getSeacalfName() {
        return seacalfName;
    }


    @Override
    public String makeSound() {
        return ("upupupup").concat(super.makeSound());

    }

    @Override
    public boolean nicknames(String nickname) {
        return super.getNicknames().add(nickname);
    }

}
