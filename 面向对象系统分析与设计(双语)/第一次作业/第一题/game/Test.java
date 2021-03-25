package game;

public class Test {
    public static void main(String[] args) {
        Character character = new King();
        character.setWeapon(new AxeBehavior());
        character.fight();
    }
}
