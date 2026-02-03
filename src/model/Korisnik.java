/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Korisnik
 */
public class Korisnik implements Serializable{
    private String korIme;
    private boolean ulogovan;

    public Korisnik(String korIme, boolean ulogovan) {
        this.korIme = korIme;
        this.ulogovan = ulogovan;
    }

    
    public Korisnik() {
    }

    public Korisnik(String korIme) {
        this.korIme = korIme;
        this.ulogovan =ulogovan;
    }

    public String getKorIme() {
        return korIme;
    }

    public void setKorIme(String korIme) {
        this.korIme = korIme;
    }

    @Override
    public String toString() {
        return "Korisnik{" + "korIme=" + korIme + ", ulogovan=" + ulogovan + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Korisnik other = (Korisnik) obj;
        return Objects.equals(this.korIme, other.korIme);
    }

    public boolean isUlogovan() {
        return ulogovan;
    }

    public void setUlogovan(boolean ulogovan) {
        this.ulogovan = ulogovan;
    }
    
    
}
