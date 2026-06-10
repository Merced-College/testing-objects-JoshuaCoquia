[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=24074024)
# testingObjectsWithJava

Joshua Coquia

June 9, 2026

* [Checkpoint Answers](#checkpoints)
* [Reflection](#reflection)

## Checkpoints

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

* **Checkpoint Q5:** Private fields can be preferred over public fields in most situations because it enables a developer to restrict those private fields to have certain values to either avoid undefined/unexpected behavior or disallow certain values. For example, a count of a user's `itemsOrdered` at a store should always be greater than or equal to 0, since a user cannot purchase a negative number of items. The setter `setItemsOrdered` would accept an int and force the value to be `>= 0` before setting the actual value of `itemsOrdered`.

## Reflection

* **Reflection 1:** Before `toString`, whenever I printed an object, I got "**Object@<hex>**", because I had not overriden the default behavior of `toString`, meaning that I used Java's implementation which would print the aforementioned string.
* **Reflection 2:**
    * name: null
    * overallGradePercentage: 0.0
    * assignmentCount: 0
* **Reflection 3:** After adding my default constructor, the `name` field had a default value of `"Course"` instead of `null`. After adding the parameterized constructor, it was possible to set values for each field in Course when instantiating a Course object.
* **Reflection 4:** Add `@Override` to `toString()` to denote that an parent class' method is being superseded in a child class, throwing errors when a method in the child is declared incorrectly and therefore not actually overriding a method from the parent class.
    * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Override.html
* **Reflection 5:** Encapsulation is preferred over public fields because it enables the developer to abstract away fields, only allowing read/write access to whatever the end-user (in this case another developer or even the same developer) needs. This is good practice to avoid suprises/inconsistencies later on in larger codebases. As an example of a validation rule that can be added to a setter, some values, like the of a given object being tracked, cannot be negative, so the setter may have a `if (value < 0)` check where it can either throw an error or quietly set `value = 0` before setting the private field.
