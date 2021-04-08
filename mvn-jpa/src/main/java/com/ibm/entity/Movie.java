package com.ibm.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="movies")
@SequenceGenerator(name="movseq", sequenceName="seq_movie", initialValue=101)
public class Movie {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "movseq")
	@Column(name="mov_id")
	private int movie;
	
	@Column(length=30)
	private String title;
	private double rating;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="show_time", 
				joinColumns = {@JoinColumn(name="mov_id")},
				inverseJoinColumns = {@JoinColumn(name="mpex_id")})
	
	private Set<Multiplex> multiplexs = new HashSet<Multiplex>();

	public int getMovie() {
		return movie;
	}

	public void setMovie(int movie) {
		this.movie = movie;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Set<Multiplex> getMultiplexs() {
		return multiplexs;
	}

	public void setMultiplexs(Set<Multiplex> multiplexs) {
		this.multiplexs = multiplexs;
	}
	
	
}
