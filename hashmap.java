import java.util.HashMap;
class hash{
    public static void main (String [ ] args){
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England","London");
        capitalCities.put("France","Paris");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Kenya","Nairobi");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));
        capitalCities.remove("England");
        System.out.println(capitalCities);
    }
}
