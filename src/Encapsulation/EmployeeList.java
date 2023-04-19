//package Encapsulation;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class EmployeeList implements  Comparable<EmployeeList> {
//
//
//    private String name;
//    private int  id;
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public EmployeeList(String name, int id) {
//        this.name = name;
//        this.id = id;
//    }
//
//
//    @Override
//    public int compareTo(EmployeeList emp)
//    {
//        return  this.id-emp.id;
//
//
////        if(this.name.compareTo(name) !=0)
////        {
////            return  this.name.compareTo(name);
////        }
////        else
////        {
////           return this.name-emplame;
////        }
//
//
//     }
//
//    @Override
//    public String toString() {
//        return "EmployeeList{" +
//                "name='" + name + '\'' +
//                ", id=" + id +
//                '}';
//    }
//
//}
//
//class Main
//{
//    public static void main(String[] args) {
//        List<EmployeeList> emp=new ArrayList<>();
//        emp.add(new EmployeeList("batra",1));
//        emp.add(new EmployeeList("navidd",12));
//
//        Collections.sort(emp);
//
//        System.out.println("sortd list"+emp);
//
//    }
//}
//
//
