package com.training.function.webfunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFunctionApplication.class, args);
	}

	List<Card> cards = null;

	public WebFunctionApplication() {
		super();
		cards = new ArrayList<>();
		cards.add(new Card("12098C", "3476", 675));
		cards.add(new Card("12099C", "3277", 933));
		cards.add(new Card("12100C", "7645", 035));
		cards.add(new Card("12101C", "8756", 250));
	}

	@Bean
	public Function<String, Card> getCard() {
		return value -> {
			return cards.stream().filter(card -> value.equals(card.getCardRef())).findAny().orElse(null);
		};
	}

}
