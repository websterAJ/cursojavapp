/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
// POGO for grouping multiple fields
final class Person
{
	public String name;
	public int age;
	public char gender;

	public Person(String name, int age, char gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

    Person(Scanner name, int age, char gender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class practica5
{

    private static String name;
    private static int age;
    private static char gender;

	public static Person getDetails()
	{
            Scanner x;        
            x = new Scanner(System.in);
            System.out.println("Ingrese Nombre: ");
            name=x.next(); 

            Scanner y;        
            y = new Scanner(System.in);
            System.out.println("Ingrese Edad: ");
            age=y.nextInt(); 

            Scanner z;        
            z = new Scanner(System.in);
            System.out.println("Ingrese Genero: ");
            gender = z.next().charAt(0);
//            gender=z.nextChar();          
		// return person details from the method
//		int age = 25;
		char gender = 'M';     
		return new Person(name, age, gender);
	}

	// Return multiple values from a method in Java
	public static void main(String[] args)
	{
		Person person = getDetails();
		System.out.println("Name is " + person.name);
		System.out.println("Age is " + person.age);
		System.out.println("Gender is " + person.gender);
	}
}    

