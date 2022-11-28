/*
 * Author : Ankit Kishor
 * Date: 28-11-2022
 * Created with :Intellij IDEA Community Edition
 */


package org.example.service.model;

public class DataBase {
    private int ab;
    private String ac;
    private String ad;

    public DataBase(int ab, String ac, String ad) {
        this.ab = ab;
        this.ac = ac;
        this.ad = ad;
    }

    public int getAb() {
        return ab;
    }




    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
