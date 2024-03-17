package com.hello.injectingcollectionsdemo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {

    List addressList;
    Set addressSet;
    Map  addressMap;
    Properties addressProp;
    String emptyString;
    String nullProperty;

    public void setEmptyString(String emptyString) {
        this.emptyString = emptyString;
    }

    public void setNullProperty(String nullProperty) {
        this.nullProperty = nullProperty;
    }

    // a setter method to set List
    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    // prints and returns all the elements of the list.
    public List getAddressList() {
        System.out.println("List Elements :"  + addressList);
        return addressList;
    }

    public String getEmptyString() {
        System.out.println("Empty string :"  + emptyString);
        return emptyString;
    }

    public String getNullProperty() {
        System.out.println("Null property :"  + nullProperty);
        return nullProperty;
    }

    // a setter method to set Set
    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    // prints and returns all the elements of the Set.
    public Set getAddressSet() {
        System.out.println("Set Elements :"  + addressSet);
        return addressSet;
    }

    // a setter method to set Map
    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    // prints and returns all the elements of the Map.
    public Map getAddressMap() {
        System.out.println("Map Elements :"  + addressMap);
        return addressMap;
    }

    // a setter method to set Property
    public void setAddressProp(Properties addressProp) {
        this.addressProp = addressProp;
    }

    // prints and returns all the elements of the Property.
    public Properties getAddressProp() {
        System.out.println("Property Elements :"  + addressProp);
        return addressProp;
    }
}
