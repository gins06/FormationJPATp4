package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.Entity.Agent;
import com.example.demo.Entity.Artiste;
import com.example.demo.Entity.Film;
import com.example.demo.repository.ArtisteRepository;
import com.example.demo.repository.FilmRepository;

@SpringBootApplication
public class Tp4Application implements CommandLineRunner{

	@Autowired
	ArtisteRepository artisteRepository;
	
	@Autowired
	FilmRepository filmRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Tp4Application.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		List<Artiste> artistesList = new ArrayList<Artiste>();
		List<Film> fimsList1 = new ArrayList<Film>();
		Film film1 = new Film("aaaa", "1985");
		Film film2 = new Film("bbbb", "1987");
		Film film3 = new Film("cccc", "1988");
		fimsList1.add(film1);
		fimsList1.add(film2);
		fimsList1.add(film3);
		List<Film> fimsList2 = new ArrayList<Film>();
		Film film4 = new Film("dddd", "1991");
		Film film5 = new Film("eeee", "1997");
		fimsList2.add(film4);
		fimsList2.add(film5);
		List<Film> fimsList3 = new ArrayList<Film>();
		Film film6 = new Film("ffff", "2000");
		Film film7 = new Film("gggg", "2010");
		fimsList3.add(film6);
		fimsList3.add(film7);
		
		artistesList.add(new Artiste("Willis", "Bruce", "Masculin",60, "USA", "0101011010", "bw@gmail.com", new Agent("Doug", "Mike", "Agents Prod"),fimsList1));
		artistesList.add(new Artiste("Dujardin", "Jean", "Masculin",45, "France", "0202020202", "JD@gmail.com", new Agent("Brown", "James", "Cine"),fimsList2));
		artistesList.add(new Artiste("Pitt", "Brad", "Masculin",50, "USA", "0202020202", "BP@gmail.com", new Agent("Melo", "Tony", "AB"),fimsList3));
	

		artistesList.forEach(artiste -> artisteRepository.save(artiste));
		
	}
}
