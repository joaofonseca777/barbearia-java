/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import View.Login;
import model.Usuario;

/**
 *
 * @author João
 */
public class LoginController {

    private final Login view;
     private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    public void  entrarNoSistema(){
     // Pegar um usuario da view
    Usuario usuario = helper.obterModelo();
         
   
    // pesquisar usuario no banco 
    // se o usuario da view tiver a mesma senha e usiario vindo do banco de dados direcionar a menu principal
    // se nao mostrar uma mensagem ao usuario "usuario ou senha invalidos"
    }
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
          this.view.exibeMensagem("Executei o fiz tarefa");
        
    }
    
}
