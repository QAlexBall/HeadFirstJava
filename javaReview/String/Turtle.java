import java.io.*;
import java.util.*;

public class Turtle {
	private String name;
	private Formatter f;
	public Turtle(String name, Formatter f) {
		this.name = name;
		this.f = f;
	}
	public void move(int x, int y) {
		f.format("%s The Turtle is at (%d, %d)\n", name, x, y);
	}

	public static void main(String[] args) {
		PrintStream outalias = System.out;

		Turtle tommy = new Turtle("Tommy", 
			new Formatter(System.out));
		Turtle terry = new Turtle("Terry",
			new Formatter(outalias));

		tommy.move(0, 0);
		terry.move(4, 8);
	}
}