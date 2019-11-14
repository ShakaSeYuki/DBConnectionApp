package app.connection.db;

public class Greeting {
	private final long ids;
    private final String content;

    public Greeting(long ids, String content) {
        this.ids = ids;
        this.content = content;
    }

    public long getId() {
        return ids;
    }

    public String getContent() {
        return content;
    }
}
