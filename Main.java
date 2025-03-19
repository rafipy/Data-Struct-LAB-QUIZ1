public class Main {
    public static void main(String[] args) {
        FoodQueue fq = new FoodQueue();

        fq.addRegular("Baclava");
        fq.addRegular("Foot Dive");
        fq.addPriority("Dorya");
        fq.addPriority("Jovanney Rafael Husni's Left Nut");

        fq.display();

        fq.takeOrder();
        fq.takeOrder();

        fq.display();

        fq.cancel("Baclava");
        fq.cancel("Foot Dive");

        fq.display();





    }
}
