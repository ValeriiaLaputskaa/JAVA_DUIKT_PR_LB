package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Product {
    private int id; // Унікальний ідентифікатор товару
    private String name; // Назва товару
    private double price; // Ціна товару
    private String description; // Опис товару

    //тут був конструктор для змін


    @Override
    public String toString() {
        return "Товар{" +
                "id=" + id +
                ", назва='" + name + '\'' +
                ", ціна=" + price +
                ", опис='" + description + '\'' +
                '}';
    }

}
