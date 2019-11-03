package bm;

import bakasoft.json.Json;

public class Bm {

    public static void main(String[] args) {
        try {
            BmSuite suite = new BmSuite("../bm-core/bm.json");

            suite.parseSourceFiles();

            System.out.println(Json.stringify(suite, 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
