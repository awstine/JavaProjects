package FirstClass.src;

public class red {

    public static void main(String args[]){
        Client[] clients = new Client[2];

        clients[0] = new Client(22,"mark","405309");
        clients[0].addAccount(new Account(1,5000,3.2));
        clients[0].addAccount(new Account(2,3000,3.9));

        clients[1] = new Client(23,"tom","405309");
        clients[1].addAccount(new Account(3,7000,3.2));
        clients[1].addAccount(new Account(4,8000,3.9));

        System.out.println(clients[0].toString());
        System.out.println(clients[1].toString());

    }
}
