//package Collection;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class HashMapEX {
//
//
//    String name;
//    int id;
//
//    public HashMapEX(String name,int id)
//    {
//        this.name=name;
//        this.id=id;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj)
//            return  true;
//        if(obj ==null ||obj.getClass()!=this.getClass())
//            return  false;
//
//        HashMapEX hashh=(HashMapEX) obj;
//        return  (hashh.name.equals(this.name)&& this.id==hashh.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return id;
//    }
//
//}
//
//class GFG
//{
//    public static void main(String[] args) {
//
//
//        HashMapEX ex=new HashMapEX("batra",1);
//        HashMapEX ex1=new HashMapEX("batra",2);
//
//        Map<HashMapEX,String> map=new HashMap<>();
//        map.put(g1,"batra");
//        for(HashMapEX hashh: map.keySet())
//        {
//            System.out.println(map);
//        }
//    }
//}
