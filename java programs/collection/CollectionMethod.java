/*
Collection(1.2 v) i-->
* if we want a group of individual object as a single entity then we should go for collection
Methods :-
@ boolean add(Object o)
@ boolean addAll(Collection c)
@ boolean remove(Object o)
@ boolean removeAll(Collection c)
@ void clear() > remove all object and then size of collection is 0
@ boolean retainAll(Collection c) > remove all Object except this object
@ boolean contain(Object o) > check that available or not
@ boolean containAll(Collection c)
@ boolean isEmpty()
@ int size()
@ Object[] toArray()
@ Iterator iterator()

List(i, 1.2 v) >>>
 list is child interface of collection
--> duplicate allow 
--> insertion must be preserved 
Methods :-
@ void add(int index, Object o)
@ boolean addAll(int index, Collection c)
@ Object get(int index)
@ Object remove(int index)
@ Object set(int index , Object o) -> replace the present elements and return old elements 
@ int indexOf(object o)
@ int LastIndexOf(object o)


ArrayList(c, 1.2 v) >>>
--> underline data structure -resize able array
--> Duplicate allow
--> Insertion order preserved
--> Heterogeneous Object allow   
--> null allows 
initial capacity = 10;
once full their initial capacity then copy to new array 
new capacity = (old capacity*2/3) +1 

ArrayList l = new ArrayList();
ArrayList l = new ArrayList(int initialCapacity );
ArrayList l = new ArrayList(Collection c);

serializable(interface) :- usually we can use collection to hold and transfer objects from one location to anther location (container) 
to provide support for this requirement every collection class by default implements serializable and cloneable interface 

ArrayList and Vector class can implements random access 

public static List synchronizedList(List l)


###### LinkedList 

@ LinkedList l = new LinkedList()
@ LinkedList l = new LinkedList(Collection c)



Method  LinkedList :- for stack and queue specific

@# void addFirst()
@# void addLast()
@# Object getFirst()
@# Object getLast()
@# Object removeFirst()
@# Object removeLast()

Vector := underline data structure is array
-- Insertion order is preserved
-- duplicate allowed
-- heterogeneous object are allowed
-- null insertion is possible 
-- thread safe 

constructors :- 

Vector v = new Vector();
default initial capacity = 10
new capacity = old capacity * 2

Vector v = new Vector(int initialCapacity );

Vector v = new Vector(int initialCapacity , int incrementsCapacity ); // this facility not in ArrayList

Vector v = new Vector(Collection c );


Methods :- 

@#  addElements(Object o);
@#  removeElements(Object o);
@#  removeElementsAt(int index);
@#  removeAllElements();
@#  firstElements();
@#  lastElements();
@# int size()
@# int capacity()
@#  Enumeration

stack :- child lass of vector 

constructor : Stack s = new Stack()

Method : 

@# Object push(Object o) 
@# Object pop()
@# Object peek()
@# boolean empty()
@# int search(Object o) // if not available then return -1

The 3 cursor of java

1. Enumeration e = v.elements();
public boolean hasMoreElemets();
public Object nextElemets();

Limitation :- its only use for legacy class 
no way to get elements  


public Iterator iterator()
2. Iterator itr = c.iterator();
it is universal cursor it use all collection class 
both read and remove operation   
Methods:- 
public boolean hasNext()
public Object next()
public void remove()

Limitation :- 
=- we can always move only foreword direction 
=- it can not add any object or replace 


public ListIterator listIterator()
3. ListIterator litr = c.listIterator();
it child interface of iterator 
Methods:- 

public boolean hasNext()
public Object next()
public int nextIndex() --- this three method for foreword direction

public boolean hasPrevieous()
public Object previous()
public int previousIndex()

public void remove()
public void add(Object o)
public void set(Object o)


by this we can move foreword or back word direction
by this we can perform replacements and addition of new objects in addition to read and remove operations

its only use for list interface Objects

HashSet :-

## HashSet h = new HashSet();
default initial capacity = 16
fill ratio = 0.75

## HashSet h = new HashSet(int initialCapacity)

## HashSet h = new HashSet(int initialCapacity, float fillRatio)

## HashSet h = new HashSet(Collection c)



LinkedHashSet :- LinkedList + HashTable 

insertion order preserved 
duplicated not allow

SortedSet :-
Method :-
Object first()
Object last()
SortedSet tailSet(Object o)
SortedSet headSet(Object o)
SortedSet subSet(Object o,Object o1)
Comparator comparator()
