package com.tenco.board.repository.model;

import java.security.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Board {
	
	private Integer id;
	private String number;
	private String password;
	private Timestamp createdAt;
	
	
}
