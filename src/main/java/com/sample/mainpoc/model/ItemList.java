package com.sample.mainpoc.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.internal.build.AllowPrintStacktrace;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ItemList")
public class ItemList implements Serializable {

    @ManyToOne
     private CustomerDetails customerDetails;

    @Id
    @GeneratedValue
    private String id;
    private String itemName;

    @JoinColumn(name = "id")
    private String cusid;

}
