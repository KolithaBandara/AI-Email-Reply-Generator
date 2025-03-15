package edu.email.AI.Email.Reply.Generator.model;

import lombok.Data;

@Data //Lombok --> Generating Getters and Setters on runtime.
public class EmailRequest {
    private String emailContent; //Instance variable
    private String tone; //Instance variable
}
