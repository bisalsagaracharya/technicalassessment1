package lambdaexpression;

	import java.util.function.BiFunction;
	import java.util.function.Consumer;
	import java.util.function.Function;
	import java.util.function.Predicate;
	import java.util.function.Supplier;

	public class Driver {

		public static void main(String[] args) {
			// Supplier
			Supplier<String> companyName = () -> "GL India";
			System.out.println(companyName.get());
			final Supplier<Double> PI = () -> 3.14;
			System.out.println(PI.get());
			Supplier<Employee> employee  = () -> new Employee(1, "Name 1", 10000.0);
			System.out.println(employee.get());

			// Consumer
			// ctrl +

			Consumer<String> displayName = (v) -> System.out.println(v);
			displayName.accept("Gl India");

			Consumer<Float> displayPrice = (price) -> System.out.println(price);
			displayPrice.accept(555.55F);

			Consumer<Employee> empConsumer = (emp) -> System.out.println(emp);
			empConsumer.accept(new Employee(1, "Name 1", 10000.0));

			// Function<T,R>
			Function<String, String> uppercaseFunction = (str) -> str.toUpperCase();
			System.out.println(uppercaseFunction.apply("india"));
			Function<Float, Float> square = (num) -> num * num;
			System.out.println(square.apply(5.0F));

			String name = "Hello";

			Function<Employee, Double> getEmpSalary = (emp) -> {

				int i = 10;
				// your logic goes here
				System.out.println("name out side lambda block:" + name);
				return emp.getSalary();
			};
			System.out.println("emp salary:" + getEmpSalary.apply(new Employee(1, "Name 1", 10000.0)));
			// write a lambda to increase emp sal by given %
			BiFunction<Employee, Double, Employee> hikeEmployeeSalary = (emp, hike) -> {

				Double salary = emp.getSalary();
				salary = salary + (salary * (hike/100.0));
				emp.setSalary(salary);
				 return emp;
			};
			Employee emp = new Employee(1, "Name 1", 10000.0);
			System.out.println("emp after sal hike :" + hikeEmployeeSalary.apply(emp,10.0));
			
			Integer i=10;
			Predicate<Integer> even = (num)->{
				Boolean isEven = ( num%2 == 0);// comparison operators always result in boolean value
				return isEven;
			};
			System.out.println("17 even?"+even.test(17));
			System.out.println("28 even?"+even.test(28));
			
			
			Function<Integer, Integer> Power = (number) -> number*number;
			System.out.println(Power.apply(10));
			
		}

	}


