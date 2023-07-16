package com.Employeeaddress.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long userId;
        @NotBlank
        private String firstName;
        @NotBlank
        private String lastName;
        @OneToOne(cascade = CascadeType.ALL)
        com.Employeeaddress.model.Address address;
}
