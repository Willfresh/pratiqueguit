/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prattiqueguit;

/**
 *
 * @author HP
 */
public class Complex {
    private double reel;
    private double imaginaire;

    public Complex() {
    }

    public Complex(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    public double getImaginaire() {
        return imaginaire;
    }

    public void setReel(double reel) {
        this.reel = reel;
    }

    public void setImaginaire(double imaginaire) {
        this.imaginaire = imaginaire;
    }

    public double getReel() {
        return reel;
    }

    @Override
    public String toString() {
        return "Complex{" + "reel=" + reel + ", imaginaire=" + imaginaire + '}';
    }
    public Complex opposer(Complex c) {
        return new Complex(-reel ,-imaginaire);
    }
}
