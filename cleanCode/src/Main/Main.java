package Main;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

import chapter13_simultaneity_2_1.Car;
import chapter13_simultaneity_2_1.DeliveryCompanyThread;
import chapter13_simultaneity_2_2.RunnableThread;
import chapter13_simultaneity_2_2.SequentialExecutor;
import chapter13_simultaneity_etc.Adder;
import chapter13_simultaneity_etc.Calculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println(Pattern.matches("^01[016-9]-[0-9]{3,4}-[0-9]{4}",
		 * "010-2985-4633"));
		 * System.out.println(Pattern.matches("^01[016-9]-[0-9]{3,4}-[0-9]{4}",
		 * "011-298-4633"));
		 * System.out.println(Pattern.matches("^01[016-9]-[0-9]{3,4}-[0-9]{4}",
		 * "016-285-4633"));
		 * System.out.println(Pattern.matches("^01[016-9]-[0-9]{3,4}-[0-9]{4}",
		 * "017-295-4633"));
		 * System.out.println(Pattern.matches("^01[016-9]-[0-9]{3,4}-[0-9]{4}",
		 * "018-295-4633"));
		 * System.out.println(Pattern.matches("^01[016-9]-[0-9]{3,4}-[0-9]{4}",
		 * "019-295-4633"));
		 * 
		 * System.out.println("--------------");
		 * 
		 * System.out.println(Pattern.matches("^01[016-9]-[0-9]{3,4}-[0-9]{4}",
		 * "014-2985-4633"));
		 * System.out.println(Pattern.matches("^01[016-9]-[0-9]{3,4}-[0-9]{4}",
		 * "01-2985-4633"));
		 * System.out.println(Pattern.matches("^01[016-9]-[0-9]{3,4}-[0-9]{4}",
		 * "010-85-4633"));
		 * 
		 * System.out.println("--------------");
		 * 
		 * System.out.println(Pattern.matches(
		 * "[\\w\\~\\-\\.]+@[\\w\\~\\-]+(\\.[\\w\\~\\-]+)+", ".123@naver.com"));
		 * System
		 * .out.println(Pattern.matches("\\w+[\\w\\.-]+@[\\w-]+(\\.[\\w-]+)+",
		 * "123@naver.com"));
		 * 
		 * List<Object> test = Collections.emptyList();
		 */

		Car car = new Car();

		/*DeliveryCompanyThread president = new DeliveryCompanyThread("사장", car);
		DeliveryCompanyThread vicePresident = new DeliveryCompanyThread("부사장", car);
		DeliveryCompanyThread manager = new DeliveryCompanyThread("부장", car);
		DeliveryCompanyThread AssistantSupervisor = new DeliveryCompanyThread("대리", car);
		DeliveryCompanyThread staff = new DeliveryCompanyThread("사원", car);*/

		
		 DeliveryCompanyThread president = new DeliveryCompanyThread("사장");
		 DeliveryCompanyThread vicePresident = new DeliveryCompanyThread("부사장"); 
		 DeliveryCompanyThread manager = new DeliveryCompanyThread("부장"); 
		 DeliveryCompanyThread AssistantSupervisor = new DeliveryCompanyThread("대리");
		 DeliveryCompanyThread staff = new DeliveryCompanyThread("사원");
		 

//		president.start(); 
//		vicePresident.start(); 
//		manager.start();
//		AssistantSupervisor.start(); 
//		staff.start();
		 
		Adder adder = new Adder();

		Calculator calculator1 = new Calculator(1, adder);
		Calculator calculator2 = new Calculator(2, adder);
		Calculator calculator3 = new Calculator(3, adder);
		Calculator calculator4 = new Calculator(4, adder);
		Calculator calculator5 = new Calculator(5, adder);

		calculator1.start();
		calculator2.start();
		calculator3.start();
		calculator4.start();
		calculator5.start();

		/*RunnableThread t1 = new RunnableThread("One");
		RunnableThread t2 = new RunnableThread("Two");*/
		/*Executor executor = new SequentialExecutor();
		executor.execute(t1);
		executor.execute(t2);*/
		
		/*ExecutorService exService = Executors.newFixedThreadPool(2);
		exService.execute(t1);
		exService.execute(t2);*/
	}
}