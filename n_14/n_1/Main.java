package n_14.n_1;

public class Main {
    public static void main(String[] args) {
        Account a = new Account("4649", 1592);
        System.out.println(a);

        Account b = new Account("4649 ", 1592);
        System.out.println(a.equals(b));

        Account c = new Account("3331", 1592);
        System.out.println(a.equals(c));
    }
}

class Account {
    String accountNumber;
    int balance;

    Account(String a, int b) {
        accountNumber = a;
        balance = b;
    }

    public String toString() {
        return String.format("\\%d(口座番号:%s)", balance, accountNumber);
    }

    public boolean equals(Object o) {
        if (o instanceof Account) {
            Account a = (Account) o;
            String an1 = this.accountNumber.trim();
            String an2 = a.accountNumber.trim();
            return an1.equals(an2);
        }
        return false;
    }

}
