package railway.management;

import java.util.*;

public class LoadingandUnloading {

    String Things;
    String Loaded;

    LoadingandUnloading() {
    }

    ;
    LoadingandUnloading(String Things, String Loaded) {
        this.Things = Things;
        this.Loaded = Loaded;
    }

    public String Load() {
        return Loaded + ": " + Things;
    }

    public static void printUL(LinkedList<LoadingandUnloading> obj) {
        Iterator it = obj.iterator();
        LoadingandUnloading lb = new LoadingandUnloading();
        System.out.print("[ ");
        while (it.hasNext()) {
            lb = (LoadingandUnloading) it.next();
            if (lb == null) {
                System.out.print("null ");
            } else {
                System.out.print(lb.Loaded + " " + lb.Things + " ");
            }
        }
        System.out.println("]");
    }

    public void Goods() {

        Scanner in = new Scanner(System.in);

        LinkedList stds = new LinkedList();

        //aggregation
        LoadingandUnloading[] stdarr = new LoadingandUnloading[10];

        for (LoadingandUnloading std : stdarr) {
            stds.add(std);
        }
        System.out.println("The Passenger's Goods are: " + stds);
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while (choice != 9) {
            System.out.println();
            System.out.print("Press 1 to add at new place\t\t"
                    + "Press 2 to add at particular  Location\t\t"
                    + "Press 3 to add at First Location\n\n"
                    + "Press 4 to add at Last\t\t\t"
                    + "Press 5 to remove the Last Location\t\t"
                    + "Press 6 to remove at First Location\n\n"
                    + "Press 7 to remove the Last location\t"
                    + "Press 8 If you want the list to be shown\t"
                    + "Press 9 to Exit :) ");
            String Things, Breifcase;
            LoadingandUnloading std;
            int index;
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter name of Passenger: ");
                    Things = in.next();
                    System.out.print("Enter breifcase No.: ");
                    Breifcase = in.next();
                    std = new LoadingandUnloading(Things, Breifcase);
                    stds.add(std);
                    System.out.print("Now the list is: ");
                    System.out.println(stds.toString());
                    break;
                case 2:
                    System.out.print("Enter name of Passenger: ");
                    Things = sc.next();
                    System.out.print("Enter breifcase No.: ");
                    Breifcase = sc.next();
                    System.out.print("Enter location no.: ");
                    index = sc.nextInt();
                    std = new LoadingandUnloading(Things, Breifcase);
                    stds.add(index, std);
                    System.out.print("Now the list is: ");
                    printUL(stds);
                    break;
                case 3:
                    System.out.print("Enter name of Passenger: ");
                    Things = in.next();
                    System.out.print("Enter breifcase No.: ");
                    Breifcase = in.next();
                    std = new LoadingandUnloading(Things, Breifcase);
                    stds.addFirst(std);
                    System.out.print("Now the list is: ");
                    System.out.println(stds);
                    break;
                case 4:
                    System.out.print("Enter name of Passenger: ");
                    Things = in.next();
                    System.out.print("Enter breifcase No.: ");
                    Breifcase = in.next();
                    std = new LoadingandUnloading(Things, Breifcase);
                    stds.addLast(std);
                    System.out.print("Now the list is: ");
                    System.out.println(stds);
                    break;
                case 5:
                    System.out.print("Enter location to remove: ");
                    index = in.nextInt();
                    stds.remove(index);
                    System.out.print("Now the list is: ");
                    System.out.println(stds);
                    break;
                case 6:
                    stds.removeFirst();
                    System.out.print("Now the list is: ");
                    System.out.println(stds);
                    break;
                case 7:
                    stds.removeLast();
                    System.out.print("Now the list is: ");
                    System.out.println(stds);
                    break;
                case 8:
                    System.out.println("The list is: ");
                    System.out.println(stds);
                    break;
            }
        }
    }
}
