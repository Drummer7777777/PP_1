//package main.java.jm.task.core.jdbc.model;
//
//import javax.persistence.Column;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Table
//public class User {
//    @Id
//    private Long id;
//
//    @Column
//    private String name;
//
//    @Column
//    private String lastName;
//
//    @Column
//    private Byte age;
//
//    public User() {
//
//    }
//
//    public User(String name, String lastName, Byte age) {
//        this.name = name;
//        this.lastName = lastName;
//        this.age = age;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public Byte getAge() {
//        return age;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "age=" + age +
//                ", lastName='" + lastName + '\'' +
//                ", name='" + name + '\'' +
//                ", id=" + id +
//                '}';
//    }
//
//    public void setAge(Byte age) {
//        this.age = age;
//    }
//}
