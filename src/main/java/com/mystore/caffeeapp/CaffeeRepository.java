package com.mystore.caffeeapp;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CaffeeRepository {


    CaffeeConfig caffeeConfig = new CaffeeConfig();
    private final static ArrayList<Caffee> caffeeList = new ArrayList<Caffee>(){{
        add(new CaffeeConfig().caffee1());
        add(new CaffeeConfig().caffee2());
        add(new CaffeeConfig().caffee3());
    }};

    public static List<Caffee> getCaffeeList() {
        return caffeeList;
    }

    public static Caffee getCaffeeByCode(String code) {
            Caffee caffee = caffeeList.stream()
                    .filter(s->s.getCode().equals(code) )
                    .findFirst()
                    .get();
            return caffee;

    }
}
