package ru.job4j.bank;

import java.util.*;

/**
 * Класс, описывающий работу банка
 * @author Darya Leonteva
 * @version 2.0
 */
public class BankService {
    /**
     * Хранение всей пользователей и привязанных к ним счетов осуществляется в HashMap
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавления нового пользователя в банк - в HashMap
     * @param user - новый пользователь
     */
    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    /**
     * Метод ищет нужного пользователя по паспорту и добавлет к нему аккаунт,
     * если пользователь найден и не имеет добавляемого аккаунта.
     * @param passport - паспорт пользователя
     * @param account - аккаунт
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent() && !users.get(user.get()).contains(account)) {
            users.get(user.get()).add(account);
        }

    }

    /**
     * Метод поиска пользователя по паспорту.
     * @param passport - паспорт пользователя
     * @return возвращает пользователя, Optional.empty() есль пользователь не найден
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(p -> p.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод принимает на вход паспорт и реквизиты.
     * По паспорту ищем пользователя, если такой есть - ищем аккаунт по реквизитам.
     * @param passport - паспорт пользователя
     * @param requisite - реквизиты аккаунта
     * @return - возвращает аккаунт пользователя, Optional.empty() есль аккаунт не найден
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value)
                .stream()
                .filter(a -> a.getRequisite().equals(requisite))
                .findFirst());
    }

    /**
     * Метод перечисления денег с одного счета на другой.
     * На вход принимает паспорта и реквизиты отправителя и получателя.
     * @param srcPassport - паспорт отправителя
     * @param srcRequisite - реквизиты отправителя
     * @param destPassport - паспорт получателя
     * @param destRequisite - реквизиты получателя
     * @param amount - сумма перевода
     * @return возвращает true если счета найдены и суммы на карте отправителя хватает для перевода,
     * false в остальных случаях
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent()) {
            double srcBalance = srcAccount.get().getBalance();
            double destBalance = destAccount.get().getBalance();
            if (srcBalance >= amount) {
                srcAccount.get().setBalance(srcBalance - amount);
                destAccount.get().setBalance(destBalance + amount);
                rsl = true;
        }
        }
        return rsl;
    }
}
