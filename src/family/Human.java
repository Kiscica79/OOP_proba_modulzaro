package family;

public class Human {

    // TODO Családfa ábrázolására írj programot, amiben relációk mentén építhetsz fel anyai és apai kapcsolatokat!
    //  A program legyen képes a családfa kiíratására apai vagy anyai vonalon mozogva!
    // TODO Pl. Alma családfája anyai ágon mozogva,
    //  Alma szülei Béla és Cecil, akinek szülei Dénes és Emőke, akinek szülei Ferenc és Gyöngyi

    private String name;
    private boolean male;
    private Human father;
    private Human mother;


    public Human(String name, boolean male, Human father, Human mother) {
        this.name = name;
        this.male = male;
        this.father = father;
        this.mother = mother;
    }

    public Human[] getGrandParentsOfFather() {
        Human[] grandParentsOfFather = new Human[2];
        if (father != null) {
            grandParentsOfFather[0] = father.getFather();
            grandParentsOfFather[1] = father.getMother();
        }
        return grandParentsOfFather;
    }

    public Human[] getGrandParentsOfMother() {
        Human[] grandParentsOfMother = new Human[2];
        if (mother != null) {
            grandParentsOfMother[0] = mother.getFather();
            grandParentsOfMother[1] = mother.getMother();
        }
        return getGrandParentsOfMother();
    }

    public Human[] getGreatGrandParentsOfFather() {
        Human[] greatGrandParentsOfFather = new Human[2];
        if (getGrandParentsOfFather() != null) {
            greatGrandParentsOfFather[0] = father.getGrandParentsOfFather();
            greatGrandParentsOfFather[1] = father.getGrandParentsOfMother();
        }
        return greatGrandParentsOfFather;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }
}
