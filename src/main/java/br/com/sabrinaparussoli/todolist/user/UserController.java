package br.com.sabrinaparussoli.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * modifificadores da classe:
 * public
 * private
 * protected
 * 
 * tipo do que esta definindo
 * class
 * interface
 * enum
 */

 @RestController
 @RequestMapping("/user")
public class UserController{

    /**
     * string - texto
     * interger - numero inteiros
     * double -  numeros 0.000
     * float -  numero 0.00
     * char - a c
     * dat - data
     * void (nao tem return)
     */

     /**
      * body
      * 
      */
    @PostMapping("/")
    public void create (@RequestBody UserModel userModel){
        System.out.println(userModel.name);
    }

}