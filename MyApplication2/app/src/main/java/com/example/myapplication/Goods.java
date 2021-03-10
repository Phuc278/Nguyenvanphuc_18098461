package com.example.myapplication;

public class Goods {
    private String Name;
    private String ShopName;
    private int imageGoods;

    public Goods(String name, String shopName, int imageGoods) {
        Name = name;
        ShopName = shopName;
        this.imageGoods = imageGoods;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public int getImageGoods() {
        return imageGoods;
    }

    public void setImageGoods(int imageGoods) {
        this.imageGoods = imageGoods;
    }
}
