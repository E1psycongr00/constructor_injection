package org.example.di.stratedy;


public class AuthorSearchStrategy implements SearchStrategy {
    
    @Override
    public void doSearch() {
        System.out.println("Find Information By Author");
    }
}
