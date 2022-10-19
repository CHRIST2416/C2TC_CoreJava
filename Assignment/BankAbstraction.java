public class BankAbstraction {
    public static void main(String[] args) {
        centralBank cb = new centralBank("Kishore", 5618648, "Savings", "Bangalore");
        cb.withdraw();
        cb.deposit();
        cb.getinterest();
    }
}