package 运动员和教练案列_优;
//说英语的接口
public interface SpeakEnglish {
    public abstract void speak();
}
//接口是抽象方法的集合。如果一个类实现了某个接口，那么它就继承了这个接口的抽象方法。这就像契约模式，如果实现了这个接口，那么就必须确保使用这些方法。接口只是一种形式，接口自身不能做任何事情。
/*接口可以理解为：接口是一系列方法和特征的集合。（方法和特征是类的组成部分）

接口只是一个框架而没有实现，因此在接口定义时不需要考虑接口中的方法如何实现。
利用接口可达到实现多继承的目地。可以在不暴露对象的类的前提下，暴露对象的编程接口。
不用强迫类关系在无关类中截获相似处(采用适配器就可以了)。声明想执行的一个或多个方法。

那么为何要定义接口？以及接口有何意义呢？
定义接口有利于代码的规范：对于一个大型项目而言，架构师往往会对一些主要的接口来进行定义，或者清理一些没有必要的接口。这样做的目的一方面是为了给开发人员一个清晰的指示，告诉他们哪些业务需要实现；同时也能防止由于开发人员随意命名而导致的命名不清晰和代码混乱，影响开发效率。
有利于对代码进行维护：比如你要做一个画板程序，其中里面有一个面板类，主要负责绘画功能，然后你就这样定义了这个类。可是在不久将来，你突然发现现有的类已经不能够满足需要，然后你又要重新设计这个类，更糟糕是你可能要放弃这个类，那么其他地方可能有引用他，这样修改起来很麻烦。如果你一开始定义一个接口，把绘制功能放在接口里，然后定义类时实现这个接口，然后你只要用这个接口去引用实现它的类就行了，以后要换的话只不过是引用另一个类而已，这样就达到维护、拓展的方便性。
保证代码的安全和严密：一个好的程序一定符合高内聚低耦合的特征，那么实现低耦合，定义接口是一个很好的方法，能够让系统的功能较好地实现，而不涉及任何具体的实现细节。这样就比较安全、严密一些，这一思想一般在软件开发中较为常见。
*/