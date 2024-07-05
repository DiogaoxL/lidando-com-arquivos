package ex01;

import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {
    public static void main(String [] args)  {
       try {
           FileWriter escreva = new FileWriter("arquivo.txt");
           escreva.write("Conteúdo a ser gravado no arquivo");
           escreva.close();
       }catch (IOException e){
           System.out.println("Aconteceu algum erro ao escrever no arquivo");
           e.printStackTrace();
       }

    }

}
