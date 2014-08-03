package mindmine.com.welcometol.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Trey Robinson on 8/3/14.
 * Copyright 2014 MindMine LLC.
 */
public class CountryManager {

    private static String[] countryArray = {"Australia", "China", "Italy", "Japan", "United Kingdom", "United States"};
    private static String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut " +
            "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea " +
            "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    private static CountryManager mInstance;
    private List<Country> countries;

    public static CountryManager getInstance() {
        if (mInstance == null) {
            mInstance = new CountryManager();
        }

        return mInstance;
    }

    public List<Country> getCountries() {
        if (countries == null) {
            countries = new ArrayList<Country>();

            for (String countryName : countryArray) {
                Country country = new Country();
                country.name = countryName;
                country.description = loremIpsum;
                country.imageName = countryName.replaceAll("\\s+","").toLowerCase();
                countries.add(country);
            }
        }

        return  countries;
    }

}
