package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            if (!users.get(user.get()).contains(account)) {
                users.get(user.get()).add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream().filter(
                user -> user.getPassport().equals(passport)
        ).findFirst();
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        // test
        Optional<User> user = findByPassport(passport);
        Optional<Account> rsl = Optional.empty();
        if (user.isPresent()) {
             rsl  = users.get(user.get()).stream().filter(
                    account -> account.getRequisite().equals(requisite)
            ).findFirst();
        }
        return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        Optional<Account> accountSrc = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> accountDest = findByRequisite(destPassport, destRequisite);
        if (accountSrc.isPresent() && accountDest.isPresent() && accountSrc.get().getBalance() >= amount) {
            accountSrc.get().setBalance(accountSrc.get().getBalance() - amount);
            accountDest.get().setBalance(accountDest.get().getBalance() + amount);
            return true;
        }
        return false;
    }

//    public static void main(String[] args) {
//        List<Account> accounts = new ArrayList<>();
//        String requisite = "3fdsbb9";
//        accounts.add(new Account("3fdsbb9", 140));
//        int index = accounts.indexOf(new Account(requisite, -1));
//        Account find = accounts.get(index);
//        System.out.println(find.getRequisite() + " -> " + find.getBalance());
//    }
    public static void main(String[] args) {
        BankService bank = new BankService();
        bank.addUser(new User("321", "Petr Arsentev"));
        bank.addAccount("321", new Account("3fdsbb9", 140));
        User opt = bank.findByPassport("3211").get();
        Account account = bank.findByRequisite("321", "3fdsbb9").get();
        System.out.println(account);
        System.out.println(opt);
    }
}
