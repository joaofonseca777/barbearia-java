/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import model.Servico;
import model.Cliente;
import model.Usuario;
import model.Agendamento;

/**
 *
 * @author Paula e Weden
 */
public class Main {
   public static void main(String[]args){
       String nome = "Theo";
       System.out.println(nome);
       
       Servico servico = new Servico(1, "Barba", 30);
               
       System.out.println(servico.getDescricao());
       System.out.println(servico.getValor());
       
        Cliente cliente = new Cliente(1, "Joao", "Rua teste", "23890097");  
       System.out.println(cliente.getNome());
       
       Usuario usuario = new Usuario(1, "Barbeiro", "Senha ");
       System.out.println(usuario.getNome());
       
       Agendamento agendamento = new Agendamento( 1, cliente, servico, 30, "17/05/2023 09:00"); 
       System.out.println(agendamento.getCliente().getNome());
    }
}
 