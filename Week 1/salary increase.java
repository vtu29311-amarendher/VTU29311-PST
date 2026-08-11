import java.util.*;
import java.util.stream.collectors;
public class salaryIncrease{
   public static void main(string[] args){
        Scanner sc = newScanner(System.in);
        int n = sc.nextInt();
	list<Double>salaries = new ArrayList<>();
	for(int i=0;i<n;i++){
	salaries.add(sc.nextDouble());
	}

	List<Double>updatedSalaries = salaries.stream()
		.map(salary -> salary * 1.10);
		.collect(collectors.toList());
	system.out.println("updated salaries:");
	updatedSalaries.forEach(salary -> system.out.printf("%.2f%n",salary));
	sc.close();
	}
}
	
