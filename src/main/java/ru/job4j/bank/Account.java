package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс аккаунтов пользователей банка
 * @author Darya Leonteva
 * @version 1.0
 */
public class Account {
    /**
     * Поле реквизит аккаунта
     */
    private String requisite;

    /**
     * Поле баланс аккаунта
     */
    private double balance;

    /**
     * Конструктор - создание нового объекта со значениями:
     * @param requisite - реквизит аккаунта
     * @param balance - баланс аккаунта
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод получения значения поля реквизит
     * @return возвращает значение поля реквизит
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод изменения значения поля реквизит
     * @param requisite - новое значение поля реквизит
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод получения значения поля баланс
     * @return возвращает значение поля баланс
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод изменения значения поля баланс
     * @param balance - новое значение поля баланс
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Функция сравнения аккаунтов
     * @param o - сравниваемый объект
     * @return возвращает true при:
     * - ссылке на один объект в памяти
     * - одинаковых значениях параметра реквизит
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод получения хэш-кода объекта
     * @return возвращает целое число - номер ячейки памяти, где находится реквизит аккаунта
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
