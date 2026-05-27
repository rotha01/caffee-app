package com.mystore.caffeeapp;

import lombok.*;

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
