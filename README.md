# daily-design-patterns-java

Java implementation of Matthew Jones's Daily Design Patterns series.

## Based on the following:

[Design Patterns in C# - blog posts](https://exceptionnotfound.net/introducing-the-daily-design-pattern/)

[Design Patterns in C# - repo](https://github.com/exceptionnotfound/DesignPatterns)

[Design Patterns Quick Reference](http://www.mcdonaldland.info/files/designpatterns/designpatternscard.pdf)

## Descriptions

1. [Factory Method](01_factory_method/description.md)
2. [Abstract Factory](02_abstract_factory/description.md)
3. [Facade](03_facade/description.md)
4. [Adapter](04_adapter/description.md)
5. [Bridge](05_bridge/description.md)
6. [Template Method](06_template_method/description.md)
7. [Iterator](07_iterator/description.md)
8. [Observer](08_observer/description.md)
9. [Memento](09_memento/description.md)
10. [Prototype](10_prototype/description.md)
11. [Singleton](11_singleton/description.md)
12. [Flyweight](12_flyweight/description.md)
13. [Builder](13_builder/description.md)
14. [State](14_state/description.md)
15. [Strategy](15_strategy/description.md)
16. [Proxy](16_proxy/description.md)
17. [Decorator](17_decorator/description.md)
18. [Chain of Responsibility](18_chain_of_responsibility/description.md)
19. [Visitor](19_visitor/description.md)
20. [Composite](20_composite/description.md)
21. [Mediator](21_mediator/description.md)
22. [Command](22_command/description.md)

## Running the examples
All example code was written using Java 17, please make sure you have it installed and configured in your environment.

Many of the examples can be launched simply from your IDE (IntelliJ IDEA for example), but some of them are console applications and must be run from the command line.
This was a conscious choice and an ode to my laziness.

All the examples can be run from the command line using the following commands:
First run the following command in the root directory to compile the code:
```
mvn clean install
```
Then navigate to the directory of the example you want to run and run the following command:
```
01_factory_method>java -cp target\01_factory_method-1.0-SNAPSHOT.jar entrypoint.Program
```
Replace `01_factory_method` with the directory of the example you want to run. The `entrypoint.Program` is the main class for all the example modules.

## Disclaimer

After a quick glance you may notice that the code is not exactly the same as the original C# code. I've made some changes to the code to make it more idiomatic to Java.
You may notice that in the examples I've not used the typical naming conventions for packages and maven groupIds / artifactIds. 
This was a conscious choice to keep all the examples as abstract and simple as possible.

You can read about the naming conventions that I didn't follow in the following links:

[Maven naming conventions](https://maven.apache.org/guides/mini/guide-naming-conventions.html)

[Java package name conventions](https://docs.oracle.com/javase/specs/jls/se6/html/packages.html#7.7)

## License

This project is licensed under the BSD 3-Clause license - see the [LICENSE](LICENSE) file for details