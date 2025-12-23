public class App {
    public static void main(String[] args) throws Exception {
        Character character = new King();
        character.fight();

        character.setWeapon(new BowAndArrowBehavior());
        character.fight();
    }
}
