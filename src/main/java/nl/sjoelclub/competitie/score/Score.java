package nl.sjoelclub.competitie.score;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Score {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int waarde;
	private LocalDate datum;
	private char sjoelOfTel = '-';
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getWaarde() {
		return waarde;
	}
	public void setWaarde(int waarde) {
		this.waarde = waarde;
	}
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	public char getSjoelOfTel() {
		return sjoelOfTel;
	}
	public void setSjoelOfTel(char sjoelOfTel) {
		this.sjoelOfTel = sjoelOfTel;
	}
	
}
