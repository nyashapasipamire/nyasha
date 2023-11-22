public class Dog {
    public static void main(String[] args) {

        Dog:
        public class Dog extends Mammal {
            public Dog() {
            }

            public Dog(String name, int age, double weight) {
                super(name, age, weight);
            }

            @Override
            public void eat() {
                System.out.println("Dog eating");
            }

            @Override
            public void getVoice() {
                System.out.println("Dog barking");
            }

            public void fetch() {
                System.out.println("Dog fetching");
            }

            @Override
            public String toString() {
                return "Dog [name=" + getName() + ", age=" + getAge() + ", weight=" + getWeight() + "]";
            }
        }


    }