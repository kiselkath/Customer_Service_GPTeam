package org.example.CustomerServiceGP.model;

import jakarta.persistence.Embeddable;

/**
 * Represents full information about customer size preferences.
 */


@Embeddable
public class Sizes {
    private String topSize; // S, M, L, XL or 42, 44, 46
    private String bottomSize;
    private int shoeSize;

    public Sizes() {
        // JPA
    }

    public Sizes(String topSize, String bottomSize, int shoeSize) {
        this.topSize = topSize;
        this.bottomSize = bottomSize;
        this.shoeSize = shoeSize;
    }

    public String getTopSize() {
        return topSize;
    }

    public void setTopSize(String topSize) {
        this.topSize = topSize;
    }

    public String getBottomSize() {
        return bottomSize;
    }

    public void setBottomSize(String bottomSize) {
        this.bottomSize = bottomSize;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }
}
