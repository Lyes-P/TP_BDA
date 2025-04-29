package com.example.hellospring;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class HelloController {

    public static ArrayList<Etudiant> liste = new ArrayList<>();

    static {
        liste.add(new Etudiant(0, "A", 19));
        liste.add(new Etudiant(1, "B", 16));
        liste.add(new Etudiant(2, "C", 11));
        liste.add(new Etudiant(3, "D", 14));
    }

    @GetMapping("/liste")
    public Collection<Etudiant> getAllEtudiant() {
        return liste;
    }
    
    @GetMapping("/getEtudiant")
    public Etudiant getEtudiant(int identifiant) {
        return liste.get(identifiant);
    }

    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(Etudiant etudiant) {
        liste.add(etudiant);
        return etudiant;
    }
    
    @DeleteMapping("/delete")
    public void supprimerEtudiant(int identifiant) {
        liste.remove(identifiant);
    }

    @PutMapping("/modifier")
    public void modifierEtudiant(int identifiant, String nom) {
        liste.get(identifiant).setNom(nom);
    }
    
    @GetMapping("/hello")
    public String Hello() {
        return "Hello !";
    }

    @GetMapping("/bonjour")
    public String Bonjour() {
        return "Bonjour !";
    }

    @GetMapping("/etudiant")
    public Etudiant getEtudiant() {
        return new Etudiant(1, "Lyes", 19);
    }

    @GetMapping("/somme")
    public double somme(double a, double b) {
        return a+b;
    }
    
}
