package ru.job4j.stream;

import java.time.LocalDate;
import java.time.Month;

public class Organization {
    private String name;

    private long OGRN;

    private int INN;

    private LocalDate registrationDate;

    private long fund;

    private String address;

    private String director;

    @Override
    public String toString() {
        return "Organization{"
                + "name='" + name + '\''
                + ", OGRN=" + OGRN
                + ", INN=" + INN
                + ", registrationDate='" + registrationDate + '\''
                + ", fund='" + fund + '\''
                + ", address='" + address + '\''
                + ", director='" + director + '\''
                + '}';
    }

    static class Builder {
        private String name;

        private long OGRN;

        private int INN;

        private LocalDate registrationDate;

        private long fund;

        private String address;

        private String director;

        Organization.Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Organization.Builder buildOGRN(long OGRN) {
            this.OGRN = OGRN;
            return this;
        }

        Organization.Builder buildINN(int INN) {
            this.INN = INN;
            return this;
        }

        Organization.Builder buildRegistrationDate(LocalDate registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }

        Organization.Builder buildFund(long fund) {
            this.fund = fund;
            return this;
        }

        Organization.Builder buildAddress(String address) {
            this.address = address;
            return this;
        }

        Organization.Builder buildDirector(String director) {
            this.director = director;
            return this;
        }

        Organization build() {
            Organization organization = new Organization();
            organization.name = name;
            organization.OGRN = OGRN;
            organization.INN = INN;
            organization.registrationDate = registrationDate;
            organization.fund = fund;
            organization.address = address;
            organization.director = director;
            return organization;
        }

        public static void main(String[] args) {
            Organization organization = new Organization.Builder().buildName("ПАО 'Перспектива'")
                    .buildOGRN(470778783422L)
                    .buildINN(3565444)
                    .buildRegistrationDate(LocalDate.of(2003, Month.JUNE, 30))
                    .buildFund(365000000L)
                    .buildAddress("г. Москва, ул. Наметкина, д.3")
                    .buildDirector("Иванов Иван Иванович")
                    .build();
            System.out.println(organization);
        }
    }
}
