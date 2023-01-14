package com.udemy.microservices.limitsservice.bean;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Limits {

    private int minimum;
    private int maximum;
}
