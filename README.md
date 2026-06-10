[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=24074024)
# testingObjectsWithJava

Write your answers to your reflection questions here. Write your name, the date and the answers.

Joshua Coquia

June 9, 2026

## Answers

* **Checkpoint Q1:** Printing an object with no `toString` methods shows the class name and a hex hash. This is because Java's default `Object.toString()` method implementation for a class returns that class' name plus its hex hash.

* **Checkpoint Q2:** The variables `name` and `breed` are reference types (both being Strings), while `age` is a primitive type (int).

```bash
Printing dog1 directly:

Defaults for d1 fields (before any assignment):
name = null
age = 0
breed = null
```

* **Experiment:** I get 3 compile errors that look identical. I pasted first instance below; it repeats for lines 8 and 14. It's saying that I can't compile because the only remaining Dog constructor expects arguments that I'm not passing in.

```
Main.java:4: error: constructor Dog in class Dog cannot be applied to given types;
                Dog dog1 = new Dog();
                           ^
  required: String,int,String
  found:    no arguments
  reason: actual and formal argument lists differ in length
```

* **Checkpoint Q3:** The new constructors allow the class to be assigned values upon initialization, with more sensible, dev provided defaults than the default values for each variable that Java provides.

* **Checkpoint Q4:** Between the two steps, the output of `System.out.println(d1);` and other Dog objects became more useful after overriding the `Dog.toString()` method because it gave relevant values for the `Dog` object's instance as opposed to simply printing out information about the literal object's instance itself. `@Override` is useful because it enables a class to override default Java behavior; in this case, it enables the overriding of the `toString()` method.

Make sure to push your code to your repo!
