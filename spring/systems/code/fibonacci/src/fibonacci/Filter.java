package fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Filter {

	private List<Integer> data;

	public Filter(int size) {
		data = new ArrayList<Integer>();
		for (int idx = 0; idx < size; idx++) {
			data.add(idx * 5);
		}
	}

	public void process(Predicate<Integer> filter, Consumer<Integer> response) {
		for (Integer value : data) {
			if (filter.test(value)) {
				response.accept(value);
			}
		}
	}

	public List<Integer> getData() {
		return data;
	}

	public static void main(String[] args) {
		Filter filter = new Filter(100);

		// print out filter results
		System.out.println("Less than 70...");
		filter.process(v -> (v <= 300), v -> {
			System.out.print("before: ");
			System.out.print(v + ", ");
		});
		System.out.print("\n");

		// java 8 way...  print all numbers  > 100
		filter.getData().stream().filter(v -> (v > 100)).map(v -> v * 10).map(v -> v / 5).forEach(v -> System.out.println(v));

	}

}
