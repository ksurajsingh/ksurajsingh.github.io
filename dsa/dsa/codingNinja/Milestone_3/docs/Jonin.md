# Jonin [Rock Lee]

####  By Default 
- ```Non primitives``` are initialized with 0 
- While ```primitives``` are initialized with NULL

This is because in non-primitives you are crating an instance[object] of that class   <br>
while that class has already been declared somewhere and its attributes initialized as a primitve; <br>

in that particular class the primitive's values are NULL but when the same values are called by class reference that uses objects concepts and initializes the data type. 

## Access Modifiers 

```Private``` - only used inside its own function  [same program]  <br>
```default``` - only used insideits own package   [same package] <br>
```public``` - can be used from any package        [any package] <br><br>

to have an *idea* - there a packages[ folder ] which hold classes [ programs ]


if you want to use a class/method/function/variable that could be accessible by anywhere but only by authorised classes - then use ```protected``` 

## Getter Setter

- Its a convention to set ```getter``` and ```setter``` so that you can add constraints within the fuinction of get/set so that the forign user will only make changes only in a way that you allow <br>

- Study about the ```this``` keyword - its very easy - ```this``` is used to specify the inherent object of that particular class , the exact identify of that object is what is specified during function call  <br>

in short - ```this``` refers to the object that is calling the method/function off the other class


- ```final``` keyword is used to concretely set a value of a variable and you would never change it in the future

## Static

- This says that anyone who can access the static method/function is allowed to use it without an instance of the class or object creation <br>

- While without static you have to create an object to use that method/function [technical defination] <br>

- The way people say it is that the object shares that variable and can access without creating an instance of that object and hence at will point to the same reference <br>

[reverse dedcucing] - since all of the objects shares that variable - you can call it without specifying the identity of the object and still use / manipulate it

<br>*tho* you can still can it via the object's call , it is not necessary ! 


## Constructor 

- A method/function that does not have a return type 

- It doesn't return anything but initilizes the object instance with attributes specified in the constructor

<br> BTW when ever finding GCD use euclid's theorem = gcd(a,b) = gcd(b,a%b) . 

The difference between constructor and a method/function without a return type - <br>

```java

class student{
public student(String name){

    this.name=name;
}

public increment (int stdCount){ // this is not possible since java asks for a return type , add a return type
    
        stdNum++;

}

}
```

Here tho both are have no return types - only student is the constructor because its name matches the class name . Technically also, when a class is required you can just call it by its name like ```RockLee.studnet``` and you will have to specify the name as ```RockLee.student(RockLee)```.<br>

Here you have created the instance just the way the programmer wanted it to be - name to be mandatorily set! <br> 

while the increment need not have a mandatory effect as consider the case when there are no students - which would obviously mean that no objects/ instances of that class has been created yet but still you are able to fetch the number or increment the number as an advance expectation <br>

If you are inheriting a class - then you have to first construct the class you are inheriting IF YOU ARE HAVING A CONSTRUCTOR. as a instance of you cannot be created without whom you are inheriting i.r your parent <br><br> 

A proof of concept is where 
The parent has 2 constructors - one takes parameter [which is why it is called non-default] the other takes parameter [default] <br>

*if parent has a default constructor*  <br>
the child has to just move on with its constructor the default will be considered implicity <br>

*if the parent has a parameterised constructor* <br>
the child has to explicitly call the parameterised constructor , or else it will throw an error


## Encapsulation 

- Encapsulating objects in a particular class. 

## Inheritance 

- when you want to show traits of a parent in a child - i.e for example A ninja can have jutsus but an uchiha has dojutsu as well  <br>
so you can create a class called ninja which has attributes like jutsu , power , speed , chakra etc . . . <br> 
Make Uchiha extend ninja - as a uchiha is a ninja who is of a special type and bloodline <br>
same for hyuga


```java
class ninja{
  String name,rank,jutsu,chakra;
  int speed,power;
  public ninja(String name,String rank, int speed, int power){// When constructing a ninja , he may not have chakra like rocklee or jutsu like rocklee 
  this.name=name;
  this.rank=rank;
  this.speed=speed;
  this.power=power;

  }

  public void performJutsu(){
    System.out.println("Performing generic jutsu");
  }

  public void showDetails(){
    System.out.println("\nName:"+name+"\nRank:"+rank+"\nSpeed:"+speed+"\nPower:"+power);
  }
  
  
}

class uchiha extends ninja{ // every uchiha is a ninja and will the generic attributes by default
          String dojutsu; // something that is special to a ninja i.e not all ninjas have dojutsu

         public uchiha(String name, String rank,int speed, int power){// uchihas are generally fast so no need to specify their power - their dojutsu may or may not have been activated
          super(name,rank,speed,power); // using the parent class - ninja 

         }

    public void performJutsu(){
      System.out.println("Using sharingan");
    }
    public void performJutsu(int num){
      super.performJutsu();
    }
         public void dojutsuActivate(){
           this.dojutsu="beginner";
         }
         public void dojutsuActivate(String dojutsu){
           this.dojutsu=dojutsu;
         }


         public void showDetails(){
           System.out.println("\nName:"+name+"\nRank:"+rank+"\nPower:"+power+"\nSpeed:"+speed+"\nDojutsu:"+dojutsu);
         }

}

class hyuga extends ninja{
  String dojutsu ;

    public hyuga(String name,String rank, int speed,int power){
      super(name,rank,speed,power);
    }

    public void performJutsu(){
      System.out.println("Using byukugan");
    }
    public void performJutsu(int num){
      super.performJutsu();
    }

    public void dojutsuActivate(){
      this.dojutsu="beginner";
    }
    public void dojutsuActivate(String dojutsu){
      this.dojutsu=dojutsu;
    }

    public void showDetails(){
      System.out.println("\nName:"+name+"\nRank:"+rank+"\nPower:"+power+"\nSpeed:"+speed+"\nDojutsu:"+dojutsu);
    }


}
public class oops{
  public static void main(String[] args) {
    ninja n1 = new ninja("sakura","Jonin",20,40);
    ninja n2 = new ninja("ino","chunin",30,35);
    ninja n3 = new ninja("temari","Jonin",40,50);
    ninja n4 = new ninja("rocklee","Jonin",85,87);

    n1.showDetails();
    n2.showDetails();
    n3.showDetails();
    n4.showDetails();

    n1.performJutsu();
    n2.performJutsu();
    n3.performJutsu();
    n4.performJutsu();

    uchiha u1 = new uchiha("itachi","delusion",500,101);
    uchiha u2 = new uchiha("kidSasuke","academy",7,10);

    hyuga h1 = new hyuga("neji","Jonin",70,78);
    hyuga h2 = new hyuga("himawari","academy",1,2);

    System.out.println("\nBefore activating Dojutsu: \n");

    u1.showDetails();
    System.out.println();
    u2.showDetails();

    u1.dojutsuActivate("MongekyoSharingan");
    u2.dojutsuActivate();

    System.out.println("\n After activating Dojusu: \n");

    u1.showDetails();
    System.out.println();
    u2.showDetails();

    System.out.println("\nBefore activating Dojutsu: \n");

    h1.showDetails();
    System.out.println();
    h2.showDetails();

    h1.dojutsuActivate("Blinding");
    h2.dojutsuActivate();

    System.out.println("\n After activating Dojutsu: \n");
    
    h1.showDetails();
    System.out.println();
    h2.showDetails();
    
    System.out.println("\n\nUchiha performing a jutus\n\n");
    u1.performJutsu();
    System.out.println("\n\nHyuga performing a jutus\n\n");
    h1.performJutsu();

    System.out.println("\nUchiha practise: \n");
    u1.performJutsu(1);
    System.out.println("\nhyuga practise: \n");
    h1.performJutsu(1);

  }
}

```
<br>buhahaha ! you were scared weren't you ! , commit seppuku and go back to academy 
<br><br>
The code is too easy to understand for a Jonin. 

## OverRide 
The override ```@override``` 

is used to ask that compiler to verify proper overriding . if there is a type or parameter mismatch the compiler warns . It @override is not annoted then compiler treats the function as a new method/function .

## Rare mistake

Making a type point to another type as <br>

```java 
ninja n1 = new uchiha(jonin,5);
```

all uchihas are ninjas therefore when you call a ninja ,it can be a uchiha as well !

```java
uchiha u1 = new ninja(genin,1); // wrong
```
every ninja is not uchiha <br> 
but every uchiha is a ninja


here ```ninja n1``` references a ninja object and ```new uchiha(jonin,5)``` setup the ninja variable to contrust as a uchiha that can be stored in ninja ,  [as any uchiha]

but 

```uchiha u1``` referencing uchiha instance ```new ninja(genin,1)``` cannot setup uchiha as a variable to construst as ninja as that ninja can be hyuga as well.


## Recursion 

There is no need of explainatino - when you have a problem whose solution lies on the solution of some adjacent values - you can use recursion.   
 
As this is so simple - most of these problems already have a mathematical formual to solve in O(1); look it up .  

- Always start with the base case - which means what could be the solution for when the value is arithmatically the lowest and then build logic for further values .

### problems

- Basic problems for recursion could be sorting , searching algorithms .

# Binary Search 

- > [IMPORTANT] !! ONLY WORKS ON SORTED ARRAYS !!
- Has a time complexity of O(logn).
- Checks for the middle element in the first iteration 
- If the middle element is greater ,the array to the right of middle element is discarded .
- If the middle element is smaller than the required element to find, the array on the left is discarded .
- This compresses the search space by half at each iterations 


