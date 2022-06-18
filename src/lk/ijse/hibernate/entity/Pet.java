/*
 * Dev_Name     - mGunawardhana
 * Dev_Contact  -  0719043372
 * Dev_e-mail    - mrgunawardhana27368@gmail.com
 * Copyright (c)
 */

package lk.ijse.hibernate.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pet {
    @Id
    private String pId;
    private String name;
    @ManyToOne
    private Owner owner;
}
