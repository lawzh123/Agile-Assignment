/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author User
 */
public interface ArrayListInterface<T> {
    //To add new item into the array
    public boolean Add(T newItem);
    
    //To delete item(given index) from the array
    public boolean remove(int i);
    
    //To update the array in specified index
    public boolean replace(int index,T item);
    
    //Retrieve data from specified index
    public T get(int index);
    
    //To retrieve the total array size
    public int size();
    
    
    //To check the array is empty or not 
    public boolean isEmpty();
    
    //To clear the array and set array size to 0
    public void clear();
    
}
