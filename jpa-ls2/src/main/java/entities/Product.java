package entities;

import javax.persistence.*;

@Entity
@Table(name = "product2")
//CREATE TABLE `product2` (
//  `id` int NOT NULL,
//  `name` varchar(45) DEFAULT NULL,
//  PRIMARY KEY (`id`)
//)
public class Product {

    @Id
    //Autoincrement
    //@GeneratedValue(strategy = GenerationType.IDENTITY)

    //Table with next_val
    //CREATE TABLE `key_generator` (
    //  `sequence_name` varchar(100) NOT NULL,
    //  `next_val` int DEFAULT NULL,
    //  PRIMARY KEY (`sequence_name`)
    //)
    //@GeneratedValue(strategy = GenerationType.TABLE, generator = "key_generator")

    //O tabela key_generator non standard
    //CREATE TABLE `key_generator2` (
    //  `key_name` varchar(45) NOT NULL,
    //  `key_value` int DEFAULT NULL,
    //  PRIMARY KEY (`key_name`)
    //)
    //Parametrarea tabelei de key_generator
    @TableGenerator(name = "key_generator2", pkColumnName = "key_name",
                    pkColumnValue = "ppp", valueColumnName = "key_value",
                    allocationSize = 20
    )
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "key_generator2")


    private Integer id;

    @Basic(optional = false)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
