/*
 * Dev_Name     - mGunawardhana
 * Dev_Contact  -  0719043372
 * Dev_e-mail    - mrgunawardhana27368@gmail.com
 * Copyright (c)
 */

package lk.ijse.hibernate.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Owner {

    @Id
    private String oId;
    private String name;

    //changing to EAGER type
    @OneToMany(mappedBy = "owner",fetch = FetchType.LAZY )
    private List<Pet> petList = new ArrayList<Pet>();

}
