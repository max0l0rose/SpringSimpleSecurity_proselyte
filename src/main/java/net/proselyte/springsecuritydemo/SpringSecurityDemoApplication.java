package net.proselyte.springsecuritydemo;

import net.proselyte.springsecuritydemo.model.User;
import net.proselyte.springsecuritydemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityDemoApplication {

	@Autowired
	UserRepository userRepository;

	@Bean
	boolean qqq() {
		userRepository.save(User.builder().firstName("Qqq").build());
		return true;
	}

	public static void main(String[] args) {

		//Collections.EMPTY_SET.addAll(Arrays.asList(1, 2, 3)); // ERROR - immutable

		//Set<Integer> set = Collections.singleton(1);
		//set.add(1); // ERROR - sing

		//Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1, 2, 3)));


//		Set<Integer> set = Stream.of(1, 2, 3)
//				.collect(Collectors.toSet()); // mut
//		set.add(4);

//		Set<Integer> set = Stream.of(1, 2, 3)
//				.collect(Collectors.collectingAndThen(Collectors.toSet(),
//						Collections::<Integer>unmodifiableSet));

		SpringApplication.run(SpringSecurityDemoApplication.class, args);
	}

}
