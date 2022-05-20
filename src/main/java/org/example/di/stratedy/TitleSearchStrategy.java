package org.example.di.stratedy;

public class TitleSearchStrategy implements SearchStrategy {
    
    @Override
    public void doSearch() {
        System.out.println("Find Information By Title");
    }
}
