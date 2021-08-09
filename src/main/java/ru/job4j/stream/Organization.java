package ru.job4j.stream;

import java.time.LocalDate;
import java.time.Month;

public class Organization {
    private String name;

    private long psrn;

    private int itn;

    private LocalDate registrationDate;

    private long fund;

    private String address;

    private String director;

    static class Builder {
        private String name;

        private long psrn;

        private int itn;

        private LocalDate registrationDate;

        private long fund;

        private String address;

        private String director;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildPsrn(long psrn) {
            this.psrn = psrn;
            return this;
        }

        Builder buildItn(int itn) {
            this.itn = itn;
            return this;
        }

        Builder buildRegistrationDate(LocalDate registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }

        Builder buildFund(long fund) {
            this.fund = fund;
            return this;
        }

        Builder buildAddress(String address) {
            this.address = address;
            return this;
        }

        Builder buildDirector(String director) {
            this.director = director;
            return this;
        }

        Organization build() {
            Organization organization = new Organization();
            organization.name = name;
            organization.psrn = psrn;
            organization.itn = itn;
            organization.registrationDate = registrationDate;
            organization.fund = fund;
            organization.address = address;
            organization.director = director;
            return organization;
        }

        public static void main(String[] args) {
            Organization organization = new Organization.Builder().buildName("ПАО 'Перспектива'")
                    .buildPsrn(470778783422L)
                    .buildItn(3565444)
                    .buildRegistrationDate(LocalDate.of(2003, Month.JUNE, 30))
                    .buildFund(365000000L)
                    .buildAddress("г. Москва, ул. Наметкина, д.3")
                    .buildDirector("Иванов Иван Иванович")
                    .build();
            System.out.println(organization);
        }
    }

    @Override
    public String toString() {
        return "Organization{"
                + "name='" + name + '\''
                + ", psrn=" + psrn
                + ", itn=" + itn
                + ", registrationDate='" + registrationDate + '\''
                + ", fund='" + fund + '\''
                + ", address='" + address + '\''
                + ", director='" + director + '\''
                + '}';
    }

}
