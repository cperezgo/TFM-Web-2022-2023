package es.uniovi.tfm.epivector.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
    @Column(nullable = false, length = 45)
    private RolesEnum name;
 
    public Role() { }
     
    public Role(RolesEnum name) {
        this.name = name;
    }
     
    public Role(Long id, RolesEnum name) {
        this.id = id;
        this.name = name;
    }
 
    public Role(Long id) {
        this.id = id;
    }
     
 
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RolesEnum getName() {
		return name;
	}

	public void setName(RolesEnum name) {
		this.name = name;
	}
 
	@Override
    public String toString() {
        return this.name.name();
    } 
}
