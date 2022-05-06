package br.com.dio;

import br.com.dio.model.Cachorro;
import br.com.dio.model.Livro;

public class FirstProgram {
    public static void main(String[] args) {
        Cachorro cao = new Cachorro("marley","azul",12);
        System.out.println(cao);

        System.out.println("hello word!");

        Livro livro = new Livro("rei dos reis",300);
        System.out.println(livro);
    }
}
