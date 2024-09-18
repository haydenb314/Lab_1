public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Olive", "corgi", 5, "brown and white", 3, "short", "spunky", false);
        d.bark();
        d.arf();
        d.woof();
        d.happyBirthday();
        makeDog("Clover", "German Shepard", 6, true);
    }

    public static void makeDog(String sName, String sBreed, int iAge, boolean bHair) {
        Dog scruffy = new Dog(sName, sBreed, iAge, bHair);
    }

}