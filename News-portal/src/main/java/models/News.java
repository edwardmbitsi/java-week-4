package models;

import java.util.Objects;

public class News {
    private String post;
    private  int id;

    public News(String post) {
        this.post = post;

    }


    public String getPost() {
        return post;
    }

    public int getId() {
        return id;
    }

    public void setPost(String post) {
        this.post = post;
    }


    public void setId(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News)) return false;
        News news = (News) o;
        return getId() == news.getId() &&
                Objects.equals(getPost(), news.getPost());
    }

    @Override
    public int hashCode() {
        return Objects.hash(post, id);
    }
}