package nl.sjoelclub.competitie.klasse;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import nl.sjoelclub.competitie.speler.Speler;

@Entity
public class Klasse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private enum Label {H,A,B,C,D,E,F,G,J,X};
	@Enumerated(EnumType.STRING)
	private Label label = Label.X;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="klasse_id")
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
