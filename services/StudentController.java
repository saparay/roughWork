package services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import entity.Student;



public class StudentController {
	public static void main(String[] args) {
		List<Student> students = new ArrayList();
		students.add(new Student(101, "Mani", "saparay@gmail.com", "ME", 25000));
		students.add(new Student(102, "Akhil", "angerakhil@gmail.com", "BBA", 10000));
		students.add(new Student(103, "Mohan", "mohankrishna@gmail.com", "CE", 28000));
		students.add(new Student(104, "Taher", "shaikthaer@gmail.com", "CSE", 40000));
		students.add(new Student(105, "Narasimha", "narasimha@gmail.com", "ME", 25000));
		students.add(new Student(106, "Ghouse", "ghousemd@gmail.com", "EE", 30000));
		students.add(new Student(107, "Rahgu", "raghu@gmail.com", "EEE", 45000));
		students.add(new Student(108, "Sudheer", "sudheer@gmail.com", "CSE", 40000));
		
		int cost = students.stream().collect(Collectors.summingInt(t -> t.getFee()));
		System.out.println(cost);
		
		students.stream().map(t -> t.getBranch()).distinct().forEach(System.out::println);
		
		List<String> branchList = students.stream().map(t -> t.getBranch()).distinct().collect(Collectors.toList());
		
		System.out.println("Size: "+branchList.size());
		HashSet<String> branchSet = students.stream()
				.map(t -> t.getBranch())
				.collect(Collectors.toCollection(HashSet::new));
		
		System.out.println("Size : "+branchSet.size());
		Map<String, List<Student>> groupByBrance =students.stream()
				.collect(Collectors.groupingBy(Student::getBranch));;
		System.out.println("Grouping by size: "+groupByBrance);
		
		Map<String, Integer> feeMap = students.stream()
		.collect(Collectors.groupingBy(Student::getBranch, Collectors.summingInt(Student::getFee)));
		System.out.println(feeMap);
		
		Map<String, Double> avgMap = students.stream()
				.collect(Collectors.groupingBy(Student::getBranch, Collectors.averagingDouble(Student::getFee)));
				System.out.println(avgMap );
	}
}
