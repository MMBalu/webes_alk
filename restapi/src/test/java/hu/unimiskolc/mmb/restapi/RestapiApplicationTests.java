package hu.unimiskolc.mmb.restapi;

import hu.unimiskolc.mmb.restapi.controller.BookController;
import hu.unimiskolc.mmb.restapi.controller.Hellocontroller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class RestapiApplicationTests {

	@Autowired
	private Hellocontroller hellocont;

	@Autowired
	private BookController bookcont;

	@Test
	void contextLoads() {
	}

	@Test
	void contextLoadHello(){
		assertThat(hellocont).isNotNull();
	}

	@Test
	void contextLoadBook(){
		assertThat(bookcont).isNotNull();
	}

}
