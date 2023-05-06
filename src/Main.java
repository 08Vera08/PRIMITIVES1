public class Main {
    public static void main(String[] args) {

        int ticketPrise = 1000;
        int miles = 300;

        int bonus;
        if (ticketPrise >= miles) {
            bonus = ticketPrise / miles;

        } else {
            bonus = 0;
        }

        System.out.println("Итоговый бонус:" + bonus);
    }
}