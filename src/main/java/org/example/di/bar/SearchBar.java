package org.example.di.bar;

import org.example.di.stratedy.SearchStrategy;

public class SearchBar {
    
    private SearchStrategy searchStrategy;
    
    // 생성자 주입
    public SearchBar(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }
    
    // setter 주입
    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }
    
    public void search() {
        searchStrategy.doSearch();
    }
    
}
