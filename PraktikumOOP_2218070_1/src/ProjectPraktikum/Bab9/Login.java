/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.Bab9;


/**
 *
 * @author Aharfi
 */
public class Login {

    String username;
    String password;
    String nama;
    
    public Login(){
        nama = "Muhammad Nur Ihksan Balany";
        username = "ihksan23";
        password = "2218070";
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    boolean CekLogin(String Username, String password){
        if(username.equals(getUsername()) && password.equals(getPassword())){
            return true;
        }
        return false;
    }
}
