//Default modifier main
// Java program to illustrate error while 
// using class from different package with 
// default modifier 
package p2; 
//import p1.*; 

// This class is having default access modifier 
class GeekNew 
{ 
    public static void main(String args[]) 
    { 
        // Accessing class Geek from package p1 
       // Geek obj = new Geek(); 
       // un commenting these lines give error
       // obj.display(); 
    } 
}