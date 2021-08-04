package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    @Test
    public void whenCollectOneAddress() {
        List<Profile> profiles = List.of(
                new Profile(new Address("Москва", "Беговая ул.", 12, 44))
        );
        Profiles p = new Profiles();
        List<Address> rsl = p.collect(profiles);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Москва", "Беговая ул.", 12, 44));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectThreeAddresses() {
        List<Profile> profiles = List.of(
                new Profile(new Address("Саратов", "Ленина ул.", 55, 20)),
                new Profile(new Address("Москва", "Беговая ул.", 12, 44)),
                new Profile(new Address("Челябинск", "Комарова ул.", 3, 1))
        );
        Profiles p = new Profiles();
        List<Address> rsl = p.collect(profiles);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Москва", "Беговая ул.", 12, 44));
        expected.add(new Address("Саратов", "Ленина ул.", 55, 20));
        expected.add(new Address("Челябинск", "Комарова ул.", 3, 1));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectTwoDoubleAddresses() {
        List<Profile> profiles = List.of(
                new Profile(new Address("Москва", "Беговая ул.", 12, 44)),
                new Profile(new Address("Москва", "Беговая ул.", 12, 44))
        );
        Profiles p = new Profiles();
        List<Address> rsl = p.collect(profiles);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Москва", "Беговая ул.", 12, 44));
        assertThat(rsl, is(expected));
    }
}