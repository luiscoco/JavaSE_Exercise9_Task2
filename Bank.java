import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Client> clients;

    public Bank() {
        clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public List<Client> getClients() {
        return clients;
    }
}
