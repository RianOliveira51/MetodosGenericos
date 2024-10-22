package com.example.genericodelimitados;

import com.example.genericodelimitados.entities.Product;
import com.example.genericodelimitados.services.CalculationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*Uma empresa de consultoria deseja avaliar a perfomance de produtos, funcionarios, dentre outras coisas.
* Um dos cálculos que ela precisa é encontrar o maior dentre um conjunto de elementos. Fazrer um programa
* que leia um conjunto de produtos a partir de um arquivo, conforme exemplo, e depois mostre o mais caro deles.*/
@SpringBootApplication
public class GenericoDelimitadosApplication {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line !=null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most Expensive: ");
            System.out.println(x);

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());

        }
    }

}
