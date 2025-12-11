package com.github.mairu.samplemavenproject

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.test.web.reactive.server.WebTestClient
import spock.lang.Shared
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SimpleTest extends Specification {

    @LocalServerPort
    private int serverPort

    @Shared
    WebTestClient client

    def setup() {
        if (client == null) {
            client = WebTestClient.bindToServer().baseUrl("http://localhost:" + serverPort).build()
        }
    }

    def "test action should return hello world"() {
        expect:
            client.get().uri("/test")
                .exchange()
                .expectStatus().isOk()
                .expectBody().json('"Hello World"')
    }
}
