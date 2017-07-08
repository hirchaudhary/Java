import java.util.HashMap;

class Map {
    public void hashMap() {
        HashMap<String,String> hm=new HashMap<String,String>();
        hm.put("Faith","I need a little space in my mind I need that little hope I can find I need a little need a little faith");
        hm.put("Outside", "Look at what you've done Stand still, falling away from me When it takes so long");
        hm.put("Colors", "Now I don't care what you dress like Or what you wear But please make sure baby");
        hm.put("The Rain", "She's the type of girl that makes you feel better It don't matter how you used to feel She's the kind of girl that follows good weather");
        String name = hm.get("The Rain");
        System.out.println("The Rain: "+name);
        for (String key : hm.keySet()) {
            System.out.println("Title: "
            +key);
            System.out.println("Lyrics: "
            +hm.get(key));
        }
    }
}
