package hu.unimiskolc.mmb.restapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void mainPageMessageTest(){
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/", String.class))
                .contains("<title>Főoldal</title>");
    }

    @Test
    void helloMessageTest(){
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/hello", String.class))
                .contains("Helló Világ!");
    }
}
