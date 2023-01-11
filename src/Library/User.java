/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author Adrian
 */
public class User extends Account {
    private String name;
    private String email;
    private String NIM;

    public User(String NIM, String pass, String name, String email) {
        super(NIM, pass);
        this.name = name;
        this.email = email;
    }

    public void update(String NIM, String pass, String name, String email){
        super.update(NIM);
        this.name = name;
        this.email = email;
    }

    public String getNIM(){
        return this.NIM;
    }

    public String getEmail(){
        return this.email;
    }

    public String getNick(){
        return this.name;
    }
}
