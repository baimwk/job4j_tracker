package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс пользователей банка
 * @author Darya Leonteva
 * @version 1.0
 */
public class User {
    /**
     * Поле паспорт пользователя
     */
    private String passport;

    /**
     * Поле ФИО пользователя
     */
    private String username;

    /**
     * Конструктор - создание нового объекта со значениями:
     * @param passport - паспорт пользователя
     * @param username - ФИО пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод получения значения поля паспорт
     * @return возвращает значение паспорта
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод изменения значения поля паспорт
     * @param passport - новое значение поля паспорт
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод получения значения поля ФИО
     * @return возвращает значение ФИО
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод изменения значения поля ФИО
     * @param username - новое значение поля ФИО
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Функция сравнения пользователей
     * @param o - сравниваемый объект
     * @return возвращает true при:
     * - ссылке на один объект в памяти
     * - одинаковых значениях параметра паспорт
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Метод получения хэш-кода объекта
     * @return возвращает целое число - номер ячейки памяти, где находится паспорт пользователя
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
