package ex03;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        Veiculos veiculos = new Veiculos("Chevrolet", "Onix" , 2022);

        Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
        String json = gson.toJson(veiculos);

        System.out.println(json);
    }
}
