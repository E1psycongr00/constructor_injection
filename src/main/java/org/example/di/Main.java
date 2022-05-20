package org.example.di;

import org.example.di.bar.SearchBar;
import org.example.di.stratedy.TitleSearchStrategy;

public class Main {
    public static void main(String[] args) {
        SearchBar searchBar = new SearchBar(new TitleSearchStrategy()); // 잠재적인 nullPointer 위험성
        searchBar.search();
        
    }
}
