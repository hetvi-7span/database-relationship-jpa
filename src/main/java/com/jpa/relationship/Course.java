package com.jpa.relationship;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "course")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer credit;
    private String name;

    @OneToOne(mappedBy = "course",fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private CourseMaterial courseMaterial;

}
