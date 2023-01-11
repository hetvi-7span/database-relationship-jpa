package com.jpa.relationship;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@Table (name = "course_material")
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "course")
public class CourseMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;
}
