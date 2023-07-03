package animal;

import java.util.List;

public abstract class Animals {
    // TODO Írj egy programot, ami cirkuszi állatokat szimulál!
    //  A cirkuszban vannak elefántok, oroszlánok és fókák.
    //  Ezen állatok születésükkör kapnak egy nevet, mely a későbbiekben már nem módosulhat.
    //  (Garantáld ezt a működést a kódodban!)
    //  Életük folyamán viszont kaphatnak beceneveket, amelyekből egyszerre több is lehet az adott állatnak.
    //  Ezen becenevek nem fognak “kikopni”, tehát nem lesznek eltávolítva, örökké az állatokkal maradnak.
    //  (A kódodban lehessen egyesével hozzáadni becenevet állatokhoz, illetve lekérdezni az összes becenevét az állatnak.)
    //  Minden állat tud hangot kiadni, csak mindegyik másképp, valósítsd meg ezt a működést is!
    //  A programod továbbá legyen képes eltárolni, hogy hány darab állat lett “létrehozva” a cirkuszban!

    private String sound;
    private List<String> nicknames;


    public Animals(List<String> nicknames, String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public List<String> getNicknames() {
        return nicknames;
    }

    public void setNicknames(List<String> nicknames) {
        this.nicknames = nicknames;
    }

    public String makeSound() {
         return this.sound+" !!!!";

    }

    public abstract boolean nicknames(String nickname);

}
