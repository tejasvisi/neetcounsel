package com.newpackage.neetcounsel.service;


import java.util.List;



import com.newpackage.neetcounsel.dtos.AktuRequest;
import com.newpackage.neetcounsel.dtos.NeetRequest;
import com.newpackage.neetcounsel.models.Neet;
import com.newpackage.neetcounsel.models.UserPDF;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="pdf-service",path="/pdf")
public interface PdfClient {

	@PostMapping("/general")
	public ResponseEntity<byte[]> createGeneralPdf(@RequestBody List<Neet> result) ;

	@PostMapping("/aktu")
    public byte[] generateAktuPdf(@RequestBody AktuRequest aktuRequest);

    @PostMapping("/neet")
    public byte[] generateNeetPdf(@RequestBody NeetRequest neetRequest); 
    
    @GetMapping("/pdfdownload")
    ResponseEntity<List<UserPDF>> downloadPDF(@RequestParam String userID); 
}
