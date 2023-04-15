/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.ejb.Stateless;

/**
 *
 * @author ANGRY
 */
@Stateless
public class calcbean implements calcbeanLocal {
 private int a;
 private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    @Override
    public Integer addition(int a, int b) {
        return a+b;
    }
    
    @Override
    public Integer restar(int a, int b) {
        return a-b;
    }
    
    @Override
    public Integer multiplicar(int a, int b) {
        return a+b;
    }
        @Override
    public Integer dividir(int a, int b) {
        return a/b;
    }
    
    @Override
    public Integer modulo(int a, int b) {
        return a%b;
    }
    
    public Integer cuadrado(int a) {
        return a*a;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")


 
    
}
