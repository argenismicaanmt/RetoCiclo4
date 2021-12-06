/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2Ciclo4.modelo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 *
 * @author Argenis
 */
@Document(collection = "peripherals")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Peripheral {
    
@Id

private String reference;
private String brand;
private String category;
private String description;
private double price;
private boolean availability = true;
private int quantity;
private String photography;
}
