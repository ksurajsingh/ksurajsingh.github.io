# Approach 1 

O(n/2)
<br><br>

#####  Using a flag like ```isPrime```, only acknowledges the flag, but the loop keeps running
```java
div=2;
while(div <=n/2){
    if(n % div == 0){
       System.out.println("composite, divisible by " + " "+ div)
        isPrime=flase;
    }
}

if(isPrime){
    System.out.println("Prime");
}
else
    System.out.println("Prime");

```

<br><br>


#####  Instead use return keyword
```java
div=2;
while(div <=n/2){
    if(n % div == 0){
       System.out.println("composite, divisible by " + " "+ div)
       return ;  // the code after this is obviously not iterated in runtime when found composite
    }
}

    System.out.println("Prime");
```
