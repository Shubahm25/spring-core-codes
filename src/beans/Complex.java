package beans;

import java.util.*;

/**
 * Created by shubham on 7/4/17.
 */
public class Complex
{

    List<String>list=new ArrayList<>();
    Set<String>set=new HashSet<>();
    Map<String,String>map=new HashMap<>();

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
   public void display()
{
   Iterator<String> iterator=  getList().iterator();
    while (iterator.hasNext())
    {
        String subjects=iterator.next().toString();
        System.out.println(subjects);
    }
    System.out.println("-------------------Set-------------------------");
Iterator<String> iteratorr=getSet().iterator();
while(iteratorr.hasNext())
{
    String set=iteratorr.next().toString();
    System.out.println(set);
}
    System.out.println("-------------------Map-------------------------");
Set set=getMap().entrySet();
Iterator itr=set.iterator();
while (itr.hasNext())
{
    Map.Entry Entry=(Map.Entry)itr.next();
    System.out.println("Key:"+ Entry.getKey()+ "\t\t"+"Value:"+Entry.getValue());
}

}
}
