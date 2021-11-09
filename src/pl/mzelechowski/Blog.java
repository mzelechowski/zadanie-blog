package pl.mzelechowski;

import java.util.ArrayList;
import java.util.List;

public class Blog implements BlogAction {
    private List<User> users;
    private List<Post> posts;

    public Blog() {
        this.users=new ArrayList<>();
        this.posts=new ArrayList<>();
    }


    @Override
    public void publishPost(int userId, String content) {

    }

    @Override
    public void commentPost(int userId, int postId, String content) {

    }

    @Override
    public Post findPost(int postId) {
        return null;
    }

    @Override
    public User findUser(int userId) {
        return null;
    }

    @Override
    public void displayUserEntries(int userId) {

    }
}
