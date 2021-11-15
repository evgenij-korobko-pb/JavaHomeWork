package com.pb.korobko.hw7;

public enum Size {

    XXS("Дитячий розмір",32),
    XS("Дорослий розмір",34),
    S("Дорослий розмір",36),
    M("Дорослий розмір",38),
    L("Дорослий розмір",40);

    private String description;
    private int euroSize;

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return description;
    }

    public int getEuroSize() {
        return euroSize;
    }
}