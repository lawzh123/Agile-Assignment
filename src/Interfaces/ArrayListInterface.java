/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

public interface ArrayListInterface<T> {

    /*
    boolean Add(T newItem)
    Description    : To add newItem into the end of the array.
    Post-condition : newItem added to the last empty space.
    Return         : True if adding is successful.
     */
    public boolean Add(T newItem);

    /*
    boolean remove(int i)
    Description    : To delete item at specified index from the array.
    Post-condition : The item at specified index is removed.
    Return         : True if deleting is successful.
     */
    public boolean remove(int index);

    /*
    boolean replace(int index,T item)
    Description    : To replace the item at specified index in the array.
    Post-condition : The item at specified index is replaced.
    Return         : True if replacing is successful.
     */
    public boolean replace(int index, T item);

    /*
    T get(int index)
    Description    : Retrieve item from specified index.
    Post-condition : The item in the array remain unchanged.
    Return         : The item at specified index.
     */
    public T get(int index);

    /*
    T[] get(int index)
    Description    : Get all items from the array.
    Post-condition : The item in the array remain unchanged.
    Return         : The item at specified index.
     */
    public T[] getAll();

    /*
    int size()
    Description    : To retrieve the total array size.
    Post-condition : The item in the array remain unchanged.
    Return         : The size of the array.
     */
    public int size();

    /*
    int size()
    Description    : To check the array is empty or not.
    Post-condition : The item in the array remain unchanged.
    Return         : true if the array is empty.
     */
    public boolean isEmpty();

    /*
    void clear()
    Description    : To remove all the item in the array.
    Post-condition : All the item in the array is removed.
     */
    public void clear();

    /*
    boolean copy(ArrayListInterface<T> anArray)
    Description    : Copy the items from another array into this array.
    Post-condition : The existing item will be replaced to the new array.
    Return         : True if copy successfully.
     */
    public boolean copy(ArrayListInterface<T> anArray);
}
