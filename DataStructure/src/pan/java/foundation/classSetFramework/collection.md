##十八章 类集框架：所有的collection子接口都实现了iterator接口

##collection的两个子接口：Set和List
##collection的和核心操作:
* add(T t)
* addAll(Collection<? extends T> c)
* boolean contains(Objeect obj)
* void clear()
* boolean remove(Object obj)
* Object[] toArray()
* Iterator<T> iterator

##List:允许存储重复数据的集合
* T get(int index)
* T set(int index,T e)
* ListIterator<T> listIterator()
* List<E> of(...elements)
* void foreach(function)

##Set存储不允许重复数据的集合