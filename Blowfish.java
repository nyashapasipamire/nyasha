public class Blowfish {
    public static void main(String[] args) {

        Blowfish.java:
        java
        public class Blowfish extends Fish {
            public Blowfish() {
            }

            public Blowfish(String name, int age, double weight) {
                super(name, age, weight);
            }

            @Override
            public void eat() {
                System.out.println("Blowfish eating");
            }

            @Override
            public void getVoice() {
                System.out.println("Blowfish making sound");
            }

            public void puff() {
                System.out.println("Blowfish puffing");
            }

            @Override
            public String toString() {
                return "Blowfish [name=" + getName() + ", age=" + getAge() + ", weight=" + getWeight() + "]";
            }
        }


    }