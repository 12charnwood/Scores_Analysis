package com.sg.scores.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="holes")
public class Hole {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@OneToOne(mappedBy="")
	private Course course;
	
	
	@NonNull
	private Integer number;
	
	@NonNull
	private Integer par;

	private int yards;
	private int metres;

}
