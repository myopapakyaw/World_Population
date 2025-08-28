package com.worldpopulation;

public class Country {
    private String countryname, captialname, regionname, subregionname;

    public Country(String countryname, String captialname, String regionname, String subregionname) {
        this.countryname = countryname;
        this.captialname = captialname;
        this.regionname = regionname;
        this.subregionname = subregionname;
    }

    public String getCountryname() {
        return countryname;
    }

    public String getCaptialname() {
        return captialname;
    }

    public String getRegionname() {
        return regionname;
    }

    public String getSubregionname() {
        return subregionname;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryname='" + countryname + '\'' +
                ", captialname='" + captialname + '\'' +
                ", regionname='" + regionname + '\'' +
                ", subregionname='" + subregionname + '\'' +
                '}';
    }
}

