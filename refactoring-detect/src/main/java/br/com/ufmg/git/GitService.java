package br.com.ufmg.git;

public interface GitService {

	void cloneIfNotExists(String folder, String cloneUrl);

}
