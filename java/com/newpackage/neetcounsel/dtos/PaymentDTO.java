package com.newpackage.neetcounsel.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {
	private String orderId;
	private String paymentId;
	private String razorpaySignature;
	
}
