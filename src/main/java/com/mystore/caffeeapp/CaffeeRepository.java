package com.mystore.caffeeapp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository

public class CaffeeRepository {


    private final CaffeeConfig caffeeConfig;
    public CaffeeRepository(CaffeeConfig caffeeConfig) {
        this.caffeeConfig = caffeeConfig;
    }


    private final ArrayList<Caffee> caffeeList = new ArrayList<>(){{
        add(new CaffeeConfig().caffee1());
        add(new CaffeeConfig().caffee2());
        add(new CaffeeConfig().caffee3());
    }};

    public List<Caffee> getCaffeeList() {
        return caffeeList;
    }

    public Optional<Caffee> getCaffeeByCode(String code) {
            Optional<Caffee> caffee = caffeeList.stream()
                    .filter(s->s.getCode().equals(code) )
                    .findFirst();
            return caffee;

    }
}
