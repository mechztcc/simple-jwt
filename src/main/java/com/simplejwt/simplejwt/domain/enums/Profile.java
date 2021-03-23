package com.simplejwt.simplejwt.domain.enums;

public enum Profile {
    ADM(1, "ROLE_ADMIN"),
    CLIENT(2, "ROLE_CLIENT");

    private int cod;

    private String description;

    Profile(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public static Profile toEnum(Integer cod) {
        if(cod == null) {
            return null;
        }
        for(Profile x : Profile.values()) {
            if(cod.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id Inválido: " + cod);
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }
}
