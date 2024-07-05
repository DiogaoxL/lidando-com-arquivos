package ex02;

import com.google.gson.Gson;

public class Ex02 {

    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("matrix", "60 min", 2009);
        Gson gson = new Gson().newBuilder().setPrettyPrinting().create();

        String json = gson.toJson(titulo1);

        System.out.println(json);
    }
}
