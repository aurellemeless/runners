package com.aurellemeless.runnerz.user;

public record Address(
        String street,
        String suite,
        String zipcode,
        Geo geo
) {
}
