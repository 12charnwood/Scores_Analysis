package com.sg.scores.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@NonNull
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_one_id", referencedColumnName="id")
	@NonNull
	private Hole one;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_two_id", referencedColumnName="id")
	@NonNull
	private Hole two;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_three_id", referencedColumnName="id")
	@NonNull
	private Hole three;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_four_id", referencedColumnName="id")
	@NonNull
	private Hole four;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_five_id", referencedColumnName="id")
	@NonNull
	private Hole five;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_six_id", referencedColumnName="id")
	@NonNull
	private Hole six;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_seven_id", referencedColumnName="id")
	@NonNull
	private Hole seven;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_eight_id", referencedColumnName="id")
	@NonNull
	private Hole eight;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_nine_id", referencedColumnName="id")
	@NonNull
	private Hole nine;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_ten_id", referencedColumnName="id")
	@NonNull
	private Hole ten;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_eleven_id", referencedColumnName="id")
	@NonNull
	private Hole eleven;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_twelve_id", referencedColumnName="id")
	@NonNull
	private Hole twelve;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_thirteen_id", referencedColumnName="id")
	@NonNull
	private Hole thirteen;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_fourteen_id", referencedColumnName="id")
	@NonNull
	private Hole fourteen;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_fifteen_id", referencedColumnName="id")
	@NonNull
	private Hole fifteen;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_sixteen_id", referencedColumnName="id")
	@NonNull
	private Hole sixteen;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_seventeen_id", referencedColumnName="id")
	@NonNull
	private Hole seventeen;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="hole_eighteen_id", referencedColumnName="id")
	@NonNull
	private Hole eighteen;

	
	public List<Hole> holesAsList() {
		return List.of(one, two, three, four, five, six, seven, eight, nine, 
				ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen);
		
		
		
	}
	
	
}
