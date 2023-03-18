// package com.zcorp.medversant.api.model;

// import java.util.Set;

// import javax.persistence.*;

// @Entity
// @Table(name = "role", schema = "provider_source")
// public class Role {

//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     private Integer id; 
//     private String name; 
//     @ManyToMany(mappedBy = "roles")
//     private Set<User> users;
    

//     public Role(int id, String name, Set<User> users) {
//         this.id = id;
//         this.name = name;
//         this.users = users;
//     }


//     public int getId() {
//         return this.id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getName() {
//         return this.name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public Set<User> getUsers() {
//         return this.users;
//     }

//     public void setUsers(Set<User> users) {
//         this.users = users;
//     }


// }
