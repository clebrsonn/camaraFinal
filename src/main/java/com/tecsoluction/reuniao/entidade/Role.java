package com.tecsoluction.reuniao.entidade;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "ROLE")
public class Role  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
  
	private long idrole;
    private String name;
    private Set<Usuario> users;
    
    
    
    
    public Role() {
		// TODO Auto-generated constructor stub
	}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return idrole;
    }

    public void setId(Long id) {
        this.idrole = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @ManyToMany(mappedBy = "roles")
    public Set<Usuario> getUsers() {
        return users;
    }

    public void setUsers(Set<Usuario> users) {
        this.users = users;
    }
    
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return name;
    }

}
