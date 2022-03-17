package service;

import logic.JavaSort;
import logic.Sort;

import java.util.List;

public class SortService {

    public List<String> doSort(List<String> list) {
        Sort<String> sort = new JavaSort<>();
        
        return sort.sort(list);
    }
}
