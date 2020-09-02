/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brokoth
 */
public class ClientProtocol {
    public String messageHandler(String message){
        message = "Server: "+message;
        return message;
    }
         
}
