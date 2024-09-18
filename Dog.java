public class Dog {
    String dogName;
    String dogBreed;
    int dogAge;
    String dogColor;
    int dogLegs;
    String dogHeight;
    String dogPersonality;
    boolean dogEarFlop;

    //constructor 1
    public Dog(String sName, String sBreed, int iAge, String sColor, int iLegs, String sHeight, String sPersonality, boolean bEarFlop) {
        dogName = sName;
        dogBreed = sBreed;
        dogAge = iAge;
        dogColor = sColor;
        dogLegs = iLegs;
        dogHeight = sHeight;
        dogPersonality = sPersonality;
        dogEarFlop = bEarFlop;

        Integer intAge = iAge;
        Integer intLegs = iLegs;

        System.out.println(
                "Hi, my name is " + sName + " and I am a " + sBreed + "." +
                        "\nI am " + iAge + " years old, and my fur is " + sColor + "." +
                        "\nI'm " + sHeight + " and have " + iLegs + " legs." +
                        "\nAccording to my owner, I am " + sPersonality + "."
        );

    }

    //constructor 2
    public Dog(String sName, String sBreed, int iAge, boolean bHair) {
        System.out.println(
                "\nHi, my name is " + sName + " and I am a " + sBreed + "." +
                        "\nI am " + iAge + ".");
    }

    //methods that do things
    public void happyBirthday() {
        dogAge++;
        System.out.println("Happy birthday!\nYour dog is now one year older: " + dogAge);
    }

    //noise methods
    public void bark() {
        System.out.println("bark");
    }

    public void arf() {
        System.out.println("arf");
    }

    public void woof() {
        System.out.println("woof");
    }

}