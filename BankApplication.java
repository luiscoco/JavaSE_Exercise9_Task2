import java.util.List;

public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create clients and add them to the bank
        Client client1 = new Client("John Doe", 1000.0, Gender.MALE);
        Client client2 = new Client("Jane Smith", 5000.0, Gender.FEMALE);
        Client client3 = new Client("Alice Johnson", 2000.0, Gender.FEMALE);

        bank.addClient(client1);
        bank.addClient(client2);
        bank.addClient(client3);

        // Modify bank account balances
        modifyBank(bank);

        // Print account balances
        printBalance(bank);
    }

    public static void modifyBank(Bank bank) {
        List<Client> clients = bank.getClients();

        // Modify account balances
        for (Client client : clients) {
            Account account = client.getAccount();
            account.deposit(500.0); // Deposit $500
            account.withdraw(200.0); // Withdraw $200
        }
    }

    public static void printBalance(Bank bank) {
        List<Client> clients = bank.getClients();

        // Print account balances
        for (Client client : clients) {
            Account account = client.getAccount();
            System.out.println(client.getClientGreeting() + "'s account balance: $" + account.getBalance());
        }
    }
}