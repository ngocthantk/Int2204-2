/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan3;

/**
 *
 * @author FEELSBADMAN
 */
public class Cpu {
    private String Clock;
    private String Hang;
    private String cache;
    private String socket;

    public String getClock() {
        return Clock;
    }

    public void setClock(String Clock) {
        this.Clock = Clock;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
}
