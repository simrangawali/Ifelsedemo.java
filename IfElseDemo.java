public class IfElseDemo {

    int ammount;
    int totalPeople = 2;

    public IfElseDemo(int ammount) {

        this.ammount = ammount;
    }

    public void someMethod() {

        if (ammount >= 500) {

            if (totalPeople <= 3) {
                System.out.println("we will go for movie by owr scooty:" + ammount);
            } else if (totalPeople <= 5) {
                System.out.println("we will go for movie by car:" + ammount);
            } else if (totalPeople > 5) {
                System.out.println("we will go for movie by public transport:" + ammount);
            }
        }

        else {
            System.out.println("we will do the party at home:" + ammount);
        }

    }

    public static void main(String args[]) {
        IfElseDemo obj1 = new IfElseDemo(200);
        obj1.someMethod();

        IfElseDemo obj2 = new IfElseDemo(500);
        obj2.someMethod();
    }
}