package constants;

import static constants.Constants.PATH.SWAPI_PATH;
import static constants.Constants.Servers.*;

public class Constants {
    public static class runVariable{
        public static String server = JSON_PLACE_HOLDER_URL;
        public static String path = "";
    }
    public static class Servers{
        public static String SWAPI_URL = "https://swapi.dev/";
        public static String JSON_PLACE_HOLDER_URL = "https://jsonplaceholder.typicode.com/";
        public static String REQUEST_BIN_URL = "https://eoall123k06qxrp.m.pipedream.net";
        public static String GOOGLE_PLACES_URL;
    }
    public static class PATH{
        public static String SWAPI_PATH = "api/";
        public static String GOOGLE_PLACES_PATH;
    }
    public static class ACTIONS{
        //swapi
        public static String SWAPI_GET_PEOPLE = "people/";
        //google_places
        public static String GOOGLE_PLACES_PATH;
        //Json_Place_Holder
        public static String JSON_PLACE_HOLDER_GET = "comments/";
        public static String JSON_PLACE_HOLDER_PUT = "posts/1/";
        public static String JSON_PLACE_HOLDER_DELETE = "posts/1/";
        public static String JSON_PLACE_HOLDER_POST = "posts/";
    }
}
