package com.sample.mainpoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="CustomerDetails")
public class CustomerDetails implements Serializable {

    @OneToMany(mappedBy="customerDetails")
    private ItemList itemList;

    @Id
    @GeneratedValue
    public String id;
    public String name;
    public String Address;
    public String pincode;
    public String phoneNum;

}
