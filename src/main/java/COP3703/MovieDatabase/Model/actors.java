package COP3703.MovieDatabase.Model;

import javax.persistence.*;

@Entity
@Table(name = "actors")
public class actors {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ActorNumber;

	@Column(name = "FirstName")
	private String FirstName;

	@Column(name = "LastName")
	private String LastName;

	public int getActorNumber() {
		return ActorNumber;
	}

	public void setActorNumber(int actorNumber) {
		ActorNumber = actorNumber;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

}
