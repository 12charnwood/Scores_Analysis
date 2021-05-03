package com.sg.scores.dto;

import com.sg.scores.entity.Hole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class HoleDto {
	
	private int holeNumber;
	private int par;
	
	public static HoleDto toDto(Hole hole) {
		return new HoleDto(hole.getNumber(), hole.getPar());
	}
}
