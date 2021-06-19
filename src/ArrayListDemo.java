import java.util.*;
import java.util.stream.Collectors;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);

        //using enhanced loop
        for (int x : l) {
            System.out.print(x + " ");
        }
        System.out.println();

        //Using iterator
        Iterator<Integer> itr = l.listIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        System.out.println("Iterating using forEachRemaining() method");
        Iterator<Integer> newItr = l.iterator();
        newItr.forEachRemaining(element -> System.out.print(element + " "));

        // Getting ListIterator
        ListIterator<Integer> listIterator = l.listIterator();

        // Traversing elements
        System.out.println("Forward Direction Iteration:");
        while (listIterator.hasNext()) {
            System.out.println("Next element is " + listIterator.next() +
                    " and next index is " + listIterator.nextIndex());

        }

        // Traversing elements, the iterator is at the end at this point
        System.out.println("Backward Direction Iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println("Previous element is " + listIterator.previous() +
                    " and previous index is " + listIterator.previousIndex());
        }

        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        System.out.println("-------------------------------");
        System.out.println("Collections Sort");

        Collections.sort(list);
        System.out.println("ArrayList in asc order: " + list);

        System.out.println("-------------------------------");
        System.out.println("Using stream");
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("ArrayList in asc order: " + sortedList);

        Collections.sort(list,Collections.reverseOrder());
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        System.out.println("ArrayList in asc order: " + list);
        List<Integer> descSortedList=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("ArrayList in asc order: " + descSortedList);

        //compareTo
        ArrayList<Vehicle> vehicleList=new ArrayList<>();
        vehicleList.add(new Vehicle("Volkswagen",2010));
        vehicleList.add(new Vehicle("Audi",2009));
        vehicleList.add(new Vehicle("Ford",2001));
        vehicleList.add(new Vehicle("BMW",2015));
        Collections.sort(vehicleList);

        for(Vehicle v:vehicleList){
            System.out.println("Vehicle Brand: "+v.brand+", Vehicle MakeYear: "+v.makeYear);
        }

    }
}
