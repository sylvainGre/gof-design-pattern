# Gof Design Pattern

### Creational Design Patterns

| Pattern name     | description |
| --- | --- |
| [Singleton](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/creational/singleton) | The singleton pattern restricts the initialization of a class to ensure that only one instance of the class can be created. |
| [Factory](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/creational/factory) | The factory pattern takes out the responsibility of instantiating a object from the class to a Factory class.               |
| [Abstract Factory](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/creational/abstractFactory) | Allows us to create a Factory for factory classes.                                                                          |
| [Builder](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/creational/builder) | Creating an object step by step and a method to finally get the object instance.                                         |
| [Prototype](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/creational/prototype) | Creating a new object instance from another similar instance and then modify according to our requirements.                 |

### Structural Design Patterns

| Pattern name     | description |
| --- | --- |
| [Adapter](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/structural/adapter)	|Provides an interface between two unrelated entities so that they can work together.|
| [Composite](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/structural/composite)|	Used when we have to implement a part-whole hierarchy. For example, a diagram made of other pieces such as circle, square, triangle, etc.|
| [Proxy](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/structural/proxy) |	Provide a surrogate or placeholder for another object to control access to it.|
| [Flyweight](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/structural/flyweight)	|Caching and reusing object instances, used with immutable objects. For example, string pool.|
| [Facade](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/structural/facade)|	Creating a wrapper interfaces on top of existing interfaces to help client applications.|
| [Bridge](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/structural/bridge) |The bridge design pattern is used to decouple the interfaces from implementation and hiding the implementation details from the client program.|
| [Decorator](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/structural/decorator)	| The decorator design pattern is used to modify the functionality of an object at runtime.|

### Behavioral Design Patterns

| Pattern name | description |
| --- | --- |
| [Template Method](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/behavioral/templateMethod)	| used to create a template method stub and defer some of the steps of implementation to the subclasses.|
|[Mediator](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/behavioral/mediator)	|used to provide a centralized communication medium between different objects in a system.|
|[Chain of Responsibility](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/behavioral/chainOfReponsibility)	|used to achieve loose coupling in software design where a request from the client is passed to a chain of objects to process them.|
|[Observer](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/behavioral/observer)|	useful when you are interested in the state of an object and want to get notified whenever there is any change.|
|[Strategy](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/behavioral/strategy)|	Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.|
|[Command](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/behavioral/commmand)|	Command Pattern is used to implement lose coupling in a request-response model.|
|[State](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/behavioral/state) |	State design pattern is used when an Object change it’s behavior based on it’s internal state.|
|[Visitor](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/behavioral/visitor)|	Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects.|
|[Interpreter](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/behavioral/interpreter)|	defines a grammatical representation for a language and provides an interpreter to deal with this grammar.|
|[Iterator](https://github.com/sylvainGre/gof-design-pattern/tree/master/src/behavioral/iterator)|	used to provide a standard way to traverse through a group of Objects.|
|Memento|	The memento design pattern is used when we want to save the state of an object so that we can restore later on.|

Source https://www.journaldev.com/31902/gangs-of-four-gof-design-patterns
