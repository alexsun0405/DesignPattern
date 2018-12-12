谁知道什么
section3中
Main类并不知道（没有调用）Builder类，它只调用了Direct类的construct方法。

Director类知道Builder类，它调用Builder类的方法来编写文档，但是它不知道“真正”使用的是
哪个子类。

只有不知道子类，才能替换。

正是因为不知道才能够替换，正是因为可替换，组件才具有高价值。