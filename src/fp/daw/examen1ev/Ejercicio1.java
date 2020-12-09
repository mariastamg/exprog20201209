package fp.daw.examen1ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char [] v = in.readLine().toLowerCase().toCharArray();
		Arrays.sort(v);
		System.out.println(Arrays.toString(v));
	}

}
