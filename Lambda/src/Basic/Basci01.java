package Basic;

import java.util.function.Function;

public class Basci01 {
	public static void main(String[] args) {
		
		Function<Integer, Integer> square = i->i*i;
		System.out.println(square.apply(10));
	}
}
