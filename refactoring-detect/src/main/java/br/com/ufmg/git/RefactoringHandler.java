package br.com.ufmg.git;


public interface RefactoringHandler {

	void handleRefactoring(br.com.ufmg.spring.jpa.Refactoring refactoring);
	
	void handleCommit(br.com.ufmg.spring.jpa.Commit commit);

}
