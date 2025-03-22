package day5_training;

import java.util.Stack;

/*
 * /*
 * --Stack class inherits Vector class and also implements List interface!
 * --LIFO(Last In First Out) principle=>BACKSPACE BUTTON & CTRL+Z(UNDO)
 
 */
/*
 * Application of Stack in Real Life
Stack is used very often in real life, even normal people use the application of 
Stack in their daily life routines. Here is some example of the stack in real-life. 
Below are the 10 Applications of Stack in Real Life.

Women’s Bangles: Women wear a bangle one by one and to pull the first one they have to first pull out the last one.
Books and Clothes: Piled on top of each other is a great example of the stack.
Floors in a Building: If a person is living on the top floor and wants to go outside, he/she first needs to 
land on the ground floor.
Browsers: Web browsers use the stack to keep track of the history of websites if you click back then the previous 
site opens immediately.
Mobile Phone Call Logs: Call logs in mobiles to use the stack, to get a first-person call log you have to scroll.
Companies: When a company want to reduce its workforce. Typically they follow “last hired, first fired”
Garage: If a garage is not wide enough. To remove the first car we have to take out all the other cars after it.
Tubewell Boring Machine: Tubewell boring machines use a stack to pull or push same as a stack
Text Editors: Undo or Redo mechanism in the Text Editors(Excel, Notepad or WordPad etc.)
The CD/DVD stand
 */
class Item
{
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{name='" + name + "', price=" + price + "}";
    }
}

public class Collection_StackDemo1 {

	public static void main(String[] args) {
		 Stack<Item> itemStack = new Stack<>();
		 
		   Item item1 = new Item("Laptop", 89900.99);
	        Item item2 = new Item("Phone", 39939.49);
	        Item item3 = new Item("Headphones", 1500.89);
	        
	     // Push items onto the stack
	        itemStack.push(item1);
	        itemStack.push(item2);
	        itemStack.push(item3);
	        
	        // Pop items from the stack (LIFO)
	        System.out.println("Popped item: " + itemStack.pop());
	        System.out.println("Popped item: " + itemStack.pop());
	        
	     // Peek at the top item without removing it
	        System.out.println("Top item: " + itemStack.peek());
	
	        // Check if the stack is empty
	        System.out.println("Is the stack empty? " + itemStack.isEmpty());
	
	        System.out.println("Popped item: " + itemStack.pop());;//after this stack is empty!
	        //System.out.println("Popped item: " + itemStack.pop());;//throws  java.util.EmptyStackException
	        
	        System.out.println("Is the stack empty? " + itemStack.isEmpty());
	    	
	        
	    	
	}

}
/*
 * Popped item: Item{name='Headphones', price=1500.89}
Popped item: Item{name='Phone', price=39939.49}
Top item: Item{name='Laptop', price=89900.99}
Is the stack empty? false
Popped item: Item{name='Laptop', price=89900.99}
Is the stack empty? true
*/