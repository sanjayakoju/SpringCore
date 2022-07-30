package profiling;

public class DbService {
    private String db_url;

    public void connect() {
        System.out.println("Connected to "+db_url);
    }

    public String getDb_url() {
        return db_url;
    }

    public void setDb_url(String db_url) {
        this.db_url = db_url;
    }
}
