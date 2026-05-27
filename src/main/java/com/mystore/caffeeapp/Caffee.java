package com.mystore.caffeeapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Caffee {
    private String code;
    private String name;
    private String price;
    private boolean isAvailable;
}
