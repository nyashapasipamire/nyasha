public class Fish {
    public static void main(String[] args) {

        Fish:

            public Fish() {
            }

            public Fish(String name, int age, double weight) {
                super(name, age, weight);
            }

            @Override
            public void eat() {
                System.out.println("Fish eating");
            }

            @Override
            public void getVoice() {
                System.out.println("Fish making sound");
            }

            public void swim() {
                System.out.println("Fish swimming");
            }

            @Override
            public String toString() {
                return "Fish [name=" + getName() + ", age=" + getAge() + ", weight=" + getWeight() + "]";
            }



    }