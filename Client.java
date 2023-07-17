public class Client {
    private String name;
    private Account account;
    private Gender gender;

    public Client(String name, double initialBalance, Gender gender) {
        this.name = name;
        this.account = new Account(1, initialBalance);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public String getClientGreeting() {
        return gender.getGreeting() + " " + name;
    }
}

