package br.com.ufmg.test;


import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.ufmg.git.GitService;
import br.com.ufmg.git.GitServiceImpl;
import br.com.ufmg.git.RefactoringDetector;
import br.com.ufmg.git.RefactoringDetectorImpl;
import br.com.ufmg.git.RefactoringHandler;
import br.com.ufmg.spring.jpa.CommitRepository;
import br.com.ufmg.spring.jpa.RefactoringRepository;

public class TestRevisionsDiff {
	
	private static CommitRepository commitRepository;
	private static RefactoringRepository refactoringRepository;
	
	@Test
	public void testRevisionsDiff() throws Exception {
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//		commitRepository = context.getBean(CommitRepository.class);
//		refactoringRepository = context.getBean(RefactoringRepository.class);
//		
//		GitService gitService = new GitServiceImpl();
//		gitService.cloneIfNotExists("tmp/retrofit", "https://github.com/square/retrofit.git");
//		
//		RefactoringDetector detector = new RefactoringDetectorImpl("tmp/retrofit", new RefactoringHandler(){
//			@Override
//			public void handleRefactoring(br.com.ufmg.spring.jpa.Refactoring refactoring) {
//				refactoringRepository.save(refactoring);
//			}
//			
//			public void handleCommit(br.com.ufmg.spring.jpa.Commit commit) {
//				commitRepository.save(commit);
//			}
//		});
//		detector.detectAll();
//		context.close();
	}

}
