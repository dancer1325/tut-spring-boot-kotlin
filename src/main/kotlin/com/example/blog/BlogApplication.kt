package com.example.blog

import org.springframework.boot.Banner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class BlogApplication

fun main(args: Array<String>) {
	runApplication<BlogApplication>(*args)

	// Adding code
//	runApplication<BlogApplication>(*args) {
//		setBannerMode(Banner.Mode.OFF)		// Specify the SpringApplication.bannerMode
//	}

	// Alternative to run the SpringBoot application
//	SpringApplication.run(BlogApplication::class.java, *args)
}
