package com;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
	private @Getter  @Setter int productId;
	private @Getter  @Setter String productName;
	private @Getter  @Setter float price;

	}



