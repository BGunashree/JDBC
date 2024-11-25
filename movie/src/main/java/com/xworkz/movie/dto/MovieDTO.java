package com.xworkz.movie.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie_table")
public class MovieDTO {
	
	@Id
	private int id;
	private String name;
	private String director;
	private String producer;
	private String actor;
	private String actress;
	private int releaseYear;
	private double budget;
	private double ratings;
	private double collections;
	public MovieDTO(int id, String name, String director, String producer, String actor, String actress,
			int releaseYear, double budget, double ratings, double collections) {
		super();
		this.id = id;
		this.name = name;
		this.director = director;
		this.producer = producer;
		this.actor = actor;
		this.actress = actress;
		this.releaseYear = releaseYear;
		this.budget = budget;
		this.ratings = ratings;
		this.collections = collections;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public double getCollections() {
		return collections;
	}
	public void setCollections(double collections) {
		this.collections = collections;
	}

}
