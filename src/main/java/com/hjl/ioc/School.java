package com.hjl.ioc;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by admin on 2016/12/21.
 */
public class School {
    private List listStu;
    private Set setStu;
    private Map mapStu;

    public List getListStu() {
        return listStu;
    }

    public void setListStu(List listStu) {
        this.listStu = listStu;
    }

    public Set getSetStu() {
        return setStu;
    }

    public void setSetStu(Set setStu) {
        this.setStu = setStu;
    }

    public Map getMapStu() {
        return mapStu;
    }

    public void setMapStu(Map mapStu) {
        this.mapStu = mapStu;
    }

    public void printSchool() {

        System.out.println("--------list--------");
        for (int i = 0; i < listStu.size(); i++) {
            System.out.println(listStu.get(i));
        }

        System.out.println("--------set--------");
        for (Object s : setStu) {
            System.out.println(s);
        }

        System.out.println("--------map--------");
        for (Object key : mapStu.keySet()) {
            System.out.println(mapStu.get(key));
        }
    }

}
