package com.example.TrueClub.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrueClubb {
    @Id
    private String id;
    private String name;
    private String TrueClubId;
    private String emailId;
    private int salary;
}
