package com.example.kafkaconsumer;

import lombok.Data;

@Data
public class Sms {

    private String from;
    private String to;
    private String text;

}
