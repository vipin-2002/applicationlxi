package com.divisosoft.libraryproject;

import java.util.*;
import java.util.Comparator ;
import java.util.stream.Collectors ;

public class LibraryStreamProcessor
{
	public Double averagePrice(List<? extends Book> books)
	{
		OptionalDouble avg = books.stream()
							.mapToLong(Book::getPrice)
							.average();
		System.out.println("Average Price Is : "+avg);				
        double average = avg.orElse(0.0);						
		return average;
	}
}	
	