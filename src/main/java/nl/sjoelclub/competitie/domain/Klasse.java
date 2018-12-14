package nl.sjoelclub.competitie.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Klasse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private enum Label {H,A,B,C,D,E,F,G,J,X};
	@Enumerated(EnumType.STRING)
	private Label label = Label.X;
	
	private Set<Speler> spelers = new HashSet<Speler>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Set<Speler> getSpelers() {
		return spelers;
	}

	public void setSpelers(Set<Speler> spelers) {
		this.spelers = spelers;
	}
	
}
