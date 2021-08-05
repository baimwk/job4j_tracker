package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс, описывающий работу банка
 * @author Darya Leonteva
 * @version 1.0
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
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }

    }

    /**
     * Метод поиска пользователя по паспорту.
     * @param passport - паспорт пользователя
     * @return возвращает пользователя, null есль пользователь не найден
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(p -> p.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод принимает на вход паспорт и реквизиты.
     * По паспорту ищем пользователя, если такой есть - ищем аккаунт по реквизитам.
     * @param passport - паспорт пользователя
     * @param requisite - реквизиты аккаунта
     * @return - возвращает аккаунт пользователя, null есль аккаунт не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(a -> a.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
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
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null) {
            double srcBalance = srcAccount.getBalance();
            double destBalance = destAccount.getBalance();
            if (srcBalance >= amount) {
                srcAccount.setBalance(srcBalance - amount);
                destAccount.setBalance(destBalance + amount);
                rsl = true;
        }
        }
        return rsl;
    }
}
