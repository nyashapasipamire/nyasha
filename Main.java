public class Main {
    public static void main(String[] args) {
        Main:
        public class Main {
            public static void main(String[] args) {
                Animal[] animals = new Animal[4];

                animals[0] = new Dog("Buddy", 3, 10.5);
                animals[1] = new Blowfish("Nemo", 1, 0.2);
                animals[2] = new Pigeon("Charlie", 2, 0.3, "Gray", "Rock Pigeon");
                animals[3] = new Mammal("Lion", 5, 200.0);

                for (Animal animal : animals) {
                    System.out.println(animal);
                    animal.eat();
                    animal.getVoice();

                    if (animal instanceof Mammal) {
                        ((Mammal) animal).run();
                    } else if (animal instanceof Fish) {
                        ((Fish) animal).swim();
                    } else if (animal instanceof Bird) {
                        ((Bird) animal).fly();
                    }

                    if (animal instanceof Dog) {
                        ((Dog) animal).fetch();
                    } else if (animal instanceof Blowfish) {
                        ((Blowfish) animal).puff();
                    } else if (animal instanceof Pigeon) {
                        ((Pigeon) animal).fly();
                    }

                    System.out.println();
                }
            }
        }


    }