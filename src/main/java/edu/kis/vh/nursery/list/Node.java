package edu.kis.vh.nursery.list;

/**
 * Przechowuje zmienną całkowitą i następny oraz poprzedni węzeł
 * @author Rafal Barabasz
 */
public class Node {

	public int value;
	public Node prev, next;

	/**
	 * Przypisanie wartości i do zmiennej value
	 * @param i - Zmienna całkowita
	 */
	public Node(int i) {
		value = i;
	}
	
}
