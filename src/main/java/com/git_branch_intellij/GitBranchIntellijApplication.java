package com.git_branch_intellij;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitBranchIntellijApplication {
		String git = "Branch testing";
	public static void main(String[] args) {
		SpringApplication.run(GitBranchIntellijApplication.class, args);
	}

}
