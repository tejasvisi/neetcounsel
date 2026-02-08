package com.newpackage.neetcounsel.dtos;

import java.util.List;


import com.newpackage.neetcounsel.models.Neet;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class NeetRequest {

	    private List<Neet> nirf;
	  
	    String userId;
	    String fileName;


}
