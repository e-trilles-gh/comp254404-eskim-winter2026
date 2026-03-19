package Exercise1;/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
//package lists;

import java.util.Iterator;

/**
 * An interface for positional lists.
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 * @see Position
 */
public interface PositionalList<E> extends Iterable<E> {

    /**
     * Returns the number of elements in the list.
     * @return number of elements in the list
     */
    int size();

    /**
     * Tests whether the list is empty.
     * @return true if the list is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the first Exercise1.Position in the list.
     *
     * @return the first Exercise1.Position in the list (or null, if empty)
     */
    Position<E> first();

    /**
     * Returns the last Exercise1.Position in the list.
     *
     * @return the last Exercise1.Position in the list (or null, if empty)
     */
    Position<E> last();

    /**
     * Returns the Exercise1.Position immediately before Exercise1.Position p.
     * @param p   a Exercise1.Position of the list
     * @return the Exercise1.Position of the preceding element (or null, if p is first)
     * @throws IllegalArgumentException if p is not a valid position for this list
     */
    Position<E> before(Position<E> p) throws IllegalArgumentException;

    /**
     * Returns the Exercise1.Position immediately after Exercise1.Position p.
     * @param p   a Exercise1.Position of the list
     * @return the Exercise1.Position of the following element (or null, if p is last)
     * @throws IllegalArgumentException if p is not a valid position for this list
     */
    Position<E> after(Position<E> p) throws IllegalArgumentException;

    /**
     * Inserts an element at the front of the list.
     *
     * @param e the new element
     * @return the Exercise1.Position representing the location of the new element
     */
    Position<E> addFirst(E e);

    /**
     * Inserts an element at the back of the list.
     *
     * @param e the new element
     * @return the Exercise1.Position representing the location of the new element
     */
    Position<E> addLast(E e);

    /**
     * Inserts an element immediately before the given Exercise1.Position.
     *
     * @param p the Exercise1.Position before which the insertion takes place
     * @param e the new element
     * @return the Exercise1.Position representing the location of the new element
     * @throws IllegalArgumentException if p is not a valid position for this list
     */
    Position<E> addBefore(Position<E> p, E e)
            throws IllegalArgumentException;

    /**
     * Inserts an element immediately after the given Exercise1.Position.
     *
     * @param p the Exercise1.Position after which the insertion takes place
     * @param e the new element
     * @return the Exercise1.Position representing the location of the new element
     * @throws IllegalArgumentException if p is not a valid position for this list
     */
    Position<E> addAfter(Position<E> p, E e)
            throws IllegalArgumentException;

    /**
     * Replaces the element stored at the given Exercise1.Position and returns the replaced element.
     *
     * @param p the Exercise1.Position of the element to be replaced
     * @param e the new element
     * @return the replaced element
     * @throws IllegalArgumentException if p is not a valid position for this list
     */
    E set(Position<E> p, E e) throws IllegalArgumentException;

    /**
     * Removes the element stored at the given Exercise1.Position and returns it.
     * The given position is invalidated as a result.
     *
     * @param p the Exercise1.Position of the element to be removed
     * @return the removed element
     * @throws IllegalArgumentException if p is not a valid position for this list
     */
    E remove(Position<E> p) throws IllegalArgumentException;

    /**
     * Returns an iterator of the elements stored in the list.
     * @return iterator of the list's elements
     */
    Iterator<E> iterator();

    /**
     * Returns the positions of the list in iterable form from first to last.
     * @return iterable collection of the list's positions
     */
    Iterable<Position<E>> positions();
}
